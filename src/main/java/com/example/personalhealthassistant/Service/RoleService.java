package com.example.personalhealthassistant.Service;

import com.example.personalhealthassistant.model.RolesEntity;

import java.util.Optional;

public interface RoleService {
    Optional<RolesEntity> findByName(String name);

}
