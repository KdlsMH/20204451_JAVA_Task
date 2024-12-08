package ch12_1203_1;

import java.awt.*;

public class Main {
    public static void main(String[] args) {
        Toolkit toolkit = Toolkit.getDefaultToolkit();  // 시스템 스피커를 찾는 코드
        for (int i =0; i<5; i++) {
            toolkit.beep();
            System.out.println("Tting");
            try {
                Thread.sleep(500);
            } catch (Exception e) {}
        }

        for(int i =0; i<5; i++) {
            toolkit.beep();
            System.out.println("dong");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}