package org.java.demo.pizzeria.service;

import java.util.List;
import java.util.Optional;

import org.java.demo.pizzeria.pojo.Ingredient;
import org.java.demo.pizzeria.repo.IngredientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class IngredientService {
	
	@Autowired
	private IngredientRepository ingredientRepository;
	
	public List<Ingredient> findAll(){
		return ingredientRepository.findAll();
	}
	
	public Optional<Ingredient> findById(Integer id) {
		return ingredientRepository.findById(id);
	}
	
	public Ingredient save(Ingredient ingredient) {
		return ingredientRepository.save(ingredient);
	}
	
	public void delete(Ingredient ingredient) {
		ingredientRepository.delete(ingredient);
	}
}
