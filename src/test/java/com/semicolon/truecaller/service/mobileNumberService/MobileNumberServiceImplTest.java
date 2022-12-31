package com.semicolon.truecaller.service.mobileNumberService;

import com.semicolon.truecaller.dto.request.mobileNumberRequest.MobileNumberRequest;
import com.semicolon.truecaller.dto.response.mobileNumberResponse.MobileNumberResponse;
import com.semicolon.truecaller.repository.MobileNumberRepo;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class MobileNumberServiceImplTest extends MobileNumberServiceImpl {
    @Autowired
    MobileNumberService mobileNumberService;
    @Autowired
    MobileNumberRepo mobileNumberRepo;

    @BeforeEach
    void setUp() {
    }

    @Test
    void addMobileNumber() {
        MobileNumberRequest mobileNumberRequest = MobileNumberRequest.builder()
                .countryCode("+234")
                .phoneNumber("12345")
                .build();

        MobileNumberResponse mobileNumberResponse = mobileNumberService.addMobileNumber(mobileNumberRequest);
        assertThat(mobileNumberResponse).isNotNull();
        assertThat(mobileNumberResponse.getNumber()).isEqualTo(mobileNumberRequest.getPhoneNumber());

    }
}