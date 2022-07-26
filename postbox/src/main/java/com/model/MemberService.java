/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.model;

/**
 *
 * @author kcat2
 */
public class MemberService {
    
    //로그인 처리 상수
    public static final int LOGIN_OK=1;     //로그인 성공
    public static final int PWD_DISAGREE=2; //비밀번호 불일치
    public static final int NONE_USERID=3;  //아디이 존재하지 않음
    
    private static String id;

    public static String getId() {
        return id;
    }

    public static void setId(String id) {
        MemberService.id = id;
    }
    
    
}
