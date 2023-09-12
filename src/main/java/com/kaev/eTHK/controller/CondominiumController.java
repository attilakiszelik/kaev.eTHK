package com.kaev.eTHK.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import com.kaev.eTHK.dto.CondominiumDto;
import com.kaev.eTHK.mapper.CondominiumMapper;
import com.kaev.eTHK.model.Condominium;
import com.kaev.eTHK.service.CondominiumService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/ethk")
@RequiredArgsConstructor
public class CondominiumController {

	private final CondominiumService condominiumService;
	private final CondominiumMapper condominiumMapper;
	
	@GetMapping("/")
	public List<CondominiumDto> getCondominiums(){
		
		List<Condominium> condominiums = condominiumService.findAll();
		
		return condominiumMapper.condominiumsToDtos(condominiums);
		
	}
	
	@GetMapping("/{id}")
	public CondominiumDto getCondominiumByID(@PathVariable long id){
		
		Condominium condominium = condominiumService.findByID(id)
				.orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
		
		return condominiumMapper.condominiumToDto(condominium);
		
	}
	
	@PostMapping
	public CondominiumDto createCondominium(@RequestBody CondominiumDto condDto) {
		
		Condominium cond = condominiumMapper.dtoToCondominium(condDto);
		
		Condominium condominium = condominiumService.save(cond);
		
		return condominiumMapper.condominiumToDto(condominium);
		
	}
	
	@PutMapping
	public ResponseEntity<CondominiumDto> modifyCondominium(@PathVariable long id, @RequestBody CondominiumDto condDto) {
		
		Condominium cond = condominiumMapper.dtoToCondominium(condDto);
		cond.setId(id);
		
		Condominium condominium = condominiumService.update(cond);
		
		return ResponseEntity.ok(condominiumMapper.condominiumToDto(condominium));
		
	}
	
	@DeleteMapping("/{id}")
	public void deleteCondominium(@PathVariable long id){
		
		condominiumService.delete(id);
		
	}
	
}
