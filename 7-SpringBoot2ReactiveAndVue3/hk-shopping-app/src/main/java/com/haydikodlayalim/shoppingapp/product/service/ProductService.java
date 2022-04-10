package com.haydikodlayalim.shoppingapp.product.service;

import com.haydikodlayalim.shoppingapp.product.domain.MoneyTypes;
import com.haydikodlayalim.shoppingapp.product.domain.es.ProductEs;
import com.haydikodlayalim.shoppingapp.product.model.ProductResponse;
import com.haydikodlayalim.shoppingapp.product.model.ProductSaveRequest;
import com.haydikodlayalim.shoppingapp.product.model.ProductSellerResponse;
import com.haydikodlayalim.shoppingapp.product.repository.es.ProductEsRepository;
import com.haydikodlayalim.shoppingapp.product.repository.mongo.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

import java.math.BigDecimal;

@Service
@RequiredArgsConstructor
public class ProductService {

    private final ProductEsRepository productEsRepository;
    private final ProductRepository productRepository;
    private final ProductPriceService productPriceService;
    private final ProductDeliveryService productDeliveryService;
    private final ProductAmountService productAmountService;
    private final ProductImageService productImageService;

    public Flux<ProductResponse> getAll() {
        return productEsRepository.findAll().map(this::mapToDto);
    }

    ProductResponse save(ProductSaveRequest productSaveRequest) {
        // 1. Mongoya kaydet
        // 2. ES güncelle
        // 3. Redisten güncelle
        // 4. ES den cevap dön
        return null;
    }

    /**
     * @param item
     * 1. Es den sonucu al
     * 2. Calcualte fieldlarini işle
     * 3. Redisten ihtiyaç alanlarını getir
     * 4. Response olarak dön
     * @return
     */
    private ProductResponse mapToDto(ProductEs item) {
        BigDecimal productPrice = productPriceService.getByMoneyType(item.getId(), MoneyTypes.USD);
        return ProductResponse.builder()
                .price(productPrice)
                .name(item.getName())
                .features(item.getFeatures())
                .id(item.getId())
                .description(item.getDescription())
                .deliveryIn(productDeliveryService.getDeliveryInfo(item.getId()))
                .category(item.getCategory().getId())
                .available(productAmountService.getByProductId(item.getId()))
                .freeDelivery(productDeliveryService.freeDeliveryCheck(item.getId(), productPrice))
                .moneyType(MoneyTypes.USD)
                .image(productImageService.getProductMainImage(item.getId()))
                .seller(ProductSellerResponse.builder()
                        .id(item.getSeller().getId())
                        .name(item.getSeller().getName())
                        .build())
                .build();

    }

}