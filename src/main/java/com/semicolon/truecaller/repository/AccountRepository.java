package com.semicolon.truecaller.repository;

import com.semicolon.truecaller.model.user.Account;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountRepository extends MongoRepository<Account, String> {
    Account findAccountByEmail(String email);
    Account findAccountById(String id);


}
