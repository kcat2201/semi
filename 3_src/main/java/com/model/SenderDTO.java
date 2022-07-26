package com.model;

public class SenderDTO {
    private int senderNo;
    private int resNo;
    private String senderName;
    private String senderHp;
    private String zipcode;
    private String address1;
    private String address2;

    public SenderDTO() {
    }

    public SenderDTO(int senderNo, int resNo, String senderName, String senderHp, String zipcode, String address1, String address2) {
        this.senderNo = senderNo;
        this.resNo = resNo;
        this.senderName = senderName;
        this.senderHp = senderHp;
        this.zipcode = zipcode;
        this.address1 = address1;
        this.address2 = address2;
    }

    public int getSenderNo() {
        return senderNo;
    }

    public void setSenderNo(int senderNo) {
        this.senderNo = senderNo;
    }

    public int getResNo() {
        return resNo;
    }

    public void setResNo(int resNo) {
        this.resNo = resNo;
    }

    public String getSenderName() {
        return senderName;
    }

    public void setSenderName(String senderName) {
        this.senderName = senderName;
    }

    public String getSenderHp() {
        return senderHp;
    }

    public void setSenderHp(String senderHp) {
        this.senderHp = senderHp;
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

    @Override
    public String toString() {
        return "SenderDTO{" + "senderNo=" + senderNo + ", resNo=" + resNo + ", senderName=" + senderName + ", senderHp=" + senderHp + ", zipcode=" + zipcode + ", address1=" + address1 + ", address2=" + address2 + '}';
    }
    
    
}
