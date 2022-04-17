package com.haydikodlayalim.shoppingapp.product.domain.es;

import lombok.Builder;
import lombok.Data;
import org.springframework.data.elasticsearch.annotations.Document;

@Data
@Builder
@Document(indexName = "company")
public class CompanyEs {
    private String id;
    private String name;
    private String code;
}