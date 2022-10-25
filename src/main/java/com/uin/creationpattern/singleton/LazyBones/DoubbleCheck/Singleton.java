package com.uin.creationpattern.singleton.LazyBones.DoubbleCheck;

/**
 * 第四种 懒汉双重检查
 */
public class Singleton {

    /**
     * 当一个变量定义为volatile之后，它将具备两种特性
     * 1. 保证此变量对所有线程的可见性
     * 这里不做过多解释，简单的说就是，当一个线程修改了volatile变量之后，它先写入它的工作内存中，
     * 然后立刻写入主内存，并且刷新其他线程中的工作内存，这样其他线程再去读取他们工作内存中的变量时，
     * 确保能够拿到最新的。但是如果是普通变量的话，它不会立即写入主内存中，所有其他线程的工作内存中保存的是旧的值。
     * 所有volatile变量可以保证可见性。
     * 2. 禁止指令重排序优化
     */
    private static volatile Singleton instance;

    //1. 构造器私有化，外部不能通过new来实例化对象
    private Singleton() {

    }

    //提供一个静态的公有方法，加入双重检查代码，解决线程安全问题，同时解决懒加载问题
    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }

    public static void main(String[] args) {
        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();

        //测试
        System.out.println(instance1 == instance2);

        System.out.println(instance1.hashCode());
        System.out.println(instance2.hashCode());

        /**
         * 总结：双重检查的优缺点
         *  (1) Double-Check概念是多线程开发中常使用到的，如代码所示，我们进行了两次if(singleton==null)检查，这样就
         *      保证了线程安全
         *  (2) 这样，实例化代码只用执行一次，后面再次访问时，直接if(singleton==null)，为FALSE，直接return实例化对象，也避免
         *      了反复进行方法同步
         *  (3) 线程安全：延迟加载；效率较高
         *  结论： 在实际开发中，推荐使用这种的单例设计模式
         */
    }
}
