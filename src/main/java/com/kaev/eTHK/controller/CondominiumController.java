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

import com.kaev.eTHK.model.Condominium;
import com.kaev.eTHK.service.CondominiumService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/ethk")
@RequiredArgsConstructor
public class CondominiumController {

	private final CondominiumService condominiumService;
	
	@GetMapping("/")
	public List<Condominium> getCondominiums(){
		
		return condominiumService.findAll();
		
	}
	
	@GetMapping("/{id}")
	public Condominium getCondominiumByID(@PathVariable long id){
		
		Condominium condominium = condominiumService.findByID(id)
				.orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
		
		return condominium;
		
	}
	
	@PostMapping
	public Condominium createCondominium(@RequestBody Condominium cond) {
		
		Condominium condominium = condominiumService.save(cond);
		return condominium;
		
	}
	
	@PutMapping
	public ResponseEntity<Condominium> modifyCondominium(@PathVariable long id, @RequestBody Condominium cond) {
		
		cond.setId(id);
		
		Condominium condominium = condominiumService.update(cond);
		return ResponseEntity.ok(condominium);
		
	}
	
	@DeleteMapping("/{id}")
	public void deleteCondominium(@PathVariable long id){
		
		condominiumService.delete(id);
		
	}
	
}
