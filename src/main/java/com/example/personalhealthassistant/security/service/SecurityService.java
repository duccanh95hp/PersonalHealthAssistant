package com.example.personalhealthassistant.security.service;

public interface SecurityService {
    boolean isAuthenticated();
    void autoLogin(String name, String password);
}
