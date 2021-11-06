package com.haydikodlayalim.flyway.repo;

import com.haydikodlayalim.flyway.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
