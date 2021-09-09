package com.javalec.base;

import com.javalec.func.Child;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Child child = new Child();
		System.out.println("아버님 성명 : ");
		child.getFather();
		
		System.out.println("어머님 성명 : ");
		child.getMather();
		
		System.out.println("나의 이름 : ");
		child.getMe();

	}

}
