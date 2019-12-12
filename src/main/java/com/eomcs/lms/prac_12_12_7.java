package com.eomcs.lms;

import java.util.Date;

public class prac_12_12_7 {
  
  public static void main(String[] args) {
    
    // 형식을 갖춰서 날짜 값 출력하기

    Date today = new Date();

    System.out.printf("%tY, %ty \n", today, today);    // 2019, 19  [년도]
    System.out.printf("%tB, %tb \n", today, today);    // December, Dec  [월]
    System.out.printf("%tm \n", today);    // 12  [월]
    System.out.printf("%td, %te \n", today, today);    // 07, 7  [일]
    System.out.printf("%tA, %ta \n", today, today);    // 일요일, 일   [요일]
    System.out.printf("%tH, %tI \n", today, today);    // 18, 06  [시간]
    System.out.printf("%tM \n", today);    // 33   [분]
    System.out.printf("%tS, %tL, %tN \n", today, today, today);    // 12, 218, 218000000   [초]
    System.out.printf("%Tp, %tp \n", today, today);  // PM, pm  [오전/오후]

    System.out.printf("%1$tY-%1$tb-%1$td일 %1$tA %1$tH:%1$tM:%1$tS", today);
  }
}