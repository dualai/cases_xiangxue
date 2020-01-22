package com.xzl.cases_xiangxue.java_base.course_01;

import com.xzl.lib.LogUtil;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;


/**
 * InvocationHandler 对真实对象方法进行增强。。。比如统计方法执行时长...
 */

public class BusinessCompany implements InvocationHandler {

    /*持有的真实业务对象*/
    private Object business;

    public Object getBusiness() {
        return business;
    }

    public BusinessCompany(Object business) {
        this.business = business;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        doSthAfter();
        Object result = method.invoke(business, args);
        doSthBefore();
        return result;
    }

    /*前置处理器*/
    private void doSthAfter() {
        LogUtil.d("doSthAfter...");
    }

    /*后置处理器*/
    private void doSthBefore() {
        LogUtil.d("doSthBefore...");
    }
}
