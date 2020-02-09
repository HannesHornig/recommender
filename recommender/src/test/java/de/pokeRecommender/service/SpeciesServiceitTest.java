package de.pokeRecommender.service;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;

import javax.transaction.Transactional;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import de.pokeRecommender.domain.Species;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpeciesServiceitTest {

	@Autowired
	private SpeciesService speciesService;

	@Test
	@Transactional
	public void loadPokemon()
	{
		final Species pokemonSpecies = speciesService.loadSpeciesById(1);
		assertNotNull(pokemonSpecies);
		assertFalse(pokemonSpecies.getType().isEmpty());;


	}

}
