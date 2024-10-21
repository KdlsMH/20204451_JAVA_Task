package ch04_2_07;

public class WhileSumForm1To100Example {

	public static void main(String[] args) {
		int sum = 0; //합계를 저장할 변수 sum
		int i = 1; //루프 카운터 변수
		
		while(i<=100) {
			sum += i;
			i++;
		}
		//						   v루프카운터 변수      v 합게를 저장할 변수
		System.out.println("1~" + (i-1) + " 합 : " + sum);
	}
}