package com.uin.structurapattern.proxypattern.remoteproxy;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * 当涉及远程代理时，Java 提供了方便的方式来实现远程对象的访问和通信，通常使用 Java 的远程方法调用（Remote Method Invocation，RMI）或者使用更现代化的方式，
 * <p>
 * 比如基于 REST API 的远程访问。下面我将演示一个简单的使用 Java RMI 实现远程代理的例子。
 * <p>
 * 定义远程接口
 */
public interface RemoteService extends Remote {

  void performTask() throws RemoteException;
}
