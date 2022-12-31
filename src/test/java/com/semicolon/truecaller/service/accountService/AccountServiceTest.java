package com.semicolon.truecaller.service.accountService;

import com.semicolon.truecaller.dto.request.accountRequest.AccountRequest;
import com.semicolon.truecaller.dto.response.accountResponse.AccountResponse;
import com.semicolon.truecaller.model.user.Account;
import com.semicolon.truecaller.repository.AccountRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;


import static org.assertj.core.api.Assertions.assertThat;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
@ActiveProfiles
class AccountServiceTest {
    @Autowired
    AccountService accountService;
    @Autowired
    AccountImpl account;
    @Autowired
    AccountRepository accountRepository;

//    private final AccountService accountService;
//    AccountServiceTest(AccountService accountService) {
//        this.accountService = accountService;
//    }

    AccountRequest accountRequest;
    AccountResponse accountResponse;

    @BeforeEach
    void setUp() {
        accountResponse = AccountResponse.builder()
                .id("1")
                .email("jnkwachi@gmail.com")
                .firstName("Nkwachi")
                .lastName("John")
                .build();


        accountRequest =  AccountRequest.builder()
                .firstName("Nkwachi")
                .lastName("John")
                .password("password")
                .email("jnk@yahoo.com")
                .phoneNumber("12345")
                .build();

        }

    @Test
    public void testThatAccountCanBeCreated(){

        AccountResponse account1 = accountService.createAccount(accountRequest);
        assertThat(account1).isNotNull();
        assertThat(account1.getEmail()).isEqualTo(accountRequest.getEmail());

    }
    @Test
    void findAccountDetailsById() {
            AccountResponse response = accountService.createAccount(accountRequest);
            assertThat(response).isNotNull();
            assertThat(response.getEmail()).isEqualTo(accountRequest.getEmail());
            Account foundAccount = accountService.findById(response.getId());
            assertThat(foundAccount.getFirstName()).isEqualTo(response.getFirstName());

        }

}