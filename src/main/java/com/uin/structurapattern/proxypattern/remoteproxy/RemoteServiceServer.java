package com.uin.structurapattern.proxypattern.remoteproxy;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import lombok.extern.slf4j.Slf4j;

/**
 * 模拟远程服务
 */
@Slf4j
public class RemoteServiceServer {

  public static void main(String[] args) {
    try {
      // 创建 RMI 注册表 指定端口 1099
      LocateRegistry.createRegistry(1099);
      // 创建远程对象
      RemoteService service = new RemoteServiceImpl();
      // 将远程对象绑定到注册表上
      Naming.rebind("rmi://localhost:1099/RemoteService", service);
      log.info("远程服务器已启动。");
    } catch (RemoteException | MalformedURLException e) {
      e.printStackTrace();
    }
  }
}
