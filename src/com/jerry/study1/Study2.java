package com.jerry.study1;

public class Study2 {
	
	//클래스명은 대문자로 시작하기 때문에 String과 System이 클래스명이다.
	//변수명은 소문자로 시작하기 때문에? args, age, out이 변수명이다
	//소문자로 시작하고 소괄호에 있는 것은 메서드명이다.
	public static void main(String [] args) {
				
		//int age = 30;
		//System.out.println(age);
		
		//Reference type(객체)
		String name="jeryy";
		Object ogj = new Object ();
		int age=30;
		String na = "iu";
		//형변환(Cascading)
		//형변환은 primitive 타입끼리만 형변환 가능(boolean 제외, boolean은 1byte만 차지하기 떄문에)
		//형태의 변환 type의 변환, 같은 타입으로 형태를 맞춰 놓고 계산하는 것
		//강제 형변환(명시적 형변환)
		//큰 타입을 작은 타입에 넣을 때 
		long num1 = 30L;
		int num2 = (int)num1; //num1 앞에 (int)의 의미는 'int 타입으로 바꿔서 대입하시오'를 의미한다.
				
		float f1 = 1.2F;
		double d1 = (double)f1;
		//자동 형변환 (묵시적 형변환)
		//byte -> short, char -> int -> long ->float -> double 
		//수 표현의 개수(비트조합)
		//작은거에서 큰 것으로 집어넣을 때는 (double) 과 같은 것을 생략해도 된다.
		//float과 long은 1.0000001도 1이라고 생각함. 근사치를 적용함.
		//double은 1.00000000000001도 1이라고 생각함.
		
		int total = 100;
		double avg = total/3;
		
		avg=33.22;
		total=(int)avg*10;
		
		System.out.println(avg);
		System.out.println(total);
		
		//over flow
		byte b = 127;
		byte b2 = 1;
		//byte는 -128~127까지의 수만 표현 가능하기 때문에 b+b2를 하면 넘치기 때문에 -128이 됨
		
		
		age=1;
		na="1";
		//name
		//System.out.prinln(age==na);
		
		//연산자는 같은 타입끼리만 연산이 가능
		// 산술연산자 + - * / %
		//System.out.println("1"*1); 은 안됨.
		//System.out,println(1.2+3); 도 안됨 1.2는 double 타입, 3은 int타입
		
	}

}
