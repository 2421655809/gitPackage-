package com.dzj.factory;

/**
 * @author 董志京
 * @program Factory
 * @create 2020-10-08 18:59
 */
public class InstantNoodlesFactory extends Factory<InstantNoodles>{
    InstantNoodles instantNoodles = null;
    @Override
    public InstantNoodles newInstance(String cls) {
        try {
            Class<?> aClass = Class.forName(cls);
            instantNoodles = (InstantNoodles) aClass.newInstance();
            return instantNoodles;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
