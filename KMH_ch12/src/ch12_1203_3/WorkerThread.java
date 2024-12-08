package ch12_1203_3;

import java.awt.*;

public class WorkerThread extends Thread {
    public void run() { // 러너블시 꼭 정의 필요
        Toolkit toolkit = Toolkit.getDefaultToolkit();  // 시스템 스피커를 찾는 코드
        for (int i =0; i<5; i++) {
            toolkit.beep();
            System.out.println("Tting");
            try {
                Thread.sleep(500);
            } catch (Exception e) {}
        }
    }
}
