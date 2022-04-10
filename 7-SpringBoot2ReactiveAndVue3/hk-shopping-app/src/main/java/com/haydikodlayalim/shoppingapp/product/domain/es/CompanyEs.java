package com.haydikodlayalim.shoppingapp.product.domain.es;

import lombok.Data;
import org.springframework.data.elasticsearch.annotations.Document;

@Data
@Document(indexName = "company")
public class CompanyEs {
    private String id;
    private String name;
    private String code;
}