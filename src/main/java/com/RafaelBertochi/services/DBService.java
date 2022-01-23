package com.RafaelBertochi.services;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.RafaelBertochi.domain.Ativo;
import com.RafaelBertochi.domain.Ordem;
import com.RafaelBertochi.domain.Tipo;
import com.RafaelBertochi.repositories.AtivoRepository;
import com.RafaelBertochi.repositories.OrdemRepository;

@Service
public class DBService {
	@Autowired
	private OrdemRepository ordemRepository;
	@Autowired
	private AtivoRepository ativoRepository;
	

	public void instanciaDB() {
		Ativo ativo1 = new Ativo(null, "EMBR3", 19.21);
		Ativo ativo2 = new Ativo(null, "ITUB4", 29.81);
		Ativo ativo3 = new Ativo(null, "BBAS3", 31.82);
		Ativo ativo4 = new Ativo(null, "VALE3", 114.62);
		Ordem ordem1 = new Ordem(null, ativo2, Tipo.COMPRA, 1, 19.30);
		
		ativoRepository.saveAll(Arrays.asList(ativo1, ativo2, ativo3, ativo4));
		ordemRepository.saveAll(Arrays.asList(ordem1));
	}
}
