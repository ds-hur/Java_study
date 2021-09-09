package com.javalec.base;

import java.util.Scanner;

import com.javalec.func.Division;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		int num1 = 0;
		int num2 = 0;
		
		System.out.println("첫번째 숫자를 입력하세요 : ");
		num1 = scanner.nextInt();
		System.out.println("두번째 숫자를 입력하세요 : ");
		num2 = scanner.nextInt();
		
		Division division = new Division();
		
		System.out.println("덧셈 : ");
		division.plus(num1, num2);
		System.out.println("뺄셈 : ");
		division.minus(num1, num2);
		System.out.println("곱셈 : ");
		division.multi_calc(num1, num2);
		System.out.println("나눗셈 : ");
		division.divi_calc(num1, num2);
		

	}

}
