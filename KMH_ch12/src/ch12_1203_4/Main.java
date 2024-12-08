package ch12_1203_4;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Thread mainThread = Thread.currentThread();
        System.out.println("Thread Name : " + mainThread.getName());

        ThreadA threadA = new ThreadA("Hello World");
        System.out.println("Thread Name : " + threadA.getName()); // getName 이 스레드에 정의되어있구나 확인
    }
}