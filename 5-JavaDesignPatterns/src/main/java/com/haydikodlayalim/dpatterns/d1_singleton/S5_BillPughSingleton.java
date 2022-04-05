package com.haydikodlayalim.dpatterns.d1_singleton;

public class S5_BillPughSingleton {

    private S5_BillPughSingleton() {

    }

    // Ne zaman lazım olursa o zaman bu class çalışır
    private static class SingletonHelper {
        private static final S5_BillPughSingleton INSTANCE = new S5_BillPughSingleton();
    }

    public static S5_BillPughSingleton getInstance() {
        return SingletonHelper.INSTANCE;
    }

    public void singletonMethod() {
        System.out.println("Bill Pugh Singleton method");
    }

}