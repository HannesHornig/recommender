package de.pokeRecommender.dao;

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
public class SpeciesDaoItTest
{
	@Autowired
	private SpeciesDao speciesdao;

	@Test
	@Transactional
	public void loadPokemon()
	{
		final Species pokemon = new Species("Bulba", 1, 2, null);
		speciesdao.save(pokemon);
		final Species pokemonSpecies = speciesdao.findBySpeciesId(1);
		assertNotNull(pokemonSpecies);
	}
}
