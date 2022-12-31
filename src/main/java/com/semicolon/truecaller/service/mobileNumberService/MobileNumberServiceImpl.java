package com.semicolon.truecaller.service.mobileNumberService;

import com.semicolon.truecaller.dto.request.mobileNumberRequest.MobileNumberRequest;
import com.semicolon.truecaller.dto.response.mobileNumberResponse.MobileNumberResponse;
import com.semicolon.truecaller.exceptions.MobileNumberException;
import com.semicolon.truecaller.model.mobile.MobileNumber;
import com.semicolon.truecaller.repository.MobileNumberRepo;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class MobileNumberServiceImpl implements MobileNumberService{
    @Autowired
    MobileNumberRepo mobileNumberRepo;
    @Override
    public MobileNumberResponse addMobileNumber(MobileNumberRequest request) {
        MobileNumber mobileNumber = new MobileNumber();
        MobileNumber number = mobileNumberRepo.findByPhoneNumber(request.getPhoneNumber());
        if (number != null)throw new MobileNumberException("This " + mobileNumber +" already exist");
//        BeanUtils.copyProperties(request, mobileNumber);

        mobileNumber.setPhoneNumber(request.getPhoneNumber());
        mobileNumber.setCountryCode(request.getCountryCode());
        MobileNumber savedNumber = mobileNumberRepo.save(mobileNumber);

        MobileNumberResponse mobileNumberResponse = new MobileNumberResponse();

        mobileNumberResponse.setIsBlocked(true);
        mobileNumberResponse.setNumber(savedNumber.getPhoneNumber());
        mobileNumberResponse.setCountryCode(savedNumber.getCountryCode());
//        BeanUtils.copyProperties(savedNumber, mobileNumberResponse);
        return mobileNumberResponse;
    }

    @Override
    public Boolean blockedContactByMobileNumber(String mobileNumber) {
        MobileNumber mobileNumber1 = new MobileNumber();
        MobileNumber findNumber = mobileNumberRepo.findByPhoneNumber(mobileNumber);
        if (findNumber == null) throw new MobileNumberException("number does not exist");

        if (findNumber.getIsBlocked().equals(false)) findNumber.setIsBlocked(true);
        MobileNumber saved = mobileNumberRepo.save(mobileNumber1);
        return saved.getIsBlocked();
    }

    @Override
    public Boolean unBlockedMobileNumberByMobileNumber(String mobileNumber) {
        return null;
    }

    @Override
    public List<MobileNumber> findAllBlockedMobileNumbers() {
        return null;
    }
}
