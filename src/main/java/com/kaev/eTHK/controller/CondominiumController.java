package com.kaev.eTHK.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
		return condominiumService.getAll();
	}
	
	//test
	
}
