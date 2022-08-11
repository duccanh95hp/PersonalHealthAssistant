package com.example.personalhealthassistant.Service;

import com.example.personalhealthassistant.Repository.UserRepository;
import com.example.personalhealthassistant.model.UsersEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class userServiceImlp implements userService {
    @Autowired
    UserRepository userRepository;
    @Override
    public void saveUsers(UsersEntity user) {
        userRepository.save(user);
    }

    @Override
    public List<UsersEntity> listsUsers() {
        return userRepository.findAll();
    }

    @Override
    public UsersEntity findUserById(Long id) {
        return userRepository.findById(id).get();
    }

    @Override
    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }

    @Override
    public UsersEntity findByUsername(String name) {
        return userRepository.findByName(name);
    }

    @Override
    public Boolean existsByUsername(String username) {
        return userRepository.existsByName(username);
    }
}
