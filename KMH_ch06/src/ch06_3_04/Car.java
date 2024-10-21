package ch06_3_04;

public class Car {
	//필드
	String company = "현대자동차";
	String model;
	String color;
	int maxSpeed;
	
	//생성자
	Car() {
	}
	
	Car(String model) {
		this(model, null, 0);
	}
	
	Car(String model, String color) {
		this(model, color, 0);
	}
	
	Car(String model, String color, int maxSpeed) { //호출함
		this.model = model;			//공통 실행 코드
		this.color = color;			//공통 실행 코드
		this.maxSpeed = maxSpeed;	//공통 실행 코드
	}
}