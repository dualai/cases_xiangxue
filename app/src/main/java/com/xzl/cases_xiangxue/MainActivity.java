package com.xzl.cases_xiangxue;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.xzl.cases_xiangxue.java_base.course_01.Activity01;
import com.xzl.cases_xiangxue.java_base.course_02.Activity02;
import com.xzl.cases_xiangxue.java_base.course_03.Activity03;

public class MainActivity extends AppCompatActivity {

    /**
     * Activity01：反射及动态代理
     * Activity02: 线程基础、线程之间的共享和协作
     * Activity03:
     */

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        startActivity(new Intent(this, Activity01.class));
//        startActivity(new Intent(this, Activity02.class));
        startActivity(new Intent(this, Activity03.class));
        finish();
    }
}
