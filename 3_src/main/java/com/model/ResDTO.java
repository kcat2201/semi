package com.model;

import java.sql.Timestamp;


public class ResDTO {

    private int resNo;
    private String resAlias;
    private int fare;
    private Timestamp resDate;
    private String invoiceNo;
    private String id;
    private int weight;

    public ResDTO() {
    }

    public ResDTO(int resNo, String resAlias, int fare, Timestamp resDate, String invoiceNo, String id, int weight) {
        this.resNo = resNo;
        this.resAlias = resAlias;
        this.fare = fare;
        this.resDate = resDate;
        this.invoiceNo = invoiceNo;
        this.id = id;
        this.weight = weight;
    }

    public int getResNo() {
        return resNo;
    }

    public void setResNo(int resNo) {
        this.resNo = resNo;
    }

    public String getResAlias() {
        return resAlias;
    }

    public void setResAlias(String resAlias) {
        this.resAlias = resAlias;
    }

    public int getFare() {
        return fare;
    }

    public void setFare(int fare) {
        this.fare = fare;
    }

    public Timestamp getResDate() {
        return resDate;
    }

    public void setResDate(Timestamp resDate) {
        this.resDate = resDate;
    }

    public String getInvoiceNo() {
        return invoiceNo;
    }

    public void setInvoiceNo(String invoiceNo) {
        this.invoiceNo = invoiceNo;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "ReservationDTO{" + "resNo=" + resNo + ", resAlias=" + resAlias + ", fare=" + fare + ", resDate=" + resDate + ", invoiceNo=" + invoiceNo + ", id=" + id + ", weight=" + weight + '}';
    }
    
    
    
}
