package com.haydikodlayalim.shoppingapp.product.service;

import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
public class ProductDeliveryService {

    public String getDeliveryInfo(String productId) {
        // TODO: Implement delivery info
        return "Tomorrow";
    }

    public Boolean freeDeliveryCheck(String productId, BigDecimal price) {
        // TODO: Implement free delivery check
        return price.compareTo(BigDecimal.ONE) > 0;
    }
}