package ch11_1_11;

import java.io.IOException;

public class KeyboardToStringExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte[] bytes = new byte[100];
		
		System.out.print("입력: ");
		int readByteNo = 0;
		try {
			readByteNo = System.in.read(bytes);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		String str = new String(bytes, 0, readByteNo-2);
		System.out.println(str);
	}
}