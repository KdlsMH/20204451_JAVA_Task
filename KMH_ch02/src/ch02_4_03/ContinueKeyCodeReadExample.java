package ch02_4_03;

public class ContinueKeyCodeReadExample {

	public static void main(String[] args) throws Exception {
		int keyCode;
		
		while(true) { 
			keyCode = System.in.read();	//반복실행
			System.out.println("keyCode : " + keyCode);	//반복실행
		} 
	} 
} 
