package com.haydikodlayalim.dpatterns.d4_decorator;

public class IPhone implements Phone {

    @Override
    public String getName() {
        return "IPhone ";
    }

    @Override
    public int getCameraCount() {
        return 2;
    }

    @Override
    public Double getPrice() {
        return 999.90;
    }

}
