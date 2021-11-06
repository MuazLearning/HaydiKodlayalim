package com.haydikodlayalim.repository;

import com.haydikodlayalim.entity.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, String> {
}
