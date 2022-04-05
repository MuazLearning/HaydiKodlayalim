package com.haydikodlayalim.dpatterns.d1_singleton;

public class S4_ThreadSafeSingleton {

    private static S4_ThreadSafeSingleton instance;

    private S4_ThreadSafeSingleton() {

    }

    // synchronized keyword is used to make sure that only one thread can access this method at a time.
    // Dezavantajı JVM kontrolü yaparken zaman kaybederiz.
    public static synchronized S4_ThreadSafeSingleton getInstance() {
        if (instance == null)
            instance = new S4_ThreadSafeSingleton();
        return instance;
    }

    public void singletonMethod() {
        System.out.println("Thread Safe Singleton method");
    }

}
