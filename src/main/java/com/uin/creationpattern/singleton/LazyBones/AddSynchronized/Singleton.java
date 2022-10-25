package com.uin.creationpattern.singleton.LazyBones.AddSynchronized;


/**
 * 第二种方法 懒汉（解决线程不安全--加入了同步锁）
 */
public class Singleton {

    //1. 构造器私有化,外部不能创建实例化对象（new）
    private Singleton() {

    }

    //2. 懒汉--需要的时候在创建对象
    private static Singleton instance;

    //3. 提供一个静态的公有方法，加入了同步处理的代码(同步锁)，解决了线程不安全的问题
    public static synchronized Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    public static void main(String[] args) {
        //测试
        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        System.out.println(instance1 == instance2);//true

        System.out.println(instance1.hashCode());//460141958
        System.out.println(instance2.hashCode());//460141958

        /**
         * 总结: 懒汉式（线程安全 加synchronized）优缺点
         *   (1) 解决了线程安全的问题
         *   (2) 效率太低了，每个线程在想获得类的实例的时候，执行getInstance()方法都要进行同步。而其实这个方法只执行一次实例
         *   化代码就够了，后面的项获得该类的实例，直接return就行了。但是你在getInstance()后面加了synchronized，在每一次都
         *   会同步。方法进行的同步效率太低。
         *   (3) 结论：在实际开发中，不推荐使用这种方式
         *
         */
    }


}
