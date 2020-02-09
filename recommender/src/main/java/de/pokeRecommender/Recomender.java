package de.pokeRecommender;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

import de.pokeRecommender.config.GraphQlConfig;

@SpringBootApplication
@Import(GraphQlConfig.class)
public class Recomender
{
	public static void main( String[] args )
	{
		SpringApplication.run(Recomender.class, args);
	}
}
