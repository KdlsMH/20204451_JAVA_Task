package ch02_4_04;

public class QStopExample {

	public static void main(String[] args) throws Exception {
		int keyCode;
		
		while(true) {
			keyCode = System.in.read();
			System.out.println("keyCode : " + keyCode);
			if(keyCode == 113) {
				break;
			} // ->keyCode가 113일 경우 while 반복을 중지함
		} 
		
		System.out.println("종료");
	} 
}