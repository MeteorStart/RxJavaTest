package com.project.lx.rxjavatest_01.tag_01.observer;

import android.util.Log;

/**
 * @author: X_Meteor
 * @description: 类描述
 * @version: V_1.0.0
 * @date: 2017/3/29 0029 15:09
 * @company: 洛阳魅力文化传媒   http://www.fenglin.tv/
 * @email: lx802315@163.com
 */
public class Dog implements Animal {
    @Override
    public String printName() {
        Log.i("NAME", "我是一只狗，汪汪汪 ");
        return "我是一只狗，汪汪汪 ";
    }
}
