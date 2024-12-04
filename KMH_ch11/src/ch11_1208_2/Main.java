package ch11_1208_2;

import java.util.HashMap;

import ch11_1208_1.Member;

public class Main {

	private static int Member;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Member m1 = new Member(92);

		Member m2 = new Member(92);

		

		HashMap<Member, String> student = new HashMap<Member, String>();

		student.put(m1,  "Donggeun Lee");

//		System.out.println("Name is" + student.get(m1));

		Member = 92;

		System.out.println("Name is" + student.get(m2));

	}

}