package com.example.personalhealthassistant.security.service;

import com.example.personalhealthassistant.Repository.UserRepository;
import com.example.personalhealthassistant.model.UsersEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service

public class UserDetailsServiceImpl implements UserDetailsService {
    @Autowired
    UserRepository userRepository;
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        UsersEntity users = userRepository.findByName(username);
        List<GrantedAuthority> grantList = new ArrayList<GrantedAuthority>();
        if(users == null){
            new UsernameNotFoundException("Login fail");
        }else {
            GrantedAuthority authority = new SimpleGrantedAuthority("ADMIN");
            grantList.add(authority);
            UserDetails userDetails = new org.springframework.security.core.userdetails.User(username,users.getPassword(),grantList);
            return userDetails;
        }

        return UserDetailsImpl.build(users);
    }
}
