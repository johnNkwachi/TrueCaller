package com.semicolon.truecaller.dto.response.contactResponse;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ContactResponse {
    private String userName;
    private String countryCode;
    private String mobileNumber;
}
