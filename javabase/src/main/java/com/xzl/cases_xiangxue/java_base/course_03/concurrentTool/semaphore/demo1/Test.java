package com.xzl.cases_xiangxue.java_base.course_03.concurrentTool.semaphore.demo1;

public class Test {
    public static void main(String[] args) {
        SemaphoreService service = new SemaphoreService();
        for (int i = 0; i < 10; i++) {
            MyThread t = new MyThread("thread" + (i + 1), service);
            t.start();// 这里使用 t.run() 也可以运行，但是不是并发执行了
        }
    }
}
