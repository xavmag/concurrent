package ru.xavmag;

import java.io.IOException;

public class TwoThreads {
    void start() throws InterruptedException {
        var t1 = new Thread(() -> {
            int time = 0;
            while(true) {
                try {
                    Thread.sleep(1000);
                    time++;
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Время: " + time + " сек");
            }
        });
        var t2 = new Thread(() -> {
            try {
                System.in.read();
            } catch (IOException e) {
                e.printStackTrace();
            }
        });
        t1.setDaemon(true);
        t1.start();
        t2.start();
        t2.join();
    }
}
