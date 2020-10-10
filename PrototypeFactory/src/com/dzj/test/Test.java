package com.dzj.test;

import com.dzj.entity.Person;

/**
 * @author 董志京
 * @program PrototypeFactory
 * @create 2020-10-07 07:47
 */
public class Test {
    public static void main(String[] args) {
        //此时的两个对象处理名字不一样其他都一样，为了方便可以直接复制这时就用到了原型模式
        Person person = new Person();
        person.setName("小明");
        person.setSex("男");
        person.setAge(11);
        System.out.println("person:"+person);

        Person person1 = new Person();
        person1.setName("小红");
        person1.setSex("男");
        person1.setAge(11);
        //此时仅仅是两个变量引用同一个对象
        Person person3 = person;
        System.out.println("person3:"+person3);
        try {
            //此时会克隆一个对象，此时person2和person并不是同一个对象
            Person person2 = person.clone();
            person2.setName("小黑");
            System.out.println("person2:"+person2);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
