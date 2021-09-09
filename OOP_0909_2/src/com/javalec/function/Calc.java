package com.javalec.function;

public class Calc {

	// Field
	int num1, num2;

	// Constructor
	public Calc() {
		// TODO Auto-generated constructor stub
	}

	public Calc(int num1, int num2) {
		super();
		this.num1 = num1;
		this.num2 = num2;

		compute();
	}

	// Method

	public void compute() {
		
		Addition addition = new Addition(num1, num2);
		
//		plus();
//		minus();
//		multi();
//		division();

//		// 덧셈
//		System.out.println("덧셈 : " + plus());
//		// 뺄셈
//		System.out.println("뺄셈 : " + minus());
//		// 곱셈
//		System.out.println("곱셈 : " + multi());
//		// 나눗셈
//		System.out.println("나눗셈 : " + division());
		
	}

//	public int plus() {
//		// 덧셈
//		return num1 + num2;
//	}
//
//	public int minus() {
//		// 뺄셈
//		return num1 - num2;
//	}
//
//	public int multi() {
//		// 곱셈
//		return num1 * num2;
//	}
//
//	public double division() {
//		// 나눗셈
//		return ((double)num1 / num2);
//	}
	
//	public void compute() {
//	plus();
//	minus();
//	multi();
//	division();
//}
//
//public void plus() {
//	// 덧셈
//	System.out.println("덧셈 : " + (int)(num1 + num2));
//}
//
//public void minus() {
//	// 뺄셈
//	System.out.println("뺄셈 : " + (int)(num1 - num2));
//}
//
//public void multi() {
//	// 곱셈
//	System.out.println("곱셈 : " + (int)(num1 * num2));
//}
//
//public void division() {
//	// 나눗셈
//	System.out.println("나눗셈 : " + (num1 / num2));
//}

	
}
