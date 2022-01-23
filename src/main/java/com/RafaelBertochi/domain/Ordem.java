package com.RafaelBertochi.domain;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
public class Ordem implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@ManyToOne
	@JoinColumn(name = "ativo_id")
	private Ativo ativo;
	private Integer tipo;
	private Integer quantidade;
	private Double valor;
	@JsonFormat(pattern = "dd/MM/yyyy  HH:mm")
	private LocalDateTime data;

	public Ordem(Integer id, Ativo ativo, Tipo tipo, Integer quantidade, Double valor) {
		super();
		this.id = id;
		this.ativo = ativo;
		this.tipo = tipo.getCod();
		this.quantidade = quantidade;
		this.valor = valor;
		this.setData(LocalDateTime.now());
	}

	public Ordem() {
		super();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Ativo getAtivo() {
		return ativo;
	}

	public void setAtivo(Ativo ativo) {
		this.ativo = ativo;
	}

	public Tipo getTipo() {
		return Tipo.toEnum(this.tipo);
	}

	public void setTipo(Tipo tipo) {
		this.tipo = tipo.getCod();
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	public LocalDateTime getData() {
		return data;
	}

	public void setData(LocalDateTime data) {
		this.data = data;
	}

}
