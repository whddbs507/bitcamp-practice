package com.eomcs.lms;

public class prac_12_11_1 {

  public static void main(String[] args) {

    System.out.println(-2_147_483_648);
    System.out.println(+2_147_483_647);

    System.out.println(-9_223_372_036_854_775_808L);
    System.out.println(9_223_372_036_854_775_807L);

    System.out.println(Long.MAX_VALUE);   // 9,223,372,036,854,775,807
    System.out.println(Long.MIN_VALUE);   // -9,223,372,036,854,775,808

    System.out.println(Integer.MAX_VALUE);    // 2,147,483,647
    System.out.println(Integer.MIN_VALUE);    // -2,147,483,648

    System.out.println(Short.MAX_VALUE);    // 32767
    System.out.println(Short.MIN_VALUE);    // -32768

    System.out.println(Byte.MAX_VALUE);   // 127
    System.out.println(Byte.MIN_VALUE);   // -128

    System.out.println(Float.MAX_VALUE);    // 7자리
    System.out.println(Float.MIN_VALUE);    // 7자리

    System.out.println(Double.MAX_VALUE);   // 15자리
    System.out.println(Double.MAX_VALUE);   // 15자리
  }
}