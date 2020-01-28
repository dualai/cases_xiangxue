package com.xzl.cases_xiangxue.java_base.course_03.concurrentTool.semaphore.demo4;

public class SemaphoreTest2 {
    /**
     * SemaphoreService2.java 中 semaphore.release(2) 如果改成 semaphore.release(1)
     * 则就会出现有5个线程得不到运行堆积的情况，可以算一下：6-2-2-2+1+1+1=3，运行完一个回合后，还剩3个通路，3-2+1，
     * 第二回合，还剩2个通路，2-2+1=1，第3个回合，还剩一个通路，不足以运行任何一个线程。
     * @param args
     */
    public static void main(String args[]) {
        SemaphoreService2 service = new SemaphoreService2();
        for (int i = 0; i < 10; i++) {
            MyThread t = new MyThread("thread" + (i + 1), service);
            t.start();
            System.out.println("可用通路数：" + service.availablePermits());
        }
    }
}
