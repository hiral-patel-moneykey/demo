package com.mk.cti.utility;

import com.mk.cti.model.PhoneResponse;
import org.springframework.stereotype.Component;

@Component
public class PhoneUtility {

    public PhoneResponse getPhoneResponse(String phoneNumber) {

        PhoneResponse phoneResponse = new PhoneResponse();

        /*
        if(phoneNumber.equalsIgnoreCase("416123123"))
        {
            phoneResponse.setCustomerId(664668L);
            phoneResponse.setLoanId(483940L);
            phoneResponse.setAuthCode("A897786209");
        }
        else if(phoneNumber.equalsIgnoreCase("416456456")){
            phoneResponse.setCustomerId(671821L);
            phoneResponse.setLoanId(479199L);
            phoneResponse.setAuthCode("A783985672");
        }
        else if(phoneNumber.equalsIgnoreCase("416789789")){
            phoneResponse.setCustomerId(671802L);
            phoneResponse.setLoanId(479167L);
            phoneResponse.setAuthCode("A094672985");
        }
        else{
            phoneResponse.setCustomerId(0L);
            phoneResponse.setLoanId(0L);
            phoneResponse.setAuthCode("A093756186");
        }
        */
        return phoneResponse;
    }

}
