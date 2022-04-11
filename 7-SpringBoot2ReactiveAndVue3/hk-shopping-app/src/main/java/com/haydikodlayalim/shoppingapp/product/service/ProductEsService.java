package com.haydikodlayalim.shoppingapp.product.service;

import com.haydikodlayalim.shoppingapp.product.domain.Product;
import com.haydikodlayalim.shoppingapp.product.domain.es.CategoryEs;
import com.haydikodlayalim.shoppingapp.product.domain.es.CompanyEs;
import com.haydikodlayalim.shoppingapp.product.domain.es.ProductEs;
import com.haydikodlayalim.shoppingapp.product.repository.es.ProductEsRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
@RequiredArgsConstructor
public class ProductEsService {

    private final ProductEsRepository productEsRepository;

    public Mono<ProductEs> saveNewProduct(Product product) {
        return productEsRepository.save(ProductEs.builder()
                .active(product.getActive())
                .code(product.getCode())
                .description(product.getDescription())
                .features(product.getFeatures())
                .id(product.getId())
                .name(product.getName())
                .seller(CompanyEs.builder().id(product.getCompanyId())
                        .name("Test Seller").build()) // TODO: add seller name
                .category(CategoryEs.builder().id(product.getCategoryId())
                        .name("Test Category").build()) // TODO: add category name
                .build());
    }

    public Flux<ProductEs> findAll() {
        return productEsRepository.findAll();
    }
}
