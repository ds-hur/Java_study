package com.javalec.base;

import java.util.Scanner;

import com.javalec.function.Addition;
import com.javalec.function.Calc;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		int num1, num2;
		
		
		System.out.print("첫번째 숫자를 입력하세요 : ");
		num1 = scanner.nextInt();
		
		System.out.print("두번째 숫자를 입력하세요 : ");
		num2 = scanner.nextInt();
		
		System.out.println(">>>>>> 결과 <<<<<<");
		
		Calc calc = new Calc(num1, num2);

	}

}
