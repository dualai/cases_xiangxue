package com.xzl.cases_xiangxue.java_base.course_03.concurrentTool.semaphore.demo4;


public class MyThread extends Thread {
    private SemaphoreService2 service;

    public MyThread(String name, SemaphoreService2 service) {
        super();
        this.setName(name);
        this.service = service;
    }

    @Override
    public void run() {
        this.service.doSomething();
    }
}