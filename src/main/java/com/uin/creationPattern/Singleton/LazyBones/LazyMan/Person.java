package com.uin.creationPattern.Singleton.LazyBones.LazyMan;

/**
 * 第一种方法 懒汉(线程不安全)
 */
public class Person {

    private String name;
    private int age;

    /**
     * 懒汉--需要的时候在创建对象
     */
    private static Person instance;

    /**
     * 构造器私有，外部不能实例化
     */
    private Person() {

    }

    /**
     * 提供一个静态的公有方法，当使用该方法时才去创建instance
     */
    public static Person wanglufeiPerson() {
        //没有在去创建
        if (instance == null) {
            instance = new Person();
        }
        return instance;
    }
}
