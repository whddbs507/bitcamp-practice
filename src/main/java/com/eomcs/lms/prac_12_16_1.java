package com.eomcs.lms;

public class prac_12_16_1 {
	
	int instanceVar;			// 인스턴스 변수
	static int classVar;		// 클래스 변수
	
	public static void main(String[] args) {
		//instanceVar = 3;		
		classVar = 4;			
		
		int localVar;				// 로컬 변수(지역 변수)
		localVar = 30;
	}
	
	public static void m2() {		// 스태틱 메서드(스태틱 블록)
		classVar = 20;
		// instanceVar = 100;
		// localVar = 40;
	}
	
	public void m3() {				// 인스턴스 메서드(인스턴스 블록)
		classVar = 20;
		instanceVar = 100;
		// localVar = 40;
	}

}