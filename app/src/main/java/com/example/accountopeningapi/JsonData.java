package com.example.accountopeningapi;

import android.util.Log;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class JsonData {

    public static String json;

    public static void createJson() throws JSONException {
//
//        JSONObject student1 = new JSONObject();
//        try {
//            student1.put("id", "3");
//            student1.put("name", "NAME OF STUDENT");
//            student1.put("year", "3rd");
//            student1.put("curriculum", "Arts");
//            student1.put("birthday", "5/5/1993");
//
//        } catch (JSONException e) {
//            // TODO Auto-generated catch block
//            e.printStackTrace();
//        }
//
//        JSONObject student2 = new JSONObject();
//        try {
//            student2.put("id", "2");
//            student2.put("name", "NAME OF STUDENT2");
//            student2.put("year", "4rd");
//            student2.put("curriculum", "scicence");
//            student2.put("birthday", student1);
//
//        } catch (JSONException e) {
//            // TODO Auto-generated catch block
//            e.printStackTrace();
//        }
//
//        JSONObject ob = new JSONObject();
//        ob.put("Header",student2);
//
//        JSONObject ob2 = new JSONObject();
//        ob2.put("AC_OPEN",ob);
//
//        JSONArray AC_OPEN = new JSONArray();
//
//        AC_OPEN.put(ob2);
//
//
//
//
//        JSONArray jsonArray = new JSONArray();
//
//        jsonArray.put(student1);
//        jsonArray.put(student2);
//
//        JSONObject studentsObj = new JSONObject();
//        studentsObj.put("Students", jsonArray);
//
//
//
//        String jsonStr = studentsObj.toString();
//        JSONArray stud1 = new JSONArray();
//        stud1.put(student2);
//
//        Log.d("JSON",AC_OPEN.toString(4));

        //System.out.println("jsonString: "+jsonStr);

//        JSONObject object = new JSONObject();
//        object.put("name", "sample");
//        JSONArray array = new JSONArray();
//
//        JSONObject arrayElementOne = new JSONObject();
//        arrayElementOne.put("setId", 1);
//        JSONArray arrayElementOneArray = new JSONArray();
//
//        JSONObject arrayElementOneArrayElementOne = new JSONObject();
//        arrayElementOneArrayElementOne.put("name", "ABC");
//        arrayElementOneArrayElementOne.put("type", "STRING");
//
//        JSONObject arrayElementOneArrayElementTwo = new JSONObject();
//        arrayElementOneArrayElementTwo.put("name", "XYZ");
//        arrayElementOneArrayElementTwo.put("type", "STRING");
//
//        arrayElementOneArray.put(arrayElementOneArrayElementOne);
//        arrayElementOneArray.put(arrayElementOneArrayElementTwo);
//
//        arrayElementOne.put("setDef", arrayElementOneArray);
//        array.put(arrayElementOne);
//        object.put("def", array);
//
//        Log.d("JSON",object.toString(4));



//        JSONObject HEADER = new JSONObject();
//        HEADER.put("USER_ID","MERCHANT_APPS");
//        HEADER.put("USER_PASS","merchantapps");
//        HEADER.put("TOKEN_NO","#####");
//        HEADER.put("REQ_NO","####");
//
//
//        JSONObject BASIC_INFO =new JSONObject();
//        BASIC_INFO.put("BRANCH","Naogaon");
//        BASIC_INFO.put("DISTRICT_CODE","6500");
//        BASIC_INFO.put("UPAZILA_CODE","1500");
//        BASIC_INFO.put("UNION_CODE","1000");
//        BASIC_INFO.put("FIRST_NAME","Muktadir");
//        BASIC_INFO.put("DATE_OF_BIRTH","18.09.1994");
//        BASIC_INFO.put("MOBILE_NO","01738525639");
//        BASIC_INFO.put("AGENT_POINT_ID","142153579");
//        BASIC_INFO.put("AC_TYPE","Savings");
//
//        JSONObject BODY = new JSONObject();
//        BODY.put("BASIC_INFO",BASIC_INFO);
//
//
//
//        JSONObject OTHERS_INFO = new JSONObject();
//        OTHERS_INFO.put("LAST_NAME","Soyeb");
//        OTHERS_INFO.put("FATHER_NAME","Abdus Samad");
//        OTHERS_INFO.put("MOTHER_NAME","Samsun Nahar");
//        OTHERS_INFO.put("GENDER","Male");
//        OTHERS_INFO.put("RELIGION","Muslim");
//        OTHERS_INFO.put("OCCUPATION","Service");
//        OTHERS_INFO.put("SECTOR_CODE","155");
//        OTHERS_INFO.put("MARITAL_STATUS","Unmarried");
//        OTHERS_INFO.put("SPOUSE_NAME","N/A");
//        OTHERS_INFO.put("NO_OF_CHILDREN","N/A");
//        OTHERS_INFO.put("NO_OF_SON","N/A");
//        OTHERS_INFO.put("NO_OF_DAUGHTER","N/A");
//        OTHERS_INFO.put("FAX","N/A");
//        OTHERS_INFO.put("NO_OF_DEPENDENT","Bsc");
//        OTHERS_INFO.put("MOBILE_NO_2","Bsc");
//        OTHERS_INFO.put("MAIL_ID","Bsc");
//        OTHERS_INFO.put("OTHER_BANK","Bsc");
//        OTHERS_INFO.put("OTHER_BANK_AC_NO","Bsc");
//        OTHERS_INFO.put("MEDIA","Bsc");
//        OTHERS_INFO.put("LIVE_PERIOD","Bsc");
//        OTHERS_INFO.put("INCOME_PERSON","Bsc");
//        OTHERS_INFO.put("INCOME_MALE","Bsc");
//        OTHERS_INFO.put("INCOME_FEMALE","Bsc");
//        OTHERS_INFO.put("HOME_TYPE","Bsc");
//        OTHERS_INFO.put("FAMILY_GURDIAN","Bsc");
//        OTHERS_INFO.put("RELATION_WITH_GURDIAN","Bsc");
//        OTHERS_INFO.put("LAND_DESCRIPTION","Bsc");
//        OTHERS_INFO.put("FATHER_LAND","Bsc");
//        OTHERS_INFO.put("REMARKS","Bsc");
//        OTHERS_INFO.put("PROJECT_TYPE","Bsc");
//        OTHERS_INFO.put("PROJECT_REF_NO","Bsc");
//        OTHERS_INFO.put("INTRODUCER_AC_NO","Bsc");
//        OTHERS_INFO.put("AML_STATUS","Bsc");
//        OTHERS_INFO.put("AML_TOKEN_NO","Bsc");
//
//
//        BODY.put("OTHERRS_INFO",OTHERS_INFO);
//
//        /*Address Array*/
//        JSONObject addressOne = new JSONObject();
//        addressOne.put("TYPE","Permanent");
//        addressOne.put("DISTRICT_CODE","50");
//        addressOne.put("UPAZILA_CODE","50");
//        addressOne.put("UNION_CODE","50");
//        addressOne.put("POST_CODE","50");
//        addressOne.put("VILLAGE","50");
//        addressOne.put("WARD_NO","50");
//        addressOne.put("ROAD_NO","50");
//        addressOne.put("HOLDING_NO","50");
//
//        JSONObject addressTwo = new JSONObject();
//        addressTwo.put("TYPE","Present");
//        addressTwo.put("DISTRICT_CODE","50");
//        addressTwo.put("UPAZILA_CODE","50");
//        addressTwo.put("UNION_CODE","50");
//        addressTwo.put("POST_CODE","50");
//        addressTwo.put("VILLAGE","50");
//        addressTwo.put("WARD_NO","50");
//        addressTwo.put("ROAD_NO","50");
//        addressTwo.put("HOLDING_NO","50");
//
//        JSONArray addressArray = new JSONArray();
//        addressArray.put(addressOne);
//        addressArray.put(addressTwo);
//
//        OTHERS_INFO.put("ADDRESS",addressArray);
//
//        /*Documents Array*/
//        JSONObject documentsTwo = new JSONObject();
//        documentsTwo.put("TYPE","Permanent");
//        documentsTwo.put("NO","50");
//        documentsTwo.put("ISSUE_DATE","50");
//        documentsTwo.put("ISSUE_PLACE","50");
//        documentsTwo.put("EXPIRE_DATE","50");
//
//        JSONObject documentsOne = new JSONObject();
//        documentsOne.put("TYPE","Present");
//        documentsOne.put("NO","50");
//        documentsOne.put("ISSUE_DATE","50");
//        documentsOne.put("ISSUE_PLACE","50");
//        documentsOne.put("EXPIRE_DATE","50");
//
//        JSONArray documentsArray = new JSONArray();
//        documentsArray.put(documentsOne);
//        documentsArray.put(documentsTwo);
//
//        OTHERS_INFO.put("DOCUMENT",documentsArray);
//
//        /*Relative Array*/
//        JSONObject relativeOne = new JSONObject();
//        relativeOne.put("TYPE","Permanent");
//        relativeOne.put("NAME","Jubaida");
//        relativeOne.put("DATE_OF_BIRTH","Jubaida");
//        relativeOne.put("MOBILE_NO","Jubaida");
//
//        JSONObject relativeTwo = new JSONObject();
//        relativeTwo.put("TYPE","Present");
//        relativeTwo.put("NAME","Muntasir");
//        relativeTwo.put("DATE_OF_BIRTH","Muntasir");
//        relativeTwo.put("MOBILE_NO","Muntasir");
//
//        JSONArray relativeArray = new JSONArray();
//        relativeArray.put(relativeOne);
//        relativeArray.put(relativeTwo);
//
//        OTHERS_INFO.put("RELATIVE",relativeArray);
//
//        /*Nominee Array*/
//        JSONObject nomineeOne = new JSONObject();
//        nomineeOne.put("NAME","Addus Samad");
//        nomineeOne.put("FATHER_NAME","Ibrahim Ali Mridha");
//        nomineeOne.put("MOTHER_NAME","Ibrahim Ali Mridha");
//        nomineeOne.put("DATE_OF_BIRTH","Ibrahim Ali Mridha");
//        nomineeOne.put("RELATION_WITH_CUSTOMER","Ibrahim Ali Mridha");
//        nomineeOne.put("PERCENT","Ibrahim Ali Mridha");
//        nomineeOne.put("DOCUMENT_TYPE","Ibrahim Ali Mridha");
//        nomineeOne.put("DOCUMENT_NO","Ibrahim Ali Mridha");
//
//        JSONObject nomineeTwo = new JSONObject();
//        nomineeTwo.put("NAME","Samsun Nahar");
//        nomineeTwo.put("FATHER_NAME","Ibrahim Ali Mondol");
//        nomineeTwo.put("MOTHER_NAME","Ibrahim Ali Mondol");
//        nomineeTwo.put("DATE_OF_BIRTH","Ibrahim Ali Mondol");
//        nomineeTwo.put("RELATION_WITH_CUSTOMER","Ibrahim Ali Mondol");
//        nomineeTwo.put("PERCENT","Ibrahim Ali Mondol");
//        nomineeTwo.put("DOCUMENT_TYPE","Ibrahim Ali Mondol");
//        nomineeTwo.put("DOCUMENT_NO","Ibrahim Ali Mondol");
//
//        JSONArray nomineeArray = new JSONArray();
//        nomineeArray.put(nomineeOne);
//        nomineeArray.put(nomineeTwo);
//
//        OTHERS_INFO.put("NOMINEE",nomineeArray);
//
//
//        JSONObject HEADER_ARRAY = new JSONObject();
//        HEADER_ARRAY.put("HEADER",HEADER);
//        HEADER_ARRAY.put("BODY",BODY);
//
//
//
//        JSONObject AC_OPEN = new JSONObject();
//        AC_OPEN.put("AC_OPEN",HEADER_ARRAY);
//
//        json = AC_OPEN.toString(1);
//
//        Log.d("JSON",AC_OPEN.toString(1));

        try {
//            Log.e("check-1",globalVariable.getApNIDno());
//            Log.e("check-2",globalVariable.getApFatherName());
//            Log.e("check-3",globalVariable.getApMotherName());
//            Log.e("check-4",globalVariable.getApEmailId());
//            Log.e("check-5",globalVariable.getApFirstName());
//            Log.e("check-6",globalVariable.getApMobileNo());
            JSONObject parent = new JSONObject();
            JSONObject header = new JSONObject();
            JSONObject body = new JSONObject();
            JSONObject body_othersINFO_ADDRESS_child_1 = new JSONObject();
            JSONObject body_othersINFO_ADDRESS_child_2 = new JSONObject();

            JSONObject body_othersINFO_DOCUMENT_child_1 = new JSONObject();
            JSONObject body_othersINFO_DOCUMENT_child_2 = new JSONObject();

            JSONObject body_othersINFO_RELATIVE_child_1 = new JSONObject();
            JSONObject body_othersINFO_RELATIVE_child_2 = new JSONObject();

            JSONObject body_othersINFO_NOMINEE_child_1 = new JSONObject();
            JSONObject body_othersINFO_NOMINEE_child_2 = new JSONObject();

            JSONObject body_OTHER_INFO_child = new JSONObject();
            JSONObject body_basic_info_child = new JSONObject();
            JSONObject header_child = new JSONObject();
            JSONArray jsonArray_address = new JSONArray();
            JSONArray jsonArray_DOCUMENT = new JSONArray();
            JSONArray jsonArray_RELATIVE = new JSONArray();
            JSONArray jsonArray_NOMINEE = new JSONArray();

            body_othersINFO_NOMINEE_child_1.put("NAME","Rubel");
            body_othersINFO_NOMINEE_child_1.put("FATHER_NAME","N/A");
            body_othersINFO_NOMINEE_child_1.put("MOTHER_NAME","N/A");
            body_othersINFO_NOMINEE_child_1.put("DATE_OF_BIRTH","04-Mar-75");
            body_othersINFO_NOMINEE_child_1.put("RELATION_WITH_CUSTOMER","OTH");
            body_othersINFO_NOMINEE_child_1.put("PERCENT",100);
            body_othersINFO_NOMINEE_child_1.put("DOCUMENT_TYPE",null);
            body_othersINFO_NOMINEE_child_1.put("DOCUMENT_NO",null);

/*body_othersINFO_NOMINEE_child_2.put("NAME","");
body_othersINFO_NOMINEE_child_2.put("FATHER_NAME","");
body_othersINFO_NOMINEE_child_2.put("MOTHER_NAME","");
body_othersINFO_NOMINEE_child_2.put("DATE_OF_BIRTH","");
body_othersINFO_NOMINEE_child_2.put("RELATION_WITH_CUSTOMER","");
body_othersINFO_NOMINEE_child_2.put("PERCENT","");
body_othersINFO_NOMINEE_child_2.put("DOCUMENT_TYPE","");
body_othersINFO_NOMINEE_child_2.put("DOCUMENT_NO","");*/

            body_othersINFO_RELATIVE_child_1.put("TYPE","OTH");
            body_othersINFO_RELATIVE_child_1.put("NAME","shadhin");
            body_othersINFO_RELATIVE_child_1.put("DATE_OF_BIRTH",null);
            body_othersINFO_RELATIVE_child_1.put("MOBILE_NO",null);

            body_othersINFO_RELATIVE_child_2.put("TYPE","OTH");
            body_othersINFO_RELATIVE_child_2.put("NAME","shadhin");
            body_othersINFO_RELATIVE_child_2.put("DATE_OF_BIRTH",null);
            body_othersINFO_RELATIVE_child_2.put("MOBILE_NO",null);

            body_othersINFO_ADDRESS_child_2.put("TYPE","PRS");
            body_othersINFO_ADDRESS_child_2.put("DISTRICT_CODE","12");
            body_othersINFO_ADDRESS_child_2.put("UPAZILA_CODE","07");
            body_othersINFO_ADDRESS_child_2.put("UNION_CODE","32");
            body_othersINFO_ADDRESS_child_2.put("POST_CODE",null);
            body_othersINFO_ADDRESS_child_2.put("VILLAGE",null);
            body_othersINFO_ADDRESS_child_2.put("WARD_NO","08");
            body_othersINFO_ADDRESS_child_2.put("ROAD_NO",null);
            body_othersINFO_ADDRESS_child_2.put("HOLDING_NO",null);

            body_othersINFO_ADDRESS_child_1.put("TYPE","PER");
            body_othersINFO_ADDRESS_child_1.put("DISTRICT_CODE","12");
            body_othersINFO_ADDRESS_child_1.put("UPAZILA_CODE","07");
            body_othersINFO_ADDRESS_child_1.put("UNION_CODE","32");
            body_othersINFO_ADDRESS_child_1.put("POST_CODE",null);
            body_othersINFO_ADDRESS_child_1.put("VILLAGE",null);
            body_othersINFO_ADDRESS_child_1.put("WARD_NO","08");
            body_othersINFO_ADDRESS_child_1.put("ROAD_NO",null);
            body_othersINFO_ADDRESS_child_1.put("HOLDING_NO",null);

            body_othersINFO_DOCUMENT_child_1.put("TYPE","NID");
            body_othersINFO_DOCUMENT_child_1.put("NO","5063729874");
            body_othersINFO_DOCUMENT_child_1.put("ISSUE_DATE",null);
            body_othersINFO_DOCUMENT_child_1.put("ISSUE_PLACE",null);
            body_othersINFO_DOCUMENT_child_1.put("EXPIRE_DATE",null);

/* body_othersINFO_DOCUMENT_child_2.put("TYPE","PPT");
body_othersINFO_DOCUMENT_child_2.put("NO","12345678901234567");
body_othersINFO_DOCUMENT_child_2.put("ISSUE_DATE",null);
body_othersINFO_DOCUMENT_child_2.put("ISSUE_PLACE",null);
body_othersINFO_DOCUMENT_child_2.put("EXPIRE_DATE",null);*/

            jsonArray_address.put(body_othersINFO_ADDRESS_child_1);
            jsonArray_address.put(body_othersINFO_ADDRESS_child_2);


            jsonArray_DOCUMENT.put(body_othersINFO_DOCUMENT_child_1);
// jsonArray_DOCUMENT.put(body_othersINFO_DOCUMENT_child_2);


            jsonArray_RELATIVE.put(body_othersINFO_RELATIVE_child_1);
            jsonArray_RELATIVE.put(body_othersINFO_RELATIVE_child_2);


            jsonArray_NOMINEE.put(body_othersINFO_NOMINEE_child_1);
//jsonArray_NOMINEE.put(body_othersINFO_NOMINEE_child_2);


            body_OTHER_INFO_child.put("LAST_NAME","");
            body_OTHER_INFO_child.put("FATHER_NAME","dulal");
            body_OTHER_INFO_child.put("MOTHER_NAME","salma");
            body_OTHER_INFO_child.put("GENDER","M");
            body_OTHER_INFO_child.put("RELIGION","");
            body_OTHER_INFO_child.put("OCCUPATION","");
            body_OTHER_INFO_child.put("LAST_EDUCATION","");
            body_OTHER_INFO_child.put("SECTOR_CODE",915005);
            body_OTHER_INFO_child.put("MARITAL_STATUS","");
            body_OTHER_INFO_child.put("SPOUSE_NAME","ok");
            body_OTHER_INFO_child.put("NO_OF_CHILDREN","");
            body_OTHER_INFO_child.put("NO_OF_SON","");
            body_OTHER_INFO_child.put("NO_OF_DAUGHTER","");
            body_OTHER_INFO_child.put("FAX","");
            body_OTHER_INFO_child.put("NO_OF_DEPENDENT","");
            body_OTHER_INFO_child.put("ANUAL_INCOME","");
            body_OTHER_INFO_child.put("MOBILE_NO_2","");
            body_OTHER_INFO_child.put("MAIL_ID","muktadir189@gmail.com");
            body_OTHER_INFO_child.put("OTHER_BANK","");
            body_OTHER_INFO_child.put("OTHER_BANK_AC_NO","");
            body_OTHER_INFO_child.put("MEDIA","");
            body_OTHER_INFO_child.put("LIVE_PERIOD","");
            body_OTHER_INFO_child.put("INCOME_PERSON","");
            body_OTHER_INFO_child.put("INCOME_MALE","");
            body_OTHER_INFO_child.put("INCOME_FEMALE","");
            body_OTHER_INFO_child.put("HOME_TYPE","");
            body_OTHER_INFO_child.put("FAMILY_GURDIAN","");
            body_OTHER_INFO_child.put("RELATION_WITH_GURDIAN","");
            body_OTHER_INFO_child.put("LAND_DESCRIPTION","");
            body_OTHER_INFO_child.put("FATHER_LAND","");
            body_OTHER_INFO_child.put("REMARKS","");
            body_OTHER_INFO_child.put("PROJECT_TYPE",3);
            body_OTHER_INFO_child.put("PROJECT_REF_NO","2081206");
            body_OTHER_INFO_child.put("INTRODUCER_AC_NO","");
            body_OTHER_INFO_child.put("AML_STATUS","");
            body_OTHER_INFO_child.put("AML_TOKEN_NO","");
            body_OTHER_INFO_child.put("ADDRESS",jsonArray_address);
            body_OTHER_INFO_child.put("DOCUMENT",jsonArray_DOCUMENT);
            body_OTHER_INFO_child.put("RELATIVE",jsonArray_RELATIVE);
            body_OTHER_INFO_child.put("NOMINEE",jsonArray_NOMINEE);


            body_basic_info_child.put("BRANCH","108");
            body_basic_info_child.put("DISTRICT_CODE","12");
            body_basic_info_child.put("UPAZILA_CODE","07");
            body_basic_info_child.put("UNION_CODE","32");
            body_basic_info_child.put("FIRST_NAME","Muktadir");
            body_basic_info_child.put("DATE_OF_BIRTH","04-Mar-75");
            body_basic_info_child.put("MOBILE_NO","01738525639");
            body_basic_info_child.put("AGENT_POINT_ID",2);
            body_basic_info_child.put("AC_TYPE","S01");


            header_child.put("USER_ID","IBANKING");
            header_child.put("USER_PASS","ibanking");
            header_child.put("TOKEN_NO",null);
            header_child.put("REQ_NO",1270467);


            header.put("HEADER", header_child);
            header.put("BODY", body);
            body.put("BASIC_INFO", body_basic_info_child);
            body.put("OTHER_INFO", body_OTHER_INFO_child);


            parent.put("AC_OPEN", header);

            json = parent.toString();

            Log.e("output_json", parent.toString());
        } catch (JSONException e) {
            e.printStackTrace();
        }



    }
}
