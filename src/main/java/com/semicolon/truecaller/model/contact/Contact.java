package com.semicolon.truecaller.model.contact;

import com.semicolon.truecaller.model.mobile.MobileNumber;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Document
public class Contact {
    @Id
    private String id;
    private String userName;
    @DBRef
    private MobileNumber mobileNumber;
    private String email;
    private String companyName;
    private boolean isBlocked = false;
}
