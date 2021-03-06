package com.xzl.cases_xiangxue.java_base.course_02.tools;

import java.util.concurrent.TimeUnit;

/**
 * 
 *@author Mark老师   享学课堂 https://enjoy.ke.qq.com 
 *
 *更多课程咨询 安生老师 QQ：669100976  VIP课程咨询 依娜老师  QQ：2470523467
 *
 *类说明：线程休眠辅助工具类
 */
public class SleepTools {
	
	/**
	 * 按秒休眠
	 * @param seconds 秒数
	 */
    public static final void second(int seconds) {
        try {
            TimeUnit.SECONDS.sleep(seconds);
        } catch (InterruptedException e) {
        }
    }
    
    /**
     * 按毫秒数休眠
     * @param millions 毫秒数
     */
    public static final void ms(int millions) {
        try {
            TimeUnit.MILLISECONDS.sleep(millions);
        } catch (InterruptedException e) {
        }
    }
}
