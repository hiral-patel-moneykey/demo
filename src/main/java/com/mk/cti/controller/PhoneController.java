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

    @Autowired
    private PhoneUtility phoneUtility;

    @Autowired
    private PhoneResponseService phoneResponseService;

    @Value("${spring.profiles.active}")
    private String activeProfile;

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


        return new ResponseEntity<>(phoneResponse, HttpStatus.OK);
    }

    @RequestMapping(value="/profile", method = RequestMethod.GET)
    public ResponseEntity<String> getCustomerLoanInfo()
    {
        System.out.println("Spring Active profile is "+ activeProfile);

        return new ResponseEntity<>(activeProfile, HttpStatus.OK);
    }
}
