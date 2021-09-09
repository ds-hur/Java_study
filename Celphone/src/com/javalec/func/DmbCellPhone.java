package com.javalec.func;

public class DmbCellPhone extends Phone {
	
	// Field
	public String model;
	public String color;
	public int channel;
	
	// Constructor
	public DmbCellPhone() {
		// TODO Auto-generated constructor stub
	}
	
	// Method
	
	public DmbCellPhone(String model, String color, int channel) {
		super();
		this.model = model;
		this.color = color;
		this.channel = channel;
	}

	public void turnOnDmb() {
		System.out.println("채널" + channel + "번 DMB방송 수신을 시작합니다.");
	}
	
	public void changeChannelDmb(int i) {
		System.out.println("채널" + i + "번으로 바꿉니다.");
	}
	
	public void turnOffDmb() {
		System.out.println("DMB 방송 수신을 멈춥니다.");
	}

}
