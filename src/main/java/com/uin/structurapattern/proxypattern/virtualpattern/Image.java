package com.uin.structurapattern.proxypattern.virtualpattern;

/**
 * 比如实现一个简单的图片的加载器。在这个案例中，我们将创建一个虚拟代理来延迟还在图片的加载，直到需要的时候才真正的加载图片
 * <p>
 * 真实主题接口
 */
public interface Image {

  void display();
}
