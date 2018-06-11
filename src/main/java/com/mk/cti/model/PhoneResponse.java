package com.mk.cti.model;

import javax.persistence.*;

/**
 * This is a model class for PhoneResponse.
 */

@Entity
@Table(name = "phoneresponse")
public class PhoneResponse {

    /**
     * Customerid
     */
    private Long customerId;

    /**
     * Loanid
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long loanId;

    /**
     * Authentication code
     */
    private String authCode;

    /**
     * Phone number
     */
    private String phoneNumber;

    /**
     *
     * @return customerid
     */
    public Long getCustomerId() {
        return customerId;
    }

    /**
     *
     * @param customerId1 dfg
     */
    public void setCustomerId(final Long customerId1) {
        this.customerId = customerId1;
    }

    /**
     *
     * @return loadnid
     */
    public Long getLoanId() {
        return loanId;
    }

    /**
     *
     * @param loanId1 sdfds
     */
    public void setLoanId(final Long loanId1) {
        this.loanId = loanId1;
    }

    /**
     *
     * @return authentication code
     */
    public String getAuthCode() {
        return authCode;
    }

    /**
     *
     * @param authCode1 sdf
     */
    public void setAuthCode(final String authCode1) {
        this.authCode = authCode1;
    }

    /**
     *
     * @return phonenumber
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     *
     * @param phoneNumber1 sdf
     */
    public void setPhoneNumber(final String phoneNumber1) {
        this.phoneNumber = phoneNumber1;
    }
}
