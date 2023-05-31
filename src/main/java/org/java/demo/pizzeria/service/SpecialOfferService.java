package org.java.demo.pizzeria.service;

import java.util.List;
import java.util.Optional;

import org.java.demo.pizzeria.pojo.SpecialOffer;
import org.java.demo.pizzeria.repo.SpecialOfferRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class SpecialOfferService {

	
	@Autowired
	private SpecialOfferRepository soRepo;
	
	public List<SpecialOffer> findAll() {
		
		return soRepo.findAll();
	}
	public SpecialOffer save(SpecialOffer specialOffer) {
		
		return soRepo.save(specialOffer);
	}
	public Optional<SpecialOffer> findById(Integer id) {
		
		return soRepo.findById(id);
	}
	
	public void delete(SpecialOffer specialOffer) {
		soRepo.delete(specialOffer);
	}
}
