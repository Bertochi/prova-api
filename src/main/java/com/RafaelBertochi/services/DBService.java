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
		Ordem ordem1 = new Ordem(null, ativo2, Tipo.VENDA, 1, 29.81);
		Ordem ordem2 = new Ordem(null, ativo2, Tipo.COMPRA, 19, 364.99);
		Ordem ordem3 = new Ordem(null, ativo1, Tipo.VENDA, 10, 192.1);
		Ordem ordem4 = new Ordem(null, ativo1, Tipo.COMPRA, 14, 268.94);
		Ordem ordem5 = new Ordem(null, ativo3, Tipo.VENDA, 4, 127.28);
		Ordem ordem6 = new Ordem(null, ativo3, Tipo.COMPRA, 5, 159.1);
		Ordem ordem7 = new Ordem(null, ativo4, Tipo.VENDA, 1, 114.62);
		Ordem ordem8 = new Ordem(null, ativo4, Tipo.COMPRA, 2, 229.24);
		Ordem ordem9 = new Ordem(null, ativo1, Tipo.VENDA, 3, 57.63);
		Ordem ordem10 = new Ordem(null, ativo3, Tipo.COMPRA, 1, 31.82);
		Ordem ordem11 = new Ordem(null, ativo2, Tipo.VENDA, 1, 29.81);
		
		ativoRepository.saveAll(Arrays.asList(ativo1, ativo2, ativo3, ativo4));
		ordemRepository.saveAll(Arrays.asList(ordem1, ordem2, ordem3, ordem4, ordem5, ordem6, ordem7, ordem8, ordem9,
				ordem10, ordem11));
	}
}
