package com.mk.cti.controller;


import com.mk.cti.model.PhoneResponse;
import com.mk.cti.services.PhoneResponseService;
import com.mk.cti.utility.PhoneUtility;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/phone")
public class PhoneController
{

    private PhoneUtility phoneUtility;
    private PhoneResponseService phoneResponseService;

    @Autowired
    public PhoneController(PhoneUtility phoneUtility, PhoneResponseService phoneResponseService)
    {
        this.phoneUtility = phoneUtility;
        this.phoneResponseService = phoneResponseService;
    }

    @RequestMapping(value="{phoneNumber}", method = RequestMethod.GET)
    public ResponseEntity<PhoneResponse> getCustomerLoanInfo(@PathVariable("phoneNumber") String phoneNumber)
    {

        PhoneResponse phoneResponse = phoneResponseService.findByPhoneNumber(phoneNumber);

        if(phoneResponse == null)
        {
            phoneResponse = new PhoneResponse();
            phoneResponse.setCustomerId(0L);
            phoneResponse.setLoanId(0L);
            phoneResponse.setAuthCode("A093756186");
        }
        if(phoneResponse == null)
        {
            phoneResponse = new PhoneResponse();
            phoneResponse.setCustomerId(0L);
            phoneResponse.setLoanId(0L);
            phoneResponse.setAuthCode("A093756186");
        }
        if(phoneResponse == null)
        {
            phoneResponse = new PhoneResponse();
            phoneResponse.setCustomerId(0L);
            phoneResponse.setLoanId(0L);
            phoneResponse.setAuthCode("A093756186");
        }

        return new ResponseEntity<>(phoneResponse, HttpStatus.OK);
    }
}