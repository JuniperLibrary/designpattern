package com.uin.structurapattern.facadepattern.training;

import com.uin.structurapattern.facadepattern.training.facadeclass.BackupFacade;

public class Client {

  public static void main(String[] args) {
    BackupFacade backupFacade = new BackupFacade();
    backupFacade.backupAll();
  }
}
