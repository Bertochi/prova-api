package com.RafaelBertochi.services;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.RafaelBertochi.domain.Ativo;
import com.RafaelBertochi.domain.Ordem;
import com.RafaelBertochi.domain.Tipo;
import com.RafaelBertochi.dtos.OrdemDTO;
import com.RafaelBertochi.repositories.OrdemRepository;
import com.RafaelBertochi.services.exceptions.ObjectNotFoundException;

@Service
public class OrdemService {
	@Autowired
	private OrdemRepository repository;
	@Autowired
	private AtivoService ativoService;	

	public Ordem findById(Integer id) {
		Optional<Ordem> obj = repository.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado! Id: " + id));
	}
	public List<Ordem> findAll() {
		return repository.findAll();
	}
	public Ordem create(@Valid OrdemDTO obj) {
		return fromDTO(obj);
	}
	
	private Ordem fromDTO (OrdemDTO obj) {
		Ordem newObj = new Ordem();
		newObj.setId(obj.getId());
		newObj.setQuantidade(obj.getQuantidade());
		newObj.setTipo(Tipo.toEnum(obj.getTipo().getCod()));
		newObj.setValor(obj.getValor());
		Ativo at =  ativoService.findById(obj.getAtivo());
				
		newObj.setAtivo(at);
		newObj.setData(LocalDateTime.now());
		return repository.save(newObj);
	}
	public List<Ordem> findOrdemByAtivo(Integer id) {
		return repository.findOrdemByAtivo(id);
	}

	
}
