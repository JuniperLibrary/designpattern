package com.uin.creationpattern.singleton.LazyBones.SynchonizedCodeBlock;

/**
 * \* Created with IntelliJ IDEA. \* @author wanglufei \* Date: 2021年08月27日 17:22 \* Description:
 * 第三种方法 懒汉式(同步代码块) \
 */
public class Singleton {

  //1. 构造器私有化,外部不能创建实例化对象（new）
  private Singleton() {

  }

  //2. 懒汉--需要的时候在创建对象
  private static Singleton instance;

  //3. 提供一个静态的公有方法，加入了同步代码块，解决不了线程安全的问题 但是还是效率太低
  public static Singleton getInstance() {
    if (instance == null) {
      synchronized (Singleton.class) {
        instance = new Singleton();
      }
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
     * 总结: 懒汉式（线程安全 加synchronized同步代码块）优缺点
     *   (1) 这种方式，本意是想对在静态方法加synchronized的该进，因为前面的同步方法的效率太低了，改为同步产生实例化
     *   的代码块
     *   (2) 但是这种同步并不能起到线程安全的作用。和懒汉式type1与遇到的情形一致。假如一个线程进入了if(instance==null)
     *   判断语句模块，还未来的及往下执行，另个一个线程也通过了这个判断语句，这时就会产生多个实例。
     *   (3) 结论：在实际开发中，不能使用这种方式
     */
  }
}
