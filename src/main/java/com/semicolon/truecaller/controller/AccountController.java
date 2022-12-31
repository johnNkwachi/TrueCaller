package com.semicolon.truecaller.controller;

import com.semicolon.truecaller.dto.request.accountRequest.AccountRequest;
import com.semicolon.truecaller.dto.response.accountResponse.AccountResponse;
import com.semicolon.truecaller.model.user.Account;
import com.semicolon.truecaller.service.accountService.AccountImpl;
import com.semicolon.truecaller.service.accountService.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
public class AccountController {
    @Autowired
    AccountService accountService;

    @PostMapping("/account")
    public AccountResponse createAccount(@RequestBody AccountRequest accountRequest){
        return accountService.createAccount(accountRequest);
    }
    @GetMapping(path = "/{id}")
    public Account findById(@PathVariable String id){
        return accountService.findById(id);
    }
}
