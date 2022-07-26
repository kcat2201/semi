package com.model;

import java.sql.Timestamp;

public class MemberDTO {
    private String id;
    private String pwd;
    private String name;
    private String hp;
    private String email;
    private String zipcode;
    private String address1;
    private String address2;
    private Timestamp regDate;

    public MemberDTO() {
    }

    public MemberDTO(String id, String pwd, String name, String hp, String email, String zipcode, String address1, String address2, Timestamp regDate) {
        this.id = id;
        this.pwd = pwd;
        this.name = name;
        this.hp = hp;
        this.email = email;
        this.zipcode = zipcode;
        this.address1 = address1;
        this.address2 = address2;
        this.regDate = regDate;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHp() {
        return hp;
    }

    public void setHp(String hp) {
        this.hp = hp;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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

    public Timestamp getRegDate() {
        return regDate;
    }

    public void setRegDate(Timestamp regDate) {
        this.regDate = regDate;
    }

    @Override
    public String toString() {
        return "MemberDTO{" + "id=" + id + ", pwd=" + pwd + ", name=" + name + ", hp=" + hp + ", email=" + email + ", zipcode=" + zipcode + ", address1=" + address1 + ", address2=" + address2 + ", regDate=" + regDate + '}';
    }

   
}
