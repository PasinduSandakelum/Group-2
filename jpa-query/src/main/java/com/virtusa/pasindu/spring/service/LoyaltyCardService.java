package com.virtusa.pasindu.spring.service;

import com.virtusa.pasindu.spring.model.LoyaltyCard;

import java.util.List;

public interface LoyaltyCardService {
    LoyaltyCard save(LoyaltyCard loyaltyCard);

    LoyaltyCard findByNumber(String number);

    List<LoyaltyCard> fetchAll();

    List<LoyaltyCard> findByUserName(String customerName);

    List<LoyaltyCard> findByCustomerEmail(String customerEmail);
}
