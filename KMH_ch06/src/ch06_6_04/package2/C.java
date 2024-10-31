package ch06_6_04.package2;

import ch06_6_04.package1.A;

public class C {
	// 필드
	A a1 = new A(true);
	// A a2 = new A(1); //(x)default 생성자 접근 불가(컴파일 에러)
	// A a3 = new A("문자열"); //(x)private 생성자 접근 불가(컴파일 에러)
}