package com.haydikodlayalim.shoppingapp.product.model.category;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class CategorySaveRequest {
    private String name;
}
