package com.example.personalhealthassistant.Service;

import com.example.personalhealthassistant.Repository.RoleRepository;
import com.example.personalhealthassistant.model.RolesEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class RoleServicesImpl implements RoleService {
    @Autowired
    RoleRepository repository;
    @Override
    public Optional<RolesEntity> findByName(String name) {
        return repository.findByRoleName(name);
    }
}
