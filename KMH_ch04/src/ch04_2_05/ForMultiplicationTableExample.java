package ch04_2_05;

public class ForMultiplicationTableExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int m=2; m<=9; m++) { // 바깥쪽 for문
			System.out.println("*** " + m + "단 ***");
			for (int n=1; n<=9; n++) { // 중첩 for문
				System.out.println(m + " x " + n + " = " + (m*n));
			}
		}
	}
}