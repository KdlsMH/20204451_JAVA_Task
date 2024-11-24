package ch09_1119_02;

public class Parent {
	String name;
	Parent(){
		name = "Anonymous";
	}

	public void ShowInfo() {
		System.out.println("My name is" + name);
	}
}