package ch04_2_02;

public class ForSumFrom1To100Example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0; //합계변수
		
		for(int i=1; i<=100; i++) {
			sum += i;
		}
										//vvv 합계변수
		System.out.println("1~100 합 : " + sum);
	}
}