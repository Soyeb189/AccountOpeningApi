package com.example.accountopeningapi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import com.example.accountopeningapi.Controller.ApiClint;
import com.example.accountopeningapi.Controller.ApiInterface;
import com.example.accountopeningapi.Model.AcOpenConfirmation;

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

public class MainActivity extends AppCompatActivity {
    public static String hex;
    String initVector="0000000000000000";
    String jsonData;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        try {
            JsonData.createJson();
            jsonData=JsonData.json;
        } catch (JSONException e) {
            e.printStackTrace();
        }

        setEncryptDrcrypt();

        networkCall();

    }



    private void setEncryptDrcrypt() {
        String key = "MyEncryptionKeyERA_AGENT_BANKING";
        Log.e("do_now_",encrypt(key, jsonData));
        Log.e("do_now_result",decrypt(key,"0000000000000000", hex));
    }
    public static String decrypt(String key, String initVector, String encrypted) {
        try {
            IvParameterSpec iv = new IvParameterSpec(initVector.getBytes("UTF-8"));
            SecretKeySpec skeySpec = new SecretKeySpec(key.getBytes("UTF-8"), "AES");

            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5PADDING");
            cipher.init(Cipher.DECRYPT_MODE, skeySpec, iv);

            byte[] original = cipher.doFinal(hexStringToByteArray(encrypted));

            return new String(original);
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        return null;
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
        String userId = "xyz";
        Call<AcOpenConfirmation> call = apiInterface.getAcOpenCOnfirmation(hex,userId);
        call.enqueue(new Callback<AcOpenConfirmation>() {
            @Override
            public void onResponse(Call<AcOpenConfirmation> call, Response<AcOpenConfirmation> response) {
                AcOpenConfirmation acOpenConfirmation = response.body();
                if (response.isSuccessful()){
                    if (response.body().getMessage().equals("Webservice Calling Successful.")){
                        String responseJson = acOpenConfirmation.getResponse();
                        Log.e("response_json",responseJson);

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



}