package com.xzl.cases_xiangxue.java_base.course_01.business;

import com.xzl.lib.LogUtil;

public class Business1 implements IBusiness1 {
    @Override
    public void doAction1() {
        LogUtil.d("买吃的...");
    }
}
