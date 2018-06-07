package com.mk.cti.utility;

import com.mk.cti.model.PhoneResponse;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.support.AnnotationConfigContextLoader;

import java.util.Arrays;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PhoneUtilityTest {

    @Autowired
    private PhoneUtility phoneUtility;

    @Test
    public void shouldReturnPhoneResponseObject() {

        if(phoneUtility == null)
            phoneUtility = new PhoneUtility();

        PhoneResponse phoneResponse = phoneUtility.getPhoneResponse("416123123");
        assertThat(phoneResponse, instanceOf(PhoneResponse.class));

    }

}
