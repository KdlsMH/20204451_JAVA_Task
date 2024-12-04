package ch11_1_06;

public class ExitExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0; i<10; i++) {
			if(i == 5) {
				System.exit(i);
				//break;
			}
		}
		System.out.println("마무리 코드");
	}
}
