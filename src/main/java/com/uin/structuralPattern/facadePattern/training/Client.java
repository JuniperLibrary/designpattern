package com.uin.structuralPattern.facadePattern.training;

import com.uin.structuralPattern.facadePattern.training.facadeClass.BackupFacade;

public class Client {

  public static void main(String[] args) {
    BackupFacade backupFacade = new BackupFacade();
    backupFacade.backupAll();
  }
}
