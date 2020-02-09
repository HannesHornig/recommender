package de.pokeRecommender.resolver;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;

import de.pokeRecommender.domain.Species;
import de.pokeRecommender.service.SpeciesService;

public class QueryResolver implements GraphQLQueryResolver {

	private final SpeciesService speciesService;


	@Autowired
	public QueryResolver(SpeciesService speciesService) {
		this.speciesService = speciesService;
	}

	public List<Species> loadAllSpecies(){
		return speciesService.loadAllSpecies();
	}

	public Species loadSpeciesById(int speciesId) {
		return speciesService.loadSpeciesById(speciesId);
	}

}
