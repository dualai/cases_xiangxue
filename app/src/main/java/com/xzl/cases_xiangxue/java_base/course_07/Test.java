package com.xzl.cases_xiangxue.java_base.course_07;

import com.xzl.lib.LogUtil;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class Test {
    static ExecutorService threadPool;
    static ArrayBlockingQueue<Runnable> queue = new ArrayBlockingQueue<>(10);
    public static void main(String[] args) {
        threadPool = new ThreadPoolExecutor(4, 80, 60, TimeUnit.SECONDS, queue, new RejectedExecutionHandler() {
            @Override
            public void rejectedExecution(Runnable r, ThreadPoolExecutor executor) {
                LogUtil.d("rejectedExecution r "+r.toString());
            }
        });


        for (int i = 0 ; i < 100 ;i++){

            threadPool.execute(new Runnable() {
                @Override
                public void run() {
                    try {
                        Thread.sleep(100);
                        LogUtil.d("hahaha");
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            });

        }

    }

    public static class MyCallable implements Callable<String>{
        @Override
        public String call() throws Exception {
            return null;
        }
    }
}
