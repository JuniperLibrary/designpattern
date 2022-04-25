package com.uin.creationPattern.Singleton.BadMash.StaticCodeBlock;

/**
 * Created with IntelliJ IDEA.
 * @author wanglufei
 * Date: 2021年08月27日 15:41
 * Description: 第二种 恶汉静态代码块
 */
public class singleton {

    //1. 构造器私有化,外部不能创建实例化对象（new）
    private singleton() {

    }

    //2. 在类内部创建实例化对象
    //private final static singleton instance = new singleton();
    private static singleton instance;

    //在静态代码块中创建单例对象
    static {
        instance = new singleton();
    }

    //3. 对外提供一个公有的静态方法，返回实例对象
    public static singleton getInstance() {
        return instance;
    }

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
        //************************************************
        /**
         * 总结：优缺点
         *      (1) 这种方式和上面的方式其实类似，只不过将实例化的过程放在了静态代码块中，也是在类装载的时候，就执行静
         *          态代码块中的代码，初始化类的实例。有缺点和上面是一样的。
         */
    }

}
