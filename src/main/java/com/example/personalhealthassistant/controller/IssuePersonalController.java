package com.example.personalhealthassistant.controller;

import com.example.personalhealthassistant.Service.IssuePersonalService;
import com.example.personalhealthassistant.model.IssuePersonalEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequestMapping(value = "/IssuePersonal")
public class IssuePersonalController {
    @Autowired
    IssuePersonalService issuePersonalService;
    @RequestMapping(value = "",method = RequestMethod.GET)
    public String indexIssuePersonal(){
        return "web/IssuePersonal/index";
    }
    @RequestMapping(value = "/submitForm",method = RequestMethod.POST)
    public String postSearch(Model model, @RequestParam("keyword") String keyword){
        List<IssuePersonalEntity> lists = issuePersonalService.searchByName(keyword);
        List<IssuePersonalEntity> listsPersonals = issuePersonalService.findAll();
        model.addAttribute("lists", lists);
        model.addAttribute("keyword", keyword);
        model.addAttribute("listsPersonals", listsPersonals);
        return "web/IssuePersonal/result";
    }
}
