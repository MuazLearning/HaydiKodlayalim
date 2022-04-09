package com.haydikodlayalim.shoppingapp.product.service;

import com.haydikodlayalim.shoppingapp.product.domain.Product;
import com.haydikodlayalim.shoppingapp.product.model.ProductResponse;
import com.haydikodlayalim.shoppingapp.product.model.ProductSaveRequest;
import com.haydikodlayalim.shoppingapp.product.repository.es.ProductEsRepository;
import com.haydikodlayalim.shoppingapp.product.repository.mongo.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductService {

    private final ProductEsRepository productEsRepository;
    private final ProductRepository productRepository;

    List<ProductResponse> getByPaging(Pageable pageable){
        // 1. Es den sonucu al
        // 2. Calcualte fieldlarini işle
        // 3. Redisten ihtiyaç alanlarını getir
        // 4. Response olarak dön
        return null;
    }

    ProductResponse save(ProductSaveRequest productSaveRequest){
        // 1. Mongoya kaydet
        // 2. ES güncelle
        // 3. Redisten güncelle
        // 4. ES den cevap dön
        return null;
    }

    Product findById(Long id){
        return new Product();
    }

    Product update(Product product){
        return product;
    }

    void delete(Long id){

    }


}
