package com.RafaelBertochi.dtos;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.validation.constraints.NotNull;

import com.RafaelBertochi.domain.Ordem;

public class OrdemDTO implements Serializable {
		private static final long serialVersionUID = 1L;

		private Integer id;
		@NotNull(message = "O campo ATIVO é requerido")
		private Integer ativo;
		@NotNull(message = "O campo TIPO é requerido")
		private Integer tipo;
		@NotNull(message = "O campo QUANTIDADE é requerido")
		private Integer quantidade;
		@NotNull(message = "O campo VALOR é requerido")
		private Double valor;
		private LocalDateTime data;

		public OrdemDTO(Ordem obj) {
			super();
			this.id = obj.getId();
			this.ativo = obj.getAtivo().getId();
			this.tipo = obj.getTipo();
			this.quantidade = obj.getQuantidade();
			this.valor = obj.getValor();
			this.setData(LocalDateTime.now());
		}

		public OrdemDTO() {
			super();
		}

		public Integer getId() {
			return id;
		}

		public void setId(Integer id) {
			this.id = id;
		}

		public Integer getAtivo() {
			return ativo;
		}

		public void setAtivo(Integer ativo) {
			this.ativo = ativo;
		}

		public Integer getTipo() {
			return tipo;
		}

		public void setTipo(Integer tipo) {
			this.tipo = tipo;
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
