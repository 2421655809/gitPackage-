package com.dzj.test;

import com.dzj.entity.Person;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 董志京
 * @program PrototypeFactory
 * @create 2020-10-07 08:06
 */
public class Test2 {
    public static void main(String[] args) {
        Person person = new Person();
        List<String> list = new ArrayList<>();
        list.add("Jams");
        list.add("Haimi");
        person.setFirends(list);
        System.out.println(person);
        try {
            Person person1 = person.clone();
            list.add("xiami");
            System.out.println(person);
            System.out.println(person1);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
