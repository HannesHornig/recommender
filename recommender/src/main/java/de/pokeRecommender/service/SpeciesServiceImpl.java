package de.pokeRecommender.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import de.pokeRecommender.dao.SpeciesDao;
import de.pokeRecommender.domain.Species;

@Service
public class SpeciesServiceImpl implements SpeciesService{

	private final SpeciesDao speciesDao;

	@Autowired
	public SpeciesServiceImpl(SpeciesDao speciesDao) {
		this.speciesDao = speciesDao;
	}

	@Override
	public Species loadSpeciesById(int speciesId) {
		return speciesDao.findBySpeciesId(speciesId);
	}

	@Override
	public List<Species> loadAllSpecies(){
		return speciesDao.findAll();
	}




}
