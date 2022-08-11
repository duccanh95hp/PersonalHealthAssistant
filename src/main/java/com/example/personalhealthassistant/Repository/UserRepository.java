package com.example.personalhealthassistant.Repository;

import com.example.personalhealthassistant.model.UsersEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UsersEntity,Long> {
    UsersEntity findByName(String username);
    Boolean existsByName(String username);
}
