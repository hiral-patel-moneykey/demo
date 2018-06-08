package com.mk.cti.utility;

import com.mk.cti.model.PhoneResponse;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.junit.Assert.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PhoneUtilityTest {

    @Autowired
    private PhoneUtility phoneUtility;

    @Test
    public void shouldReturnPhoneResponseObject() {

        PhoneResponse phoneResponse = phoneUtility.getPhoneResponse("416123123");
        assertThat(phoneResponse, instanceOf(PhoneResponse.class));

    }

}
