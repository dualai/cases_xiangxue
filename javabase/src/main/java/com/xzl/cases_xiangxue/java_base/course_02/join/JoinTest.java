package com.xzl.cases_xiangxue.java_base.course_02.join;

import com.xzl.lib.LogUtil;

public class JoinTest {

    public static void main(String[] args) throws InterruptedException {
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                LogUtil.d("thread1 在执行");
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                LogUtil.d("thread1 执行完毕");
            }
        });
        LogUtil.d("Main start...");
        thread1.start();
        thread1.join();
        LogUtil.d("Main end");
    }
}
