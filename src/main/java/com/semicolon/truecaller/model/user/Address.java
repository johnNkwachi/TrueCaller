package com.semicolon.truecaller.model.user;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.DBRef;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Address {
    private String streetName;
    private String streetNumber;
    private String zipCode;
    private String city;
    private String country;
}
