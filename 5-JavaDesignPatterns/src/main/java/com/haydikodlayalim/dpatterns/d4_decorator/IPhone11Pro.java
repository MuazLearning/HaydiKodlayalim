package com.haydikodlayalim.dpatterns.d4_decorator;

public class IPhone11Pro extends PhoneDecorator {

    public IPhone11Pro(Phone basicPhone) {
        super(basicPhone);
    }

    @Override
    public String getName() {
        return super.getName() + "11 Pro";
    }

    @Override
    public int getCameraCount() {
        return super.getCameraCount() + 1;
    }

    @Override
    public Double getPrice() {
        return super.getPrice() + 100;
    }
}
