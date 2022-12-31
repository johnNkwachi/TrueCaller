package com.semicolon.truecaller.dto.request.mobileNumberRequest;

import lombok.*;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class MobileNumberRequest {
    private String countryCode;
    private String phoneNumber;
}
