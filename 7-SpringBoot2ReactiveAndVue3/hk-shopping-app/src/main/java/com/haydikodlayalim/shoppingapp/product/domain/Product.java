package com.haydikodlayalim.shoppingapp.product.domain;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "product")
@Getter
@Setter
@EqualsAndHashCode(of = "id")
public class Product {
    private String id;
    private String name;
    private String code;
    private String description;
    private String companyId;
    private String features;
    private String categoryId;
    private List<ProductImage> image;
    private Boolean active;
}
