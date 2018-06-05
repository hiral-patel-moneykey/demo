package com.mk.cti.services;

import com.mk.cti.model.PhoneResponse;
import com.mk.cti.repository.PhoneResponseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PhoneResponseServiceImpl implements PhoneResponseService{

    @Autowired
    private PhoneResponseRepository phoneResponseRepository;

    @Override
    public PhoneResponse findByPhoneNumber(String phoneNumber) {

        PhoneResponse phoneResponse = phoneResponseRepository.findByPhoneNumber(phoneNumber);
        return phoneResponse;

    }
}
