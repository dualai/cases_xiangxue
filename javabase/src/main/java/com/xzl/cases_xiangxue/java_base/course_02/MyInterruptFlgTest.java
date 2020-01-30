package com.xzl.cases_xiangxue.java_base.course_02;

import android.util.Log;

import com.xzl.lib.LogUtil;

import java.util.concurrent.atomic.AtomicBoolean;

public class MyInterruptFlgTest {
    private static volatile AtomicBoolean breakFlg = new AtomicBoolean(false);

    final static class UseThread extends Thread{

        @Override
        public void run() {
            super.run();
            LogUtil.d("run start...");
            while (!breakFlg.get()){
                try {
                    Thread.sleep(3000);
                    LogUtil.d("sleep done...");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                    LogUtil.d("exception,interrupt flg "+isInterrupted());
                }
            }
            LogUtil.d("run end..interrupt flg "+isInterrupted());
        }
    }

    public static void main(String[] args) throws InterruptedException {
        UseThread useThread = new UseThread();
        useThread.start();
        Thread.sleep(1000);

        breakFlg.set(true);
    }
}
