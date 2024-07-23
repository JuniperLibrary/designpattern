package com.uin.structuralPattern.adapterPattern.training.classAdapter;

public class Main {

  public static void main(String[] args) {
    Encryption encryption = new EncryptionAdapter();

    String userData = "user_password";
    String encryptedData = encryption.encrypt(userData);

    Database database = new Database();
    database.saveEncryptedData(encryptedData);
  }
}
