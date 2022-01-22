package com.RafaelBertochi.dtos;

import java.io.Serializable;

import com.RafaelBertochi.domain.Ativo;

public class AtivoDTO implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private Integer id;
	private String nome;
	private Double preco;
	
	public AtivoDTO() {
		super();
	}

	public AtivoDTO(Ativo obj) {
		super();
		this.id = obj.getId();
		this.nome = obj.getNome();
		this.preco = obj.getPreco();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}
	
	
	
	
}
