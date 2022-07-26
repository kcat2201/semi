package com.model;

public class ReceiverDTO {
    private int receiverNo;
    private int resNo;
    private String receiverName;
    private String receiverHp;
    private String zipcode;
    private String address1;
    private String address2;
    private String requestMsg;
    private String payment;

    public ReceiverDTO() {
    }

    public ReceiverDTO(int receiverNo, int resNo, String receiverName, String receiverHp, String zipcode, String address1, String address2, String requestMsg, String payment) {
        this.receiverNo = receiverNo;
        this.resNo = resNo;
        this.receiverName = receiverName;
        this.receiverHp = receiverHp;
        this.zipcode = zipcode;
        this.address1 = address1;
        this.address2 = address2;
        this.requestMsg = requestMsg;
        this.payment = payment;
    }

    public int getReceiverNo() {
        return receiverNo;
    }

    public void setReceiverNo(int receiverNo) {
        this.receiverNo = receiverNo;
    }

    public int getResNo() {
        return resNo;
    }

    public void setResNo(int resNo) {
        this.resNo = resNo;
    }

    public String getReceiverName() {
        return receiverName;
    }

    public void setReceiverName(String receiverName) {
        this.receiverName = receiverName;
    }

    public String getReceiverHp() {
        return receiverHp;
    }

    public void setReceiverHp(String receiverHp) {
        this.receiverHp = receiverHp;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    public String getAddress1() {
        return address1;
    }

    public void setAddress1(String address1) {
        this.address1 = address1;
    }

    public String getAddress2() {
        return address2;
    }

    public void setAddress2(String address2) {
        this.address2 = address2;
    }

    public String getRequestMsg() {
        return requestMsg;
    }

    public void setRequestMsg(String requestMsg) {
        this.requestMsg = requestMsg;
    }

    public String getPayment() {
        return payment;
    }

    public void setPayment(String payment) {
        this.payment = payment;
    }

    @Override
    public String toString() {
        return "ReceiverDTO{" + "receiverNo=" + receiverNo + ", resNo=" + resNo + ", receiverName=" + receiverName + ", receiverHp=" + receiverHp + ", zipcode=" + zipcode + ", address1=" + address1 + ", address2=" + address2 + ", requestMsg=" + requestMsg + ", payment=" + payment + '}';
    }
    
}
