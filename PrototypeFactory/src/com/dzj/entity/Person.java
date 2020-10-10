package com.dzj.entity;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 董志京
 * @program PrototypeFactory
 * @create 2020-10-07 07:46
 */
public class Person implements Cloneable{

    private String name;
    private String sex;
    private Integer age;
    //一般克隆都可以克隆，但是对于引用类型并不会深入克隆，这时就需要手动进行克隆
    private List<String> firends;

    public Person() {
    }

    public Person(String name, String sex, Integer age, List<String> firends) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.firends = firends;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public List<String> getFirends() {
        return firends;
    }

    public void setFirends(List<String> firends) {
        this.firends = firends;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", age=" + age +
                ", firends=" + firends +
                '}';
    }

    //当某有试下clonable接口时就没有克隆
    public Person clone() throws CloneNotSupportedException {
        //进行克隆
        Person person = (Person) super.clone();
        //创建集合用于存放所有朋友
        List<String> list = new ArrayList<>();
        //循环获取朋友并添加到集合中
        for(String name : this.getFirends()){
            list.add(name);
        }
        //将朋友集合添加到对象中
        person.setFirends(list);
        return person;
    }
}
