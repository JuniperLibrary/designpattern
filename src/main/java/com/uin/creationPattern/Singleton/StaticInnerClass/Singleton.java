package com.uin.creationPattern.Singleton.StaticInnerClass;


/**
 * \* Created with IntelliJ IDEA.
 * \* @author wanglufei
 * \* Date: 2021年08月27日 19:37
 * \* Description: 使用静态内部类完成单例模式
 * \
 */
public class Singleton {

    //构造私有化
    private Singleton() {

    }

    //写一个静态内部类，该类中有一个静态的属性Singleton
    //使用了JVM底层装载类的时候，是线程安全的
    private static class SingletonInstace {
        //使用内部类可以延时加载。如果直接使用静态变量，因为加载子类等其它原因对实例进行了初始化，
        // 而此时并不需要该类的实例，造成了资源的浪费。
        private static final Singleton instances = new Singleton();
    }

    public static Singleton getInstance() {
        return SingletonInstace.instances;
    }

    public static void main(String[] args) {
        //测试
        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        System.out.println(instance1 == instance2);

        System.out.println(instance1.hashCode());
        System.out.println(instance2.hashCode());

        //***************************************
        /**
         * 总结： 静态内部类的优缺点
         *   (1) 这种方式采用了类装载的机制来保证初始化实例时只有一个线程
         *   (2) 静态内部类方式在SIngleton类被装载时并不会立即实例化，而是在需要实例化时，调用getInstance方法，才会
         *   装载Singleton类，从而完成Singleton的实例化
         *   (3) 类的静态属性只会在第一次加载类的时候初始化，所以这里，jvm帮助我们保证了线程安全的安全性，在类进行初始化时，
         *   别的线程时无法进入的
         *   (4) 优点： 避免了线程不安全，利用静态内部类的特点实现了延迟加载，效率高
         *    推荐使用
         *
         *    补充：
         *      静态内部类的两个特点：
         *
         */
    }
}
