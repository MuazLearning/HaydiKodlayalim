package com.haydikodlayalim.dpatterns.d4_decorator;

public class Main {

    public static void main(String[] args) {
        Phone phone = new IPhone11ProMax(new IPhone());

        System.out.println("Name: " + phone.getName());
        System.out.println("Camera Count: " + phone.getCameraCount());
        System.out.println("Price: " + phone.getPrice());
    }

}
