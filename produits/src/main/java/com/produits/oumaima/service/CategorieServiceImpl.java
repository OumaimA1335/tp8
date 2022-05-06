package com.produits.oumaima.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.produits.oumaima.entities.Categorie;
import com.produits.oumaima.repos.CategorieRepository;
@Service
public class CategorieServiceImpl implements CategorieService{
	
	@Autowired
	CategorieRepository categorieRepository;
	@Override
	public List<Categorie> getAllCategories() {
		return categorieRepository.findAll();
	}

}
