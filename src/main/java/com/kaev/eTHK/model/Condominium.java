package com.kaev.eTHK.model;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Condominium {
	
	@Id
	@GeneratedValue
	@EqualsAndHashCode.Include()
	private long id;
	
	private String name;
	private String address;
	private String taxnumber;
	
	@OneToMany(mappedBy="condominium")
	private List<Flat> flats;

}
