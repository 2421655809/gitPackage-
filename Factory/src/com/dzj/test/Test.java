package com.dzj.test;

import com.dzj.factory.Bread;
import com.dzj.factory.BreadFactory;
import com.dzj.factory.InstantNoodles;
import com.dzj.factory.InstantNoodlesFactory;

/**
 * @author 董志京
 * @program Factory
 * @create 2020-10-08 18:14
 */
public class Test {
    public static void main(String[] args) {
        //创建一个面包工厂
        BreadFactory breadFactory = new BreadFactory();
        //调用面包工厂的创建对象方法，
        Bread bread = breadFactory.newInstance("com.dzj.factory.ToastBread");
        //调用方法
        bread.bake("火");

        Bread bread1 = breadFactory.newInstance("com.dzj.factory.RedDatesBread");
        bread1.bake("火");

        //创建一个方便面工厂
        InstantNoodlesFactory noodlesFactory = new InstantNoodlesFactory();
        //通过工厂创建一个红烧面对象
        InstantNoodles instantNoodles = noodlesFactory.newInstance("com.dzj.factory.BraisedInstantNoodles");
        //调用方法
        instantNoodles.Fried("油");
    }
}
