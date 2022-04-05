package com.haydikodlayalim.dpatterns.d4_decorator;

public class IPhone11 extends PhoneDecorator{

    public IPhone11(Phone basicPhone) {
        super(basicPhone);
    }

    @Override
    public String getName() {
        return super.getName() + "11";
    }

}