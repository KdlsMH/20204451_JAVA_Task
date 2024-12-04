package ch11_1_09;

import ch11_1_08.Car;

public class ResourcePathExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Class clazz = Car.class;
		
		String photo1Path = clazz.getResource("photo1.jpg").getPath();
		String photo2Path = clazz.getResource("images/phooto2.jpg").getPath();
		
		System.out.println(photo1Path);
		System.out.println(photo2Path);
	}

}
