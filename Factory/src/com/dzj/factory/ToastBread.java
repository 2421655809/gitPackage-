package com.dzj.factory;

/**
 * @author 董志京
 * @program Factory
 * @create 2020-10-08 18:53
 * 继承了面包类，并实现了其抽象方法
 */
public class ToastBread extends Bread{

    @Override
    public void bake(String fire) {
        System.out.println("吐司面包");
    }
}
