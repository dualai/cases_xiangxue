package com.xzl.cases_xiangxue.java_base.course_05;

import com.xzl.lib.LogUtil;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Test {
    static Lock mLock = new ReentrantLock();
    static class TryTest{
        public void begin(){
            LogUtil.d("开始获取锁...");

            boolean b = mLock.tryLock();
            LogUtil.d("获取锁 success: "+b+" ThreadName "+Thread.currentThread().getName());
            if(!b){
                return;
            }

            try {
                Thread.sleep(2500);
            }catch (InterruptedException ex){
                ex.printStackTrace();
            }finally {
                LogUtil.d("释放锁");
                mLock.unlock();
            }
        }
    }


    public static void main(String[] args) {
        final TryTest tryTest = new TryTest();
        new Thread(new Runnable() {
            @Override
            public void run() {
                tryTest.begin();
            }
        },"123").start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                tryTest.begin();
            }
        },"456").start();

    }
}
