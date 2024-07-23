package com.uin.structuralPattern.adapterPattern.training.objectAdapter;

public class Main {
  public static void main(String[] args) {
    ThirdPartyEncryption thirdPartyEncryption = new ThirdPartyEncryption();
    Encryption encryption = new EncryptionAdapter(thirdPartyEncryption);

    String userData = "user_password";
    String encryptedData = encryption.encrypt(userData);

    Database database = new Database();
    database.saveEncryptedData(encryptedData);
  }
}
