package ch06_3_03;

public class Car {
	//필드
	String company = "현대자동차";
	String model;
	String color;
	int maxSpeed;
	
	//생성자
	Car() {
	}	// 1번 생성자
	
	Car(String model) {
		this.model = model;
	}	// 2번 생성자
	
	Car(String model, String color) {
		this.model = model;
		this.color = color;
	}	// 3번 생성자
	
	Car(String model, String color, int maxSpeed) {
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}	// 4번 생성자
}