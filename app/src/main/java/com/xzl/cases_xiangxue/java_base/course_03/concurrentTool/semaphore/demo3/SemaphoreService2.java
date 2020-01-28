package com.xzl.cases_xiangxue.java_base.course_03.concurrentTool.semaphore.demo3;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.Semaphore;

public class SemaphoreService2 {

    private static SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");

    private Semaphore semaphore = new Semaphore(6);

    public void doSomething() {
        try {
            semaphore.acquire(2);
            System.out.println(Thread.currentThread().getName() + ":doSomething start-" + getFormatTimeStr());
            Thread.sleep(2000);
            System.out.println(Thread.currentThread().getName() + ":doSomething end-" + getFormatTimeStr());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            semaphore.release(2);
        }
    }

    public int availablePermits() {    // 查看可用通路数
        return semaphore.availablePermits();
    }
    public static String getFormatTimeStr() {
        return sf.format(new Date());
    }

}
