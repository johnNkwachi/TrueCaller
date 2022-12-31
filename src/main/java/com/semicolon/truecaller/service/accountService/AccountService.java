package com.semicolon.truecaller.service.accountService;

import com.semicolon.truecaller.model.user.Account;
import com.semicolon.truecaller.dto.request.accountRequest.AccountRequest;
import com.semicolon.truecaller.dto.response.accountResponse.AccountResponse;

public interface AccountService {
    AccountResponse createAccount(AccountRequest accountRequest);
    Account findById(String id);
}
