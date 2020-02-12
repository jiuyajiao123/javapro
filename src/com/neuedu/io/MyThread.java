package com.neuedu.io;

/**
 * Created by 86183 on 2020/2/12.
 */
public class MyThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i <= 100; i++) {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + "线程输出————" + i);
        }
    }
}
