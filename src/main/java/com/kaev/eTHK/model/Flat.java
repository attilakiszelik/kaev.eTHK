package com.kaev.eTHK.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
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
public class Flat {

	@Id
	@GeneratedValue
	@EqualsAndHashCode.Include()
	private long id;
	
	@ManyToOne
	@JoinColumn(name="condominium_id", nullable=false)
	private Condominium condominium;
	
	private String building;
	private String staircase;
	private String floor;
	private String door;
	
}
