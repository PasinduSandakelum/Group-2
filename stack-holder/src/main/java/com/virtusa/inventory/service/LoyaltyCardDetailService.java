package com.virtusa.inventory.service;

import java.util.List;

import com.virtusa.inventory.model.LoyaltyCardDetail;

public interface LoyaltyCardDetailService {

	List<LoyaltyCardDetail> fetchAll();

	LoyaltyCardDetail save(LoyaltyCardDetail cardDetail);

	LoyaltyCardDetail update(LoyaltyCardDetail cardDetail);

	void delete(Integer id);
}