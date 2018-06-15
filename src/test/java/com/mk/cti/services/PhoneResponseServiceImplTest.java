package com.mk.cti.services;

import com.mk.cti.model.PhoneResponse;
import com.mk.cti.repository.PhoneResponseRepository;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.hamcrest.CoreMatchers.instanceOf;

import static org.mockito.Mockito.*;

import static org.junit.Assert.*;

public class PhoneResponseServiceImplTest
{

    private PhoneResponseRepository mockPhoneResponseRepo;
    private PhoneResponseServiceImpl phoneResponseService;

    @Before
    public void setUp() throws Exception
    {
        mockPhoneResponseRepo = mock(PhoneResponseRepository.class);
        phoneResponseService = new PhoneResponseServiceImpl(mockPhoneResponseRepo);
    }

    @Test
    public void findByPhoneNumber()
    {

        PhoneResponse mockPhoneResponse = new PhoneResponse();
        when(mockPhoneResponseRepo.findByPhoneNumber(anyString())).thenReturn(mockPhoneResponse);
        PhoneResponse phoneResponse = phoneResponseService.findByPhoneNumber("416123123");
        assertThat(phoneResponse, instanceOf(PhoneResponse.class));

    }


}