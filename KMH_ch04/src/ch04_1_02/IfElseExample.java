package ch04_1_02;

public class IfElseExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int score = 85;
		
		if(score >= 90) {
			System.out.println("점수가 90보다 큽니다.");
			System.out.println("등급은 A입니다.");
		} else {	// score가 90일 경우
			System.out.println("점수가 90보다 작습니다.");
			System.out.println("등급은 B입니다.");
		}
	}
}