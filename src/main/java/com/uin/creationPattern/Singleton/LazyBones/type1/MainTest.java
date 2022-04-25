package com.uin.creationPattern.Singleton.LazyBones.type1;

/**
 * \* Created with IntelliJ IDEA.
 * \* @author wanglufei
 * \* Date: 2021年08月27日 14:59
 * \* Description:
 * \
 */
public class MainTest {
    public static void main(String[] args) {
        //测试
        Person person1 = Person.wanglufeiPerson();
        Person person2 = Person.wanglufeiPerson();
        System.out.println(person1 == person2);

        //测试
        System.out.println(person1.hashCode());
        System.out.println(person2.hashCode());

        /**
         * 总结: 懒汉式（线程不安全）优缺点
         *     (1) 起到了Lazy Loadding的效果，但是只能在单线程的情况下使用
         *     (2) 如果在多线程下，一个线程进入了if(instance==null)判断语句块，还未来得及往下执行，另一个线程也通过了
         *         这个判断语句这时就会产生多个实例。所以在多线程的情况下不可使用这种方式。
         * 结论： 在实际开发中，不要使用这种方式。
         */
    }
}
