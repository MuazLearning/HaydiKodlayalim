package com.haydikodlayalim.shoppingapp.product.domain;

public class ProductImage {
    private ImageType imageType;
    private String url;


    private enum ImageType {
        FEAUTURE,
        NORMAL
    }
}
