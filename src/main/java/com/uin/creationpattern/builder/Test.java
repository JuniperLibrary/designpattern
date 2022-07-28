package com.uin.creationpattern.builder;

public class Test {
    public static void main(String[] args) {
        AbstractBuilder builder = new XiaomiBuilder();
//        builder.custormCam("12");
//        builder.custormCpu("123");
//        builder.custormDisk("123")
//        builder.custormMem("313");
//        Phone product = builder.getProduct();

        //链式编程
        Phone phone = builder.custormCpu("12")
                .custormMem("12")
                .custormDisk("12")
                .custormCam("12")
                .getProduct();
        System.out.println(phone);

        Phone p1 = Phone.builder()
                .cam("1")
                .cpu("2")
                .disk("3")
                .mem("4")
                .build();
        System.out.println(p1);

    }
}
