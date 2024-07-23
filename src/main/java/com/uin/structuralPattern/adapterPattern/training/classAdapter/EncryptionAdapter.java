package com.uin.structuralPattern.adapterPattern.training.classAdapter;

public class EncryptionAdapter extends ThirdPartyEncryption implements Encryption{

  @Override
  public String encrypt(String data) {
    return encryptData(data);
  }
}
