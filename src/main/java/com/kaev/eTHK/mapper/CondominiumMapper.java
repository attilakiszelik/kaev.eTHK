package com.kaev.eTHK.mapper;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.kaev.eTHK.dto.CondominiumDto;
import com.kaev.eTHK.model.Condominium;

@Mapper(componentModel = "spring")
public interface CondominiumMapper {
	
	@Mapping(target="flatDtos", ignore = true)
	CondominiumDto condominiumToDto(Condominium condominium);
	
	@Mapping(target="flats", ignore = true)
	Condominium dtoToCondominium(CondominiumDto condominiumDto);
	
	List<CondominiumDto> condominiumsToDtos(List<Condominium> condominium);
	
	List<Condominium> dtosToCondominiums(List<CondominiumDto> condominiumDto);
	
}
