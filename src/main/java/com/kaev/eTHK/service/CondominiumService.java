package com.kaev.eTHK.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.kaev.eTHK.model.Condominium;
import com.kaev.eTHK.repository.CondominiumRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class CondominiumService {

	private final CondominiumRepository condominiumRepository;
	
	public List<Condominium> getAll(){
		return condominiumRepository.findAll();
	}
	
}
