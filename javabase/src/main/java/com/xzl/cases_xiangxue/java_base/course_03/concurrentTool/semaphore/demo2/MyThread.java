package com.xzl.cases_xiangxue.java_base.course_03.concurrentTool.semaphore.demo2;

public class MyThread extends Thread {
    private SemaphoreService service;

    public MyThread(String name, SemaphoreService service) {
        super();
        this.setName(name);
        this.service = service;
    }

    @Override
    public void run() {
        this.service.doSomething();
    }
}