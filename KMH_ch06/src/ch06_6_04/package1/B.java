package ch06_6_04.package1;	// 패키지가 동일

public class B {
	//필드
	A a1 = new A(true); //(o)
	A a2 = new A(1); //(o)
	//A a3 = new A("문자열"); //(x) <- private 생성자 접근 불가(컴파일)
}