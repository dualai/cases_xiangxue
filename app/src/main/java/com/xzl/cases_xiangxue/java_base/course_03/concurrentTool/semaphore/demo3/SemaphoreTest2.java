package com.xzl.cases_xiangxue.java_base.course_03.concurrentTool.semaphore.demo3;

public class SemaphoreTest2 {
    public static void main(String args[]) {
        SemaphoreService2 service = new SemaphoreService2();
        for (int i = 0; i < 10; i++) {
            MyThread t = new MyThread("thread" + (i + 1), service);
            t.start();
            System.out.println("可用通路数：" + service.availablePermits());
        }
    }
}
