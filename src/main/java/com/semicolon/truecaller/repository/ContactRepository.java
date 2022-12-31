package com.semicolon.truecaller.repository;

import com.semicolon.truecaller.model.contact.Contact;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ContactRepository extends MongoRepository<Contact, String> {
    Contact findContactByMobileNumber(String mobileNumber);
    Contact findContactByUserName(String userName);
    Contact readContactByUserName(String userName);
    Contact readContactByMobileNumber(String mobileNumber);
    Contact findContactById(String id);
}
