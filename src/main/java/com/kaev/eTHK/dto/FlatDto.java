package com.kaev.eTHK.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class FlatDto {

	private long id;
	
	private CondominiumDto condominiumDto;
	
	private String building;
	private String staircase;
	private String floor;
	private String door;
	
	
}
