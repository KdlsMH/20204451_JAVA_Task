package ch06_6_04.package1;

public class A {
	//필드
	A a1 = new A(true); //(ㅇ)
	A a2 = new A(1); //(ㅇ)
	A a3 = new A("문자열"); //(ㅇ)

	//생성자	
	public A(boolean b) {} //public 접근제한
	A(int b) {}	//default 접근제한
	private A(String s) {} //private 접근제한
}