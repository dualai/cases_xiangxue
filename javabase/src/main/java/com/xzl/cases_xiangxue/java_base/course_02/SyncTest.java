package com.xzl.cases_xiangxue.java_base.course_02;

import java.util.Collections;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

public class SyncTest {

    private static AtomicInteger mInt = new AtomicInteger(0);
    private static Object lockObj = new Object();
    public static void main(String[] args) throws InterruptedException {

        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("a000000000000000");
                synchronized (lockObj){
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("a11111111111111");
                }

                System.out.println("a22222222222222222");

                System.out.println("a33333333333333333");
                synchronized (lockObj){
                    System.out.println("a44444444444444");
                }
                System.out.println("a55555555555555555");
            }
        }).start();


        Thread.sleep(1);

        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("b000000000000000");
                synchronized (lockObj){
                    System.out.println("b11111111111111");
                }

                System.out.println("b22222222222222222");

                System.out.println("b33333333333333333");
                synchronized (lockObj){
                    System.out.println("b44444444444444");
                }
                System.out.println("b55555555555555555");
            }
        }).start();



    }
}
