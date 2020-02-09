package de.pokeRecommender.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Type  implements Serializable{

	private static final long serialVersionUID = -8019147113573453446L;

	@Id
	private  int id;
	private  String identifier;

	public Type() {

	}

	public Type(String identifier, int id) {
		this.identifier = identifier;
		this.id = id;
	}

	public String getIdentifier() {
		return identifier;
	}



}
