package com.haydikodlayalim.shoppingapp.product.domain.es;

import org.springframework.data.elasticsearch.annotations.Document;

@Document(indexName = "company")
public class CompanyEs {
    private String id;
    private String name;
    private String code;
}
