package com.eomcs.lms;

public class prac_12_12_1 {

  public static void main(String[] args) {

    float f;    // 유효자릿수 7자리 부동소수점 (float : 4바이트)

    f = 9.988776f;
    System.out.println(f);
    f = 9.9887769f;
    System.out.println(f);    // 8자리 - 값 잘못 나옴.

    double d;   // 유효자릿수 15자리 부동소수점 (double : 8바이트)

    d = 9.98877667788998;
    System.out.println(d);
    d = 9.988776677889989;    // 16 자리 - 값 잘못 나옴.
    System.out.println(d);

  }
}