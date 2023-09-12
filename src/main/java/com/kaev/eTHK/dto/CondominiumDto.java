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

public class CondominiumDto {

	private long id;
	private String name;
	private String address;
	private String taxnumber;
	
}
