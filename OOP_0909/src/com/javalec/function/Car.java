package com.javalec.function;

public class Car {
	// Field
	
	public String company = "현대자동차";
	public String model; // null exception error 체크항상 염두하기
	public String color; // null exception error 체크항상 염두하기
	public String maxSpeed; // null exception error 체크항상 염두하기
	
	// Constructor
	
	public Car() {
		// TODO Auto-generated constructor stub
	}

	public Car(String model) {
		super();
		this.model = model;
	}

	public Car(String model, String color) {
		super();
		this.model = model;
		this.color = color;
	}

	public Car(String model, String color, String maxSpeed) {
		super();
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
	
	
	
	// Method

}
