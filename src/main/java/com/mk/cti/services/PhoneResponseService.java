package com.mk.cti.services;

import com.mk.cti.model.PhoneResponse;

public interface PhoneResponseService {

    PhoneResponse findByPhoneNumber(String phoneNumber);

}
