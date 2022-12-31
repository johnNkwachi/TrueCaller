package com.semicolon.truecaller.controller;

import com.semicolon.truecaller.dto.request.mobileNumberRequest.MobileNumberRequest;
import com.semicolon.truecaller.dto.response.mobileNumberResponse.MobileNumberResponse;
import com.semicolon.truecaller.service.mobileNumberService.MobileNumberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class MobileNumberController {
    @Autowired
    MobileNumberService mobileNumberService;

    @PostMapping(path = "/mobileNumber")
    public MobileNumberResponse addMobileNumber(@RequestBody MobileNumberRequest request){
        return mobileNumberService.addMobileNumber(request);
    }
    @GetMapping(path = "/block/{mobileNumber}")
    public Boolean blockedContactByMobileNumber(@PathVariable String mobileNumber){
        return mobileNumberService.blockedContactByMobileNumber(mobileNumber);
    }
}
