package com.uin.creationPattern.Singleton.BadMash.StaticConstants;

/**
 * \* Created with IntelliJ IDEA.
 * \* @author wanglufei
 * \* Date: 2021年08月27日 15:07
 * \* Description: 第一种 恶汉式(静态变量)
 * \
 */
public class singleton {

    //1. 构造器私有化,外部不能创建实例化对象（new）
    private singleton() {

    }

    //2. 在类内部创建实例化对象
    private static final singleton instance = new singleton();

    //3. 对外提供一个公有的静态方法，返回实例对象
    public static singleton getInstance() {
        return instance;
    }
}
