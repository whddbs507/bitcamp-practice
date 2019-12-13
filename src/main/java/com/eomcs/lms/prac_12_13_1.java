package com.eomcs.lms;

public class prac_12_13_1 {
  
  public static void main(String[] args) {
 
    // 배열 사용 전
    int korean, english, math, social, music;

    // 배열 사용 후
    int[] score = new int[5];

    // 배열에 값을 저장하는 방법
    score[0] = 100;
    score[1] = 100;
    score[2] = 100;
    score[3] = 100;
    score[4] = 100;

    // runtime error!
    // score[-1] = 100;
    // score[5] = 100;

    // 배열 레퍼런스와 인스턴스를 따로 선언
    int[] arr1 = null;    // 주소가 0  =>  메모리를 가리키지 않음!

    // arr1[0] = 100;     // runtime error!

    // 배열 인스턴스 생성
    arr1 = new int[5];
    arr1[0] = 100;
    arr1[1] = 200;

    System.out.println(arr1[0]);
    System.out.println(arr1[1]);

    int[] arr2;
    // 배열 레퍼런스는 배열 인스턴스의 주소를 담는다.
    arr2 = arr1;

    System.out.println(arr1[0]);
    System.out.println(arr2[0]);
    System.out.println(arr1[1]);
    System.out.println(arr2[1]);

    // 배열 인스턴스의 각 항목은 생성되는 순간 기본 값으로 초기화!
    // byte, short, int, long 배열 : 0
    // float, double 배열 : 0.0
    // boolean 배열 : false;
    // char 배열 : \u0000;
    System.out.println(arr1[2]);

    int[] arr3 = new int[3];
    arr3[0] = 30;
    arr2 = arr3;
    System.out.println(arr3[0]);
    System.out.println(arr2[0]);
    arr1 = arr2;
    System.out.println(arr2[0]);
    System.out.println(arr1[0]);
    // arr1에 저장되어있던 기존 배열 인스턴스에 접근할 방법은?
    // 없다!!!
    //    => 처음 생성했던 배열 인스턴스의 주소를 갖고 있던 레퍼런스가 arr2 레퍼런스로 덮혔기 때문..
    //    => 이렇게 주소를 잃어버려 접근할 수 없는 메모리를 "garbage(가비지, 쓰레기)" 라고 부른다.

    // 배열 인스턴스 생성과 동시에 값 생성하기
    int[] arr4 = new int[] {100, 90, 80};

    // 인스턴스 생성과 동시에 값을 생성할 때 배열 개수를 지정하면 안된다!
    // int[] arr5 = new int[3] {100, 90, 80};

    // 배열 레퍼런스 생성과 동시에 인스턴스를 초기화 시킬때 new int[] 생략 가능
    int[] arr7 = {100, 90, 80};

    // 레퍼런스를 생성한 다음, 값을 초기화시킬 때는 new int[] 생략 불가!
    int[] arr8;
    // arr8 = {100, 90, 80};
    arr8 = new int[] {100, 90, 80};

  

  }
}