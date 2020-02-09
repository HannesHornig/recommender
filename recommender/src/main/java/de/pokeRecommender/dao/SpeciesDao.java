package de.pokeRecommender.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import de.pokeRecommender.domain.Species;

public interface SpeciesDao extends JpaRepository<Species, Integer> {

	public Species findBySpeciesId(int speciesId);

}
