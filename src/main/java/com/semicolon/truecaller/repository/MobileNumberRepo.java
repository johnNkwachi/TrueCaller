package com.semicolon.truecaller.repository;

import com.semicolon.truecaller.model.mobile.MobileNumber;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MobileNumberRepo extends MongoRepository<MobileNumber, String> {
    MobileNumber findByPhoneNumber(String phoneNumber);
}
