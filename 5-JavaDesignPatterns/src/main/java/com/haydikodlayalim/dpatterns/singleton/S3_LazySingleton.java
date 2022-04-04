package com.haydikodlayalim.dpatterns.singleton;

public class S3_LazySingleton {

    private static S3_LazySingleton instance;

    private S3_LazySingleton() {

    }

    public static S3_LazySingleton getInstance() {
        if (instance == null) {
            instance = new S3_LazySingleton();
        }
        return instance;
    }

    public void singletonMethod() {
        System.out.println("Lazy Singleton method");
    }

}
