package de.pokeRecommender.config;

import javax.servlet.Servlet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.coxautodev.graphql.tools.SchemaParser;

import de.pokeRecommender.resolver.QueryResolver;
import de.pokeRecommender.service.SpeciesService;
import graphql.schema.GraphQLSchema;
import graphql.servlet.SimpleGraphQLHttpServlet;

@Configuration()
@ComponentScan(basePackages = "de.pokeRecommender")
public class GraphQlConfig {

	private static final String GRAPHQL_ENDPOINT="/graphql";
	private static final String SCHEMA_LOCATION="graphql/schema.graphqls";

	@Autowired
	private SpeciesService speciesService;

	@Bean
	public ServletRegistrationBean<Servlet> graphQLServlet(SimpleGraphQLHttpServlet simpleGraphQLHttpServlet) {
		return new ServletRegistrationBean<Servlet>(simpleGraphQLHttpServlet,GRAPHQL_ENDPOINT);
	}

	@Bean
	public GraphQLQueryResolver createQueryResolver() {
		return new QueryResolver(speciesService);
	}

	@Bean
	public GraphQLSchema createGraphQLSchema(GraphQLQueryResolver queryResolver) {
		return  SchemaParser.newParser()
				.file(SCHEMA_LOCATION)
				.resolvers(queryResolver)
				.build()
				.makeExecutableSchema();
	}

	@Bean
	public SimpleGraphQLHttpServlet simpleGraphQLHttpServlet(GraphQLSchema graphQLSchema) {
		return SimpleGraphQLHttpServlet.newBuilder(graphQLSchema).build();
	}


}
