package com.haydikodlayalim.dpatterns.d4_decorator;

public class IPhone11ProMax extends IPhone11Pro{

    public IPhone11ProMax(Phone basicPhone) {
        super(basicPhone);
    }

    @Override
    public String getName() {
        return super.getName() + " Max";
    }

    @Override
    public Double getPrice() {
        return super.getPrice() + 100;
    }

    public String extraMethod(){
        return "Kırmızı renkli";
    }

}
