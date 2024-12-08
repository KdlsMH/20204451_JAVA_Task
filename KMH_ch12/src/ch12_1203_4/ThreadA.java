package ch12_1203_4;

public class ThreadA extends Thread { // threadA 는 Thread로 실행
    public ThreadA(String str) {
        setName(str);
    }
}