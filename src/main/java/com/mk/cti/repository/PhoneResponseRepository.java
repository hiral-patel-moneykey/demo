package com.mk.cti.repository;

import com.mk.cti.model.PhoneResponse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PhoneResponseRepository extends JpaRepository<PhoneResponse, Long>
{

    PhoneResponse findByPhoneNumber(String phoneNumber);
}
