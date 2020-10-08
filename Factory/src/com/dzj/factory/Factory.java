package com.dzj.factory;

/**
 * @author 董志京
 * @program Factory
 * @create 2020-10-08 18:11
 * 抽象工厂
 */
public abstract class Factory<T> {

    /**
     * @param cls 类的全路径，根据路径创建对象
     * @return  返回的是子类指定的类型
     */
    public abstract T newInstance(String cls);
}
