package com.eomcs.lms;

public class prac_12_12_3 {

  public static void main(String[] args) {

    char c;   // char은 2바이트 크기의 메모리 사용 (0 ~ +65535)
    
    c = 0;
    c = 65535;

    // c = -1;
    // c = 65536;

    char c1 = 'A';
    char c2 = 0x0041;
    char c3 = 65;
    char c4 = 0b1000001;
    System.out.println(c1);
    System.out.println(c2);
    System.out.println(c3);
    System.out.println(c4);

    int d1 = 'A';
    int d2 = 0x0041;
    int d3 = 65;
    int d4 = 0b1000001;
    System.out.println(d1);
    System.out.println(d2);
    System.out.println(d3);
    System.out.println(d4);

    System.out.println((char)d1);
    System.out.println((char)d2);
    System.out.println((char)d3);
    System.out.println((char)d4);

    System.out.println((int)d1);
    System.out.println((int)d2);
    System.out.println((int)d3);
    System.out.println((int)d4);
  }
}