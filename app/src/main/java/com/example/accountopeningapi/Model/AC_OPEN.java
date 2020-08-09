package com.example.accountopeningapi.Model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class AC_OPEN {
    @SerializedName("CUST_ID")
    @Expose
    private String customerId;
    @SerializedName("AC_NO")
    @Expose
    private String accountNo;
    @SerializedName("ABS_REF_NO")
    @Expose
    private String absRefNo;
    @SerializedName("REQ_NO")
    @Expose
    private String requestNo;
    @SerializedName("RESPONSE_CODE")
    @Expose
    private String responseCode;
    @SerializedName("RESPONSE_MSG")
    @Expose
    private String responseMsg;

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    public String getAbsRefNo() {
        return absRefNo;
    }

    public void setAbsRefNo(String absRefNo) {
        this.absRefNo = absRefNo;
    }

    public String getRequestNo() {
        return requestNo;
    }

    public void setRequestNo(String requestNo) {
        this.requestNo = requestNo;
    }

    public String getResponseCode() {
        return responseCode;
    }

    public void setResponseCode(String responseCode) {
        this.responseCode = responseCode;
    }

    public String getResponseMsg() {
        return responseMsg;
    }

    public void setResponseMsg(String responseMsg) {
        this.responseMsg = responseMsg;
    }
}
