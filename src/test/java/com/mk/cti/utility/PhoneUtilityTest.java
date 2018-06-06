package com.mk.cti.utility;

import com.mk.cti.model.PhoneResponse;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit4.SpringRunner;

public class PhoneUtilityTest {

    @Autowired
    PhoneUtility phoneUtility;

    @Test
    public void shouldReturnPhoneResponseObject() {

        if(phoneUtility == null)
            phoneUtility = new PhoneUtility();
        PhoneResponse phoneResponse = phoneUtility.getPhoneResponse("416123123");
        assertThat(phoneResponse, instanceOf(PhoneResponse.class));

    }

}
