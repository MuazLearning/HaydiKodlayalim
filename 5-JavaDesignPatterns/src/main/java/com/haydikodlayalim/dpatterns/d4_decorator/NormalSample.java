package com.haydikodlayalim.dpatterns.d4_decorator;

public class NormalSample {

    public static class Iphone11{
        String name(){
            return "Iphone 11";
        }

        int getCamera(){
            return 2;
        }
    }

    public static class Iphone11Pro{
        String name(){
            return "Iphone 11 Pro";
        }
        int getCamera(){
            return 3;
        }
    }

    public static class Iphone11Max{
        String name(){
            return "Iphone 11 Max";
        }
        int getCamera(){
            return 3;
        }
    }

}
