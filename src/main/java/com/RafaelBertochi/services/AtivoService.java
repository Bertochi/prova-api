package com.RafaelBertochi.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.RafaelBertochi.domain.Ativo;
import com.RafaelBertochi.repositories.AtivoRepository;
import com.RafaelBertochi.services.exceptions.ObjectNotFoundException;

@Service
public class AtivoService {
	@Autowired
	private AtivoRepository repository;

	public Ativo findById(Integer id) {
		Optional<Ativo> obj = repository.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado! Id: " + id));
	}
	public List<Ativo> findAll() {
		return repository.findAll();
	}
	public Ativo findByNome(String nome) {
		String nomeUpper = nome.toUpperCase();
		Optional<Ativo> obj = repository.findByNome(nomeUpper);
		return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
	}
}
