package com.mk.cti.services;

import com.mk.cti.model.PhoneResponse;
import org.springframework.stereotype.Service;

public interface PhoneResponseService {

    PhoneResponse findByPhoneNumber(String phoneNumber);

}
