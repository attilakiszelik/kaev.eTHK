package com.kaev.eTHK.service;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.kaev.eTHK.model.Condominium;
import com.kaev.eTHK.repository.CondominiumRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class CondominiumService {

	private final CondominiumRepository condominiumRepository;
	
	public List<Condominium> findAll(){
		return condominiumRepository.findAll();
	}

	public Optional<Condominium> findByID(long id) {
		return condominiumRepository.findById(id);
	}

	@Transactional
	public Condominium save(Condominium cond) {
		// TODO check unique
		return condominiumRepository.save(cond);
	}
	
	@Transactional
	public Condominium update(Condominium cond) {
		if (condominiumRepository.existsById(cond.getId()))
			return condominiumRepository.save(cond);
		else
			throw new NoSuchElementException();
	}

	@Transactional
	public void delete(long id) {
		condominiumRepository.deleteById(id);
	}
	
}
