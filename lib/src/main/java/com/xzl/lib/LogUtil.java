package com.xzl.lib;

import java.text.SimpleDateFormat;
import java.util.Date;

public class LogUtil {
    private static SimpleDateFormat formater
            = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss_SSS");
    private static String TAG = "XiangXue";
    public static void d(String tag,String msg){
        System.out.println(formater.format(new Date())+" "+tag+" "+msg);
    }

    public static void d(String msg){
        System.out.println(formater.format(new Date())+" "+TAG+" "+msg);
    }
}
