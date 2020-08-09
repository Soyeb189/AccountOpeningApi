package com.example.accountopeningapi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import com.example.accountopeningapi.Controller.ApiClint;
import com.example.accountopeningapi.Controller.ApiInterface;
import com.example.accountopeningapi.Model.AC_OPEN;
import com.example.accountopeningapi.Model.AcOpenConfirmation;
import com.google.gson.Gson;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.UnsupportedEncodingException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

import static com.example.accountopeningapi.JsonData.json;

public class MainActivity extends AppCompatActivity {
    public static String hex;
    String responseJson;
    String jsonData;
    String decryptJson;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        try {
            JsonData.createJson();
            jsonData= json;
        } catch (JSONException e) {
            e.printStackTrace();
        }

        setEncryptDrcrypt();

        networkCall();


    }



    private void setEncryptDrcrypt() {
        String key = "MyEncryptionKeyERA_AGENT_BANKING";
        Log.e("do_now_",encrypt(key, jsonData));
        //Log.e("do_now_result",decrypt(key,"0000000000000000", hex));
    }


    public static String encrypt(String key,String value) {
        try {
            String initVector = "0000000000000000";
            IvParameterSpec iv = new IvParameterSpec(initVector.getBytes("UTF-8"));
            SecretKeySpec skeySpec = new SecretKeySpec(key.getBytes("UTF-8"), "AES");

            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
            cipher.init(Cipher.ENCRYPT_MODE, skeySpec,iv);

            byte[] encrypted = cipher.doFinal(value.getBytes());

            //return Base64.getEncoder().encodeToString(encrypted);
            hex = byteArrayToHex(encrypted);
            return hex;
        } catch(UnsupportedEncodingException | NoSuchAlgorithmException
                | NoSuchPaddingException | InvalidKeyException
                | InvalidAlgorithmParameterException | IllegalBlockSizeException
                | BadPaddingException ex){
            System.out.println(ex.getMessage());

        }
        return null;
    }
    public static byte[] hexStringToByteArray(String s) {
        int len = s.length();
        byte[] data = new byte[len / 2];
        for (int i = 0; i < len; i += 2) {
            data[i / 2] = (byte) ((Character.digit(s.charAt(i), 16) << 4)
                    + Character.digit(s.charAt(i+1), 16));
        }
        return data;
    }
    public static String byteArrayToHex(byte[] a) {
        StringBuilder sb = new StringBuilder(a.length * 2);
        for(byte b: a)
            sb.append(String.format("%02x", b));
        return sb.toString();
    }

    private void networkCall() {
        ApiInterface apiInterface = ApiClint.getApiClint();
        String userId = "IBANKING";
        Call<AcOpenConfirmation> call = apiInterface.getAcOpenCOnfirmation(hex,userId);
        call.enqueue(new Callback<AcOpenConfirmation>() {
            @Override
            public void onResponse(Call<AcOpenConfirmation> call, Response<AcOpenConfirmation> response) {
                AcOpenConfirmation acOpenConfirmation = response.body();
                if (response.isSuccessful()){
                    if (response.body().getMessage().equals("Webservice Calling Successful.")){
                        responseJson = acOpenConfirmation.getResponse();
                        String key = "MyEncryptionKeyERA_AGENT_BANKING";
                        Log.e("do_now_result",decrypt(key,"0000000000000000", responseJson));
                        Gson gson = new Gson(); // Or use new GsonBuilder().create();
                        AC_OPEN target2 = gson.fromJson(decryptJson, AC_OPEN.class);
                        //Log.e("ac",target2.getResponseCode());


                    }else {
                        Toast.makeText(MainActivity.this, "Something Wrong", Toast.LENGTH_SHORT).show();
                    }
                }
            }

            @Override
            public void onFailure(Call<AcOpenConfirmation> call, Throwable t) {
                Toast.makeText(MainActivity.this, t.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });
    }

    public String decrypt(String key, String initVector, String encrypted) {
        try {
            IvParameterSpec iv = new IvParameterSpec(initVector.getBytes("UTF-8"));
            SecretKeySpec skeySpec = new SecretKeySpec(key.getBytes("UTF-8"), "AES");

            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5PADDING");
            cipher.init(Cipher.DECRYPT_MODE, skeySpec, iv);

            byte[] original = cipher.doFinal(hexStringToByteArray(encrypted));

            decryptJson = new String(original);
            return decryptJson;
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        return null;
    }



}