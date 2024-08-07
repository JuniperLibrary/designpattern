package com.uin.structurapattern.proxypattern.remoteproxy;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import lombok.extern.slf4j.Slf4j;

/**
 * 真实主题类
 */
@Slf4j
public class RemoteServiceImpl extends UnicastRemoteObject implements RemoteService {

  protected RemoteServiceImpl() throws RemoteException {
    super();
  }

  @Override
  public void performTask() throws RemoteException {
    log.info("在远程服务器上执行任务.");
  }
}
