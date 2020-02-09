package de.pokeRecommender.service;

import java.util.List;

import de.pokeRecommender.domain.Species;

public interface SpeciesService {

	public Species loadSpeciesById(int speciesId);

	public List<Species> loadAllSpecies();

}
