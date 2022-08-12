package com.example.personalhealthassistant.Service;

import com.example.personalhealthassistant.Repository.IssuePersonalRepository;
import com.example.personalhealthassistant.model.IssuePersonalEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class IssuePersonalServiceImpl implements IssuePersonalService{
    @Autowired
    IssuePersonalRepository issuePersonalRepository;
    @Override
    public List<IssuePersonalEntity> searchByName(String name) {
        if(name != null){
            return issuePersonalRepository.search(name);
        }
        return issuePersonalRepository.findAll();
    }

    @Override
    public List<IssuePersonalEntity> findAll() {
        return issuePersonalRepository.findAll();
    }


}
