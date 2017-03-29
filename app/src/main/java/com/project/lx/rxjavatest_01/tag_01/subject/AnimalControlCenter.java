package com.project.lx.rxjavatest_01.tag_01.subject;

import com.project.lx.rxjavatest_01.tag_01.observer.Animal;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: X_Meteor
 * @description: 被观察者的抽象类
 * @version: V_1.0.0
 * @date: 2017/3/29 0029 14:55
 * @company: 洛阳魅力文化传媒   http://www.fenglin.tv/
 * @email: lx802315@163.com
 */
public abstract class AnimalControlCenter {

    //初始化一个观察者集合
    protected List<Animal> animalList;
    public AnimalControlCenter() {
        animalList = new ArrayList<>();
    }

    //向观察者集合中添加一个对象
    public void add(Animal animal){
        animalList.add(animal);
    }

    //从观察者集合中删除一个对象
    public void remove(Animal animal){
        if (animalList.contains(animal)){
            animalList.remove(animal);
        }
    }

    //抽象化方法，通知所有对象
    public abstract String noitfy();
}
