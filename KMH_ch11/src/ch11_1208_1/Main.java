package ch11_1208_1;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String name1 ="Main";

//		String name2 =new String("Main");

//		String name3 ="Main";

//		

//		if (name1 == name2)

//			System.out.println("name2 Equal");

//		if (name1 == name3)

//			System.out.println("name3 Equal");

		Member m1 = new Member(92);

		Member m2 = new Member(92);

		

		if (m1 == m2)

			System.out.println("Id is equal.");

		

		if(m1.equals(m2)) //equals 라는 함수는 Object 클래스로부터 상속됨

			System.out.println("Id is equal.");

		else

			System.out.println("Id is not equal");

	}

	

}