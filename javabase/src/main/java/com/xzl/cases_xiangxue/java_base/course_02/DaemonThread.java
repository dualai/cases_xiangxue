package com.xzl.cases_xiangxue.java_base.course_02;

import java.util.concurrent.ExecutionException;

/**
 * @author Mark老师 享学课堂 https://enjoy.ke.qq.com
 *
 *  类说明：守护线程的使用和守护线程中的finally语句块
 */
public class DaemonThread {
	
	private static class UseThread extends Thread {
		@Override
		public void run() {
			try {
				while (!isInterrupted()) {
					System.out.println(Thread.currentThread().getName()
							+ " I am extends Thread.");
				}
				System.out.println(Thread.currentThread().getName() 
						+ " interrupt flag is " + isInterrupted());

				System.out.println("11111111111");
				System.out.println("222222222");
				System.out.println("3333333");
			} finally {
				System.out.println("...........finally");
			}
		}
	}

	public static void main(String[] args) throws InterruptedException, 
		ExecutionException {
		UseThread useThread = new UseThread();
		useThread.setDaemon(true);
		useThread.start();
		Thread.sleep(100);
		//useThread.interrupt();
	}
}
