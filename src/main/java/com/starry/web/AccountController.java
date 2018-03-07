package com.springboot.main;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountController {
    @Autowired
    AccountRepository accountRepository;
    @RequestMapping("account")
    @ResponseBody
    public List<Account> getAccount(){
       List<Account> account = (List<Account>) accountRepository.findAll();
       return account;
    }
}
