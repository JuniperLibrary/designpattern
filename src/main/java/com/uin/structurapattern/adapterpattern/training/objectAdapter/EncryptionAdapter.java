package com.uin.structurapattern.adapterpattern.training.objectAdapter;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class EncryptionAdapter implements Encryption{

  private final ThirdPartyEncryption thirdPartyEncryption;

  @Override
  public String encrypt(String data) {
    return thirdPartyEncryption.encryptData(data);
  }
}
