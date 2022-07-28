package com.uin.creationpattern.singleton.BadMash.StaticConstants;

/**
 * \* Created with IntelliJ IDEA.
 * \* @author wanglufei
 * \* Date: 2021年08月27日 15:06
 * \* Description: 恶汉式(静态变量)
 * \
 */
public class Test {
    public static void main(String[] args) {
        //测试
        singleton instance1 = singleton.getInstance();
        singleton instance2 = singleton.getInstance();
        System.out.println(instance1 == instance2); //true
        /**
         * 测试结果为：true
         * 结论： 为同一个对象
         */
        //===============================================

        //测试
        System.out.println(instance1.hashCode());
        System.out.println(instance2.hashCode());
        /**
         * 测试结果为：460141958
         * 结论： 说明这两个对象实例是同一个对象实例
         */
        //**************************************************
        /**
         *  思考：
         *      恶汉式的静态变量对象实例化有什么问题？
         *  总结：
         *      优缺点
         *          (1) 优点：这种写法比较简单，就是在类加载的时候就完成了实例化。避免了线程同步的问题。
         *          (2) 缺点： 在类加载的时候就完成了实例化，没有达到懒加载(Lazy Loadding)的效果。如果从始至终从未使
         *                     用过这个实例，则会造成内存的浪费。
         *      说明： 这种方式基于ClassLoder机制避免了多线程的同步问题，不过，instance在类加载的时候就实例化，在单例模式
         *             中大多数都是调用getInstance(),但是导致类加载的原因有很多种，因此不能确定有其他的方法（或者其他的静态方法）
         *             导致类装载，这时候初始化instance就有达到Lazy Loadding的效果。
         *      结论：这种单例模式可用，可能造成内存的浪费。
         */

    }
}
