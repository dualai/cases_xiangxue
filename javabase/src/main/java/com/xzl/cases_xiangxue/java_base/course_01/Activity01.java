package com.xzl.cases_xiangxue.java_base.course_01;

import android.os.Bundle;
import android.os.Debug;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.xzl.cases_xiangxue.java_base.course_01.business.Business1;
import com.xzl.cases_xiangxue.java_base.course_01.business.Business2;
import com.xzl.cases_xiangxue.java_base.course_01.business.IBusiness1;
import com.xzl.cases_xiangxue.java_base.course_01.business.IBusiness2;
import com.xzl.lib.LogUtil;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/***
 * 反射：class constructor method field  getClass().getClassLoader()
 */
/**
 * 代理模式
 * 静态代理: 执行最终方法的上下可以处理额外的操作,缺点，麻烦，一个被代理，就弄一个代理; 被代理对象越多，代理对象也越多。。。
 *
 * 动态代理: 见代码
 */
public class Activity01 extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        IBusiness1 business1 = new Business1();
        IBusiness2 business2 = new Business2();

        InvocationHandler invocationHandler1 = new BusinessCompany(business1);
        InvocationHandler invocationHandler2 = new BusinessCompany(business2);


        IBusiness1 proxyBusiness1 = (IBusiness1) Proxy.newProxyInstance(business1.getClass().getClassLoader(),business1.getClass().getInterfaces(),invocationHandler1);
        proxyBusiness1.doAction1();

        IBusiness2 proxyBusiness2 = (IBusiness2) Proxy.newProxyInstance(business2.getClass().getClassLoader(),business2.getClass().getInterfaces(),invocationHandler2);
        String result = proxyBusiness2.doAction2();

        LogUtil.d("action2 result "+result);

        Debug.startMethodTracing();
    }
}
