package com.eomcs.lms;

public class prac_12_12_2 {

  public static void main(String[] args) {

    float f1, f2;
    double d1, d2;

    f1 = 3.14f;
    d1 = 3.14;
    f2 = 3.14f;
    d2 = 3.14;

    d1 = f1;          // float형 4바이트 변수를 double형 8바이트 변수에게 대입 가능 
    System.out.println(d1);

    // f2 = d2;       // double형 8바이트 변수를 float형 4바이트 변수에게 대입 불가
    // System.out.println(f2);
  }
}