package com.kaev.eTHK.mapper;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.kaev.eTHK.dto.FlatDto;
import com.kaev.eTHK.model.Flat;

@Mapper(componentModel = "spring")
public interface FlatMapper {
	
	@Mapping(target="condominiumDto", ignore = true)
	FlatDto flatToDto(Flat flat);
	
	@Mapping(target="condominium", ignore = true)
	Flat dtoToFlat(FlatDto flatDto);
	
	List<FlatDto> flatsToDtos(List<Flat> flat);
	
	List<Flat> dtosToFlats(List<FlatDto> flatDto);

}
