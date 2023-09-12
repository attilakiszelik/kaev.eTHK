package com.kaev.eTHK.mapper;

import java.util.List;

import org.mapstruct.Mapper;

import com.kaev.eTHK.dto.CondominiumDto;
import com.kaev.eTHK.model.Condominium;

@Mapper(componentModel = "spring")
public interface CondominiumMapper {
	
	CondominiumDto condominiumToDto(Condominium condominium);
	
	Condominium dtoToCondominium(CondominiumDto condominiumDto);
	
	List<CondominiumDto> condominiumsToDtos(List<Condominium> condominium);
	
	List<Condominium> dtosToCondominiums(List<CondominiumDto> condominiumDto);
	
}
