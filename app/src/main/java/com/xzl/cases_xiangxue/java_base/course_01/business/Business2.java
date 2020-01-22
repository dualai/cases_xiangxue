package com.xzl.cases_xiangxue.java_base.course_01.business;

import com.xzl.lib.LogUtil;

public class Business2 implements IBusiness2 {
    @Override
    public String doAction2() {
        LogUtil.d("买喝的");
        return "买了一屏可乐";
    }
}
