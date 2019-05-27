package com.virtusa.pasindu.spring.repository;

import com.virtusa.pasindu.spring.model.LoyaltyCard;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface LoyaltyCardRepository extends JpaRepository<LoyaltyCard, Integer> {

    LoyaltyCard findByNumber(String number);

    @Query("SELECT lc FROM LoyaltyCard AS lc WHERE lc.customer.name = ?1")
    List<LoyaltyCard> findByCustomerName(String customerName);

    @Query("SELECT lc FROM LoyaltyCard AS lc WHERE lc.customer.email = ?1")
    List<LoyaltyCard> findByCustomerEmail(String customerEmail);
}
