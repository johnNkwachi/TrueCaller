package com.semicolon.truecaller.dto.response.mobileNumberResponse;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class MobileNumberResponse {
    private String countryCode;
    private String number;
    private Boolean isBlocked;
}
