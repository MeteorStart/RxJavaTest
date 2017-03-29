package com.project.lx.rxjavatest_01.tag_01.subject;

import com.project.lx.rxjavatest_01.tag_01.observer.Animal;

/**
 * @author: X_Meteor
 * @description: 动物园，具体的被观察者实现类
 * @version: V_1.0.0
 * @date: 2017/3/29 0029 15:06
 * @company: 洛阳魅力文化传媒   http://www.fenglin.tv/
 * @email: lx802315@163.com
 */
public class Zoo extends AnimalControlCenter{
    @Override
    public String noitfy() {
        String result = "";

        for (Animal animal : animalList){
            result += animal.printName() + "\r\n";
        }
        return result;
    }
}
