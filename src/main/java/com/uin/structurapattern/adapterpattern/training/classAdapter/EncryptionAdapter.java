package com.uin.structurapattern.adapterpattern.training.classAdapter;

public class EncryptionAdapter extends ThirdPartyEncryption implements Encryption{

  @Override
  public String encrypt(String data) {
    return encryptData(data);
  }
}
