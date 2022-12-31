package com.semicolon.truecaller.service.mobileNumberService;

import com.semicolon.truecaller.dto.request.mobileNumberRequest.MobileNumberRequest;
import com.semicolon.truecaller.dto.response.mobileNumberResponse.MobileNumberResponse;
import com.semicolon.truecaller.model.mobile.MobileNumber;

import java.util.List;

public interface MobileNumberService {
    MobileNumberResponse addMobileNumber(MobileNumberRequest request);
    Boolean blockedContactByMobileNumber(String mobileNumber);
    Boolean unBlockedMobileNumberByMobileNumber(String mobileNumber);
    List<MobileNumber> findAllBlockedMobileNumbers();

}
