package com.virtusa.pasindu.spring.service;

import com.virtusa.pasindu.spring.model.LoyaltyCard;
import com.virtusa.pasindu.spring.repository.LoyaltyCardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LoyaltyCardServiceImpl implements LoyaltyCardService {
    @Autowired
    private LoyaltyCardRepository loyaltyCardRepository;

    @Override
    public LoyaltyCard save(LoyaltyCard loyaltyCard){
        loyaltyCard.getCustomer().setLoyaltyCard(loyaltyCard);
        return loyaltyCardRepository.save(loyaltyCard);
    }

    @Override
    public LoyaltyCard findByNumber(String number){
        return loyaltyCardRepository.findByNumber(number);
    }

    @Override
    public List<LoyaltyCard> fetchAll() {
        return loyaltyCardRepository.findAll();
    }

    @Override
    public List<LoyaltyCard> findByUserName(String customerName) {
        return loyaltyCardRepository.findByCustomerName(customerName);
    }

    @Override
    public List<LoyaltyCard> findByCustomerEmail(String customerEmail) {
        return loyaltyCardRepository.findByCustomerEmail(customerEmail);
    }
}
