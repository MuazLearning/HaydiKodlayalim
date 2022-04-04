package com.haydikodlayalim.dpatterns.singleton;

public class Main {

    public static void main(String[] args) {

//        EagerInitializationSingleton eagerInitializationSingleton = new EagerInitializationSingleton();
        S1_EagerInitializationSingleton.getInstance().singletonMethod();
        S2_StaticBlockSingleton.getInstance().singletonMethod();
        S3_LazySingleton.getInstance().singletonMethod();
        S4_ThreadSafeSingleton.getInstance().singletonMethod();
        S5_BillPughSingleton.getInstance().singletonMethod();

    }
}
