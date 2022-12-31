package com.semicolon.truecaller.model.user;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
import com.semicolon.truecaller.model.mobile.MobileNumber;
import com.semicolon.truecaller.model.contact.*;

import java.util.List;

@Getter
@Setter
@ToString
@Document
public class Account {
    @Id
    private String id;
    private String firstName;
    private String lastName;
    private String email;
    private String phoneNumber;
    @DBRef
    private List<Contact> contact;
    @DBRef
    private Address userAddress;
    @DBRef
    private UserCategory userCategory;
    @DBRef
    private MobileNumber mobileNumber;

}
