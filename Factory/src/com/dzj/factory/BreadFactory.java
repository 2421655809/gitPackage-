package com.dzj.factory;

/**
 * @author 董志京
 * @program Factory
 * @create 2020-10-08 18:55
 * 继承接口工厂并实现其方法
 */
public class BreadFactory extends Factory<Bread>{
    /**
     * @param cls 类的全路径，根据路径创建对象
     * @return 面包类型（Bread），通过反射的方法创建的对象，如果没有找到类就返回空
     */
    @Override
    public Bread newInstance(String cls) {
        Bread bread = null;
        try {
            Class<?> aClass = Class.forName(cls);
            bread = (Bread) aClass.newInstance();
            return bread;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
