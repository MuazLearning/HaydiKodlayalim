package com.haydikodlayalim.shoppingapp.product.repository.mongo;

import com.haydikodlayalim.shoppingapp.product.domain.category.Category;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

@Repository // Extend'den repository olduğunu anlıyor. Bu annotation'ı kullanmaya gerek yok.
public interface CategoryRepository extends ReactiveMongoRepository<Category, String> {
}
