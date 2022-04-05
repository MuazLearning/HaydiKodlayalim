package com.haydikodlayalim.dpatterns.d4_decorator;

public class PhoneDecorator implements Phone {

    protected Phone phone;

    public PhoneDecorator(Phone basicPhone) {
        this.phone = basicPhone;
    }

    @Override
    public String getName() {
        return phone.getName();
    }

    @Override
    public int getCameraCount() {
        return phone.getCameraCount();
    }

    @Override
    public Double getPrice() {
        return phone.getPrice();
    }
}
