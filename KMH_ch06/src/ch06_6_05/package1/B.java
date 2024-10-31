package ch06_6_05.package1;

public class B {
	public B() {
		A a = new A();
		a.field1 = 1;   //( o)   
		a.field2 = 1;   //(o)   
		//a.field3 = 1;	   //(x)<- private 필드 접근 불가(컴파일 에러)
		
		a.method1();   //(o)  
		a.method2();   //(o)  
		//a.method3();	   //(x)<- private 필드 접근 불가(컴파일 에러)	
	}
}