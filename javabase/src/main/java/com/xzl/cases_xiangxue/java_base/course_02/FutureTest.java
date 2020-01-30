package com.xzl.cases_xiangxue.java_base.course_02;

import com.xzl.lib.LogUtil;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;

public class FutureTest {

    private static class UseCall implements Callable<String>{
        @Override
        public String call() throws Exception {
            LogUtil.d("call method...thread "+Thread.currentThread());
            Thread.sleep(2000);
            return "call result 123";
        }
    }


    public static void main(String[] args) {

        UseCall useCall = new UseCall();
        FutureTask<String> futureTask = new FutureTask<>(useCall);
        new Thread(futureTask).start();

        try {
            //get方法堵塞...
            LogUtil.d(futureTask.get()+" thread "+Thread.currentThread());
        } catch (ExecutionException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
