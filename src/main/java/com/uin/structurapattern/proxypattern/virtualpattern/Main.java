package com.uin.structurapattern.proxypattern.virtualpattern;

public class Main {

  public static void main(String[] args) {
    Image cat  = new ProxyImage("cat.jpg");
    Image dog  = new ProxyImage("dog.jpg");

    // 图片未加载 只显示代理创建信息
    cat.display();
    dog.display();

    // 再次显示图片 这次会加载真实图片并显示
    cat.display();
    dog.display();
  }
}
