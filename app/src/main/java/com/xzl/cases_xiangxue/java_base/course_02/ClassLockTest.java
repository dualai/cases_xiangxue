package com.xzl.cases_xiangxue.java_base.course_02;

import com.xzl.lib.LogUtil;

public class ClassLockTest {

    private static class UseTest {
        private static byte[] OBJ_LOCK = new byte[1];
        static synchronized void getMe1() {
            for (int i = 0; i < 220; i++) {
                LogUtil.d("111");
            }
        }

        void getMe2() {
            synchronized (UseTest.class) {
                for (int i = 0; i < 220; i++) {
                    LogUtil.d("222");
                }
            }
        }
    }


    public static void main(String[] args) {
        final UseTest useTest = new UseTest();
        new Thread(new Runnable() {
            @Override
            public void run() {
                UseTest.getMe1();
            }
        }).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                useTest.getMe2();
            }
        }).start();

    }
}
