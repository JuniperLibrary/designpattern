package com.uin.structurapattern.proxypattern.remoteproxy;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import lombok.extern.slf4j.Slf4j;

/**
 * 远程代理类，用于与远程服务交互 它实现了RemoteService接口，可以作为一个本地客户端来调用远程方法
 */
@Slf4j
public class RemoteServiceProxy implements RemoteService {

  // 远程服务对象引用
  private RemoteService remoteService;

  public RemoteServiceProxy() {
    try {
      // 尝试通过RMI查找并连接到远程服务
      remoteService = (RemoteService) Naming.lookup("rmi://localhost:1099/RemoteService");
    } catch (NotBoundException | MalformedURLException | RemoteException e) {
      e.printStackTrace();
    }
  }

  /**
   * 执行任务 在代理中可以添加权限检查、日志等功能
   * <p>
   * 实际上，这里执行的是远程服务的相关操作
   *
   * @throws RemoteException 如果远程调用失败
   */
  @Override
  public void performTask() throws RemoteException {
    // 在代理中可以添加权限检查、日志等功能
    log.info("代理：执行额外的检查。");
    // 调用远程服务的performTask方法
    remoteService.performTask();
  }

  /**
   * 主函数，用于测试远程代理
   *
   * @param args 命令行参数
   */
  public static void main(String[] args) {
    try {
      // 创建远程代理对象
      RemoteServiceProxy remoteServiceProxy = new RemoteServiceProxy();
      remoteServiceProxy.performTask();
    } catch (RemoteException e) {
      throw new RuntimeException(e);
    }
  }
}
