package com.xzl.cases_xiangxue.java_base.course_02;

import com.xzl.lib.LogUtil;

public class ThreadInterruptTest2 {

    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();
        try {
            Thread.sleep(2000);
            myThread.interrupt();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static class MyThread extends Thread {
        @Override
        public void run() {
            /**
             * 不会被打断
             */
//            while (!isInterrupted()){
//                try {
//                    LogUtil.d("begin...");
//                    Thread.sleep(3000);
//                    LogUtil.d("end..."+isInterrupted());
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                    LogUtil.d("InterruptedException..."+isInterrupted());
//                }
//            }

            /**
             * 会被打断
             */
            try {
                while (!isInterrupted()) {
                    LogUtil.d("begin...");
                    Thread.sleep(3000);
                    LogUtil.d("end..." + isInterrupted());
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
                LogUtil.d("InterruptedException..." + isInterrupted());
            }
        }
    }
}
