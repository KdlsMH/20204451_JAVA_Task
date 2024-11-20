package ch09_1_05;

public class OutterExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Outter outter = new Outter();
		Outter.Nested nested = outter.new Nested();
		nested.print();
	}
}
