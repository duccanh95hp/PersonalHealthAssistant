package com.example.personalhealthassistant.Repository;

import com.example.personalhealthassistant.model.RolesEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RoleRepository extends JpaRepository<RolesEntity,Long> {
    Optional<RolesEntity> findByRoleName(String name);
}
