package ch04_2_03;

public class ForSumFrom1To100Example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0; //합계변수
		
		int i = 0; //루프 카운터 변수
		for(i=1; i<=100; i++) {
			sum += i;
		}
								 //vv 루프카운터 변수  //vvv 합계변수
		System.out.println("1~" + (i-1) + " 합 : " + sum);
	}
}