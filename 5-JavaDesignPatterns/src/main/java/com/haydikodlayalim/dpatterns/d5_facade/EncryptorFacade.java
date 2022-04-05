package com.haydikodlayalim.dpatterns.d5_facade;

public class EncryptorFacade {

    private AESEncryptor aesEncryptor = new AESEncryptor();
    private MD5Encryptor md5Encryptor = new MD5Encryptor();
    private SHAEncryptor shaEncryptor = new SHAEncryptor();

    public void encrypt(String text, EncryptorType encryptorType) {
        switch (encryptorType) {
            case AES:
                aesEncryptor.encrypt(text);
                break;
            case MD5:
                md5Encryptor.encrypt(text, "KEY");
                break;
            case SHA:
                shaEncryptor.encrypt(text, "KEY", true);
                break;
            default:
                throw new IllegalArgumentException("Invalid encryptor type");
        }
    }

    public enum EncryptorType {
        SHA, MD5, AES
    }

}
