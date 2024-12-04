package ch11_1_23;

public class AutoBoxingUnBoxingExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//자동 박싱
		Integer obj = 100;
		System.out.println("value: " + obj.intValue());
	
		//대입시 자동 언박싱
		int value = obj;  	
		System.out.println("value: " + value);
		
		//연산시 자동 언박싱
		int result = obj + 100;
		System.out.println("result: " + result);
	}
}