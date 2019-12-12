package com.eomcs.lms;

public class prac_12_12_6 {
  
  public static void main(String[] args) {
    
    //// println : 출력 + 줄바꿈
    System.out.println(20);       // 정수
    System.out.println(3.14f);    // 부동소수점
    System.out.println("Hello");  // 문자열
    System.out.println('Y');      // 문자
    System.out.println(true);     // boolean
    System.out.println();         // 줄바꿈
  
    //// print : 출력
    System.out.print(20);       // 정수
    System.out.print(3.14f);    // 부동소수점
    System.out.print("Hello");  // 문자열
    System.out.print('Y');      // 문자
    System.out.print(true);     // boolean
    // System.out.print();         // 줄바꿈
    System.out.print('\n');         // 줄바꿈

    //// printf : 데이터 타입 지정 후 해당 자리를 변수값으로 치환한 후 출력
    // System.out.printf(20);       // 정수
    // System.out.printf(3.14f);    // 부동소수점
    System.out.printf("Hello");  // 문자열
    // System.out.printf('Y');      // 문자
    // System.out.printf(true);     // boolean
    // System.out.printf();         // 줄바꿈

    System.out.printf("안녕하세요. %s입니다.\n", "임꺽정");
    System.out.printf("%d %x %c %b\n", 65, 65, 65, true);
    System.out.printf("%2$d %2$x %2$c\n", 31, 65);
    System.out.printf("'%-10s' '%10s'\n", "홍길동", "임꺽정");
    System.out.printf("'%-10d' '%10d'\n", 12345, 12345);
  }
}