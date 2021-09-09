package com.javalec.function;

public class Addition {

	// Field
	double num1, num2;

	// Constructor
	public Addition() {

	}

	public Addition(int num1, int num2) {
		super();
		this.num1 = num1;
		this.num2 = num2;
		
		plus();
		minus();
		multi();
		division();
	}

	// Method

	public void plus() {
		// 덧셈
		System.out.println("덧셈 : " + (int) (num1 + num2));
	}

	public void minus() {
		// 뺄셈
		System.out.println("뺄셈 : " + (int) (num1 - num2));
	}

	public void multi() {
		// 곱셈
		System.out.println("곱셈 : " + (int) (num1 * num2));
	}

	public void division() {
		// 나눗셈
		System.out.println("나눗셈 : " + (num1 / num2));
	}

}//
