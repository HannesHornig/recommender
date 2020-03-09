package de.pokeRecommender.domain;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;

@Entity
public class Species implements Serializable {


	private static final long serialVersionUID = -1330503776434035985L;

	@Id
	private  int id;
	private  int speciesId;
	private  String name;
	private  int dexorder;
	@OneToMany(
			fetch=FetchType.EAGER,cascade = CascadeType.ALL, orphanRemoval = true
			)
	@JoinTable(
			name = "species_type",
			joinColumns = @JoinColumn(name="id", referencedColumnName="speciesId"),
			inverseJoinColumns = @JoinColumn(name="type_id", referencedColumnName="id")
			)
	private  List<Type> type;

	public Species() {

	}

	public Species(String name, int speciesId, int dexorder, List<Type> type) {
		this.name = name;
		this.speciesId = speciesId;
		this.dexorder = dexorder;
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public int getSpeciesId() {
		return speciesId;
	}

	public int getDexorder() {
		return dexorder;
	}

	public List<Type> getType() {
		return type;
	}
}
