package com.semicolon.truecaller.service.accountService;

import com.semicolon.truecaller.dto.request.accountRequest.AccountRequest;
import com.semicolon.truecaller.dto.response.accountResponse.AccountResponse;
import com.semicolon.truecaller.exceptions.AccountException;
import com.semicolon.truecaller.model.user.Account;
import com.semicolon.truecaller.repository.AccountRepository;
import lombok.Builder;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Slf4j
@Service
@Builder
public class AccountImpl implements AccountService {
    @Autowired
    AccountRepository accountRepository;

    @Override
    public AccountResponse createAccount(AccountRequest accountRequest) {
        Account account = new Account();
        Account findAccount = accountRepository.findAccountByEmail(accountRequest.getEmail());
        if (findAccount != null) throw new AccountException
                ("Account with this " + accountRequest.getEmail() + "already exist");
        BeanUtils.copyProperties(accountRequest, account);
        Account savedAccount = accountRepository.save(account);
        BeanUtils.copyProperties(savedAccount, AccountResponse.class);
        log.info("Account saved successfully");
        return AccountResponse.builder().build();
    }

    @Override
    public Account findById(String id) {
        Account account = accountRepository.findAccountById(id);
        if (account == null) throw new AccountException("Account with this " + id + " does not exist");
        return account;
    }
}
