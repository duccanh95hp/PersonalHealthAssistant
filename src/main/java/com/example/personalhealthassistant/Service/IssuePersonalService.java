package com.example.personalhealthassistant.Service;

import com.example.personalhealthassistant.model.IssuePersonalEntity;

import java.util.List;

public interface IssuePersonalService {
    public List<IssuePersonalEntity> searchByName(String name);

    public List<IssuePersonalEntity> findAll();

}

