package com.example.personalhealthassistant.controller;

import com.example.personalhealthassistant.Service.RoleService;
import com.example.personalhealthassistant.Service.userService;
import com.example.personalhealthassistant.common.Constants;
import com.example.personalhealthassistant.model.RolesEntity;
import com.example.personalhealthassistant.model.UsersEntity;
import com.example.personalhealthassistant.payload.RegisterUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.HashSet;
import java.util.Set;

@Controller

public class UserController {
    @Autowired
    userService userService;
    @Autowired
    RoleService roleService;

    @Autowired
    PasswordEncoder encoder;

    @RequestMapping(value = "/register", method = RequestMethod.GET)
    public String registerPage(Model model) {
        return "web/login/register";
    }

    @RequestMapping(value = "/registersubmit", method = RequestMethod.POST)
    public String registersubmit(@ModelAttribute RegisterUser registerUser) {
        if(userService.existsByUsername(registerUser.getUsername())) {
            //Co ton tai roi
        } else {
            //Chua ton tai username
            UsersEntity u = new UsersEntity();
            u.setName(registerUser.getUsername());
            String password = encoder.encode(registerUser.getPassword());
            u.setPassword(password);
            u.setEmail(registerUser.getEmail());

            Set<RolesEntity> roles = new HashSet<RolesEntity>();
            RolesEntity r = roleService.findByName(Constants.ROLE_USER).get();
            roles.add(r);

            u.setRoles(roles);

            userService.saveUsers(u);
        }
        return "/web/index";
    }
}
