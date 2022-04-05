package com.haydikodlayalim.dpatterns.d1_singleton;

public class S1_EagerInitializationSingleton {

    private static final S1_EagerInitializationSingleton INSTANCE = new S1_EagerInitializationSingleton();

    private S1_EagerInitializationSingleton() { // Private olarak boş cunstructor oluşturarak new'lenmesi engellenir.

    }

    public static S1_EagerInitializationSingleton getInstance() {
        return INSTANCE;
    }

    public void singletonMethod() {
        System.out.println("Eager Singleton method");
    }
}
