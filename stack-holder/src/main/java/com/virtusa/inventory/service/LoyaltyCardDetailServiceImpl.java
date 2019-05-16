package com.virtusa.inventory.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.virtusa.inventory.model.LoyaltyCardDetail;
import com.virtusa.inventory.repository.LoyaltyCardDetailRepository;

@Service
public class LoyaltyCardDetailServiceImpl implements LoyaltyCardDetailService {

	@Autowired
	LoyaltyCardDetailRepository cardDetailRepository;

	@Override
	public List<LoyaltyCardDetail> fetchAll() {
		return cardDetailRepository.findAll();
	}

	@Override
	public LoyaltyCardDetail save(LoyaltyCardDetail cardDetail) {
		return cardDetailRepository.save(cardDetail);
	}

	@Override
	public LoyaltyCardDetail update(LoyaltyCardDetail cardDetail) {
		return cardDetailRepository.save(cardDetail);
	}

	@Override
	public void delete(Integer id) {
		cardDetailRepository.deleteById(id);
	}
}
