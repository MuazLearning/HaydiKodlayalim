package com.haydikodlayalim.dpatterns.d5_facade;

public class CustomEncryptor {
    public static void main(String[] args) {
        String text = "Content";

//        AESEncryptor aesEncryptor = new AESEncryptor();
//        aesEncryptor.encrypt(text);
//
//        MD5Encryptor md5Encryptor = new MD5Encryptor();
//        md5Encryptor.encrypt(text, "KEY");
//
//        SHAEncryptor shaEncryptor = new SHAEncryptor();
//        shaEncryptor.encrypt(text, "KEY", true);

        EncryptorFacade encryptorFacade = new EncryptorFacade();
        encryptorFacade.encrypt(text, EncryptorFacade.EncryptorType.AES);
        encryptorFacade.encrypt(text, EncryptorFacade.EncryptorType.MD5);
        encryptorFacade.encrypt(text, EncryptorFacade.EncryptorType.SHA);

    }
}
