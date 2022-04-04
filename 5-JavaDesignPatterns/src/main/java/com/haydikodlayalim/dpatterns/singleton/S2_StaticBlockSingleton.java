package com.haydikodlayalim.dpatterns.singleton;

public class S2_StaticBlockSingleton {

    private static S2_StaticBlockSingleton instance;

    private S2_StaticBlockSingleton() {

    }

    static {
        try {
            instance = new S2_StaticBlockSingleton();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static S2_StaticBlockSingleton getInstance() {
        return instance;
    }

/*    public static StaticBlockSingleton getInstance() {
        if (instance == null) {
            synchronized (StaticBlockSingleton.class) {
                if (instance == null) {
                    instance = new StaticBlockSingleton();
                }
            }
        }
        return instance;
    }*/

    public void singletonMethod() {
        System.out.println("Static Block Singleton method");
    }

}