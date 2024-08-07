package com.uin.structurapattern.facadepattern.training.facadeclass;

import com.uin.structurapattern.facadepattern.training.subsystem.ContactManager;
import com.uin.structurapattern.facadepattern.training.subsystem.MusicManager;
import com.uin.structurapattern.facadepattern.training.subsystem.PhotoManager;
import com.uin.structurapattern.facadepattern.training.subsystem.SmsManager;
import lombok.extern.slf4j.Slf4j;

/**
 * 外观模式 一件备份的类
 */
@Slf4j
public class BackupFacade {

  private ContactManager contactManager;
  private SmsManager smsManager;
  private PhotoManager photoManager;
  private MusicManager musicManager;

  public BackupFacade() {
    contactManager = new ContactManager();
    smsManager = new SmsManager();
    photoManager = new PhotoManager();
    musicManager = new MusicManager();
  }

  public void backupAll() {
    log.info("Starting backup...");
    contactManager.backupContacts();
    smsManager.backupSms();
    photoManager.backupPhotos();
    musicManager.backupMusic();
    log.info("Backup completed successfully.");
  }
}
