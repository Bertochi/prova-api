package com.RafaelBertochi.domain;

public enum Tipo {

	COMPRA(1, "COMPRA"), VENDA(2, "VENDA");
	
	private Integer cod;
	private String descricao;
	
	private Tipo(Integer cod, String descricao) {
		this.cod = cod;
		this.descricao = descricao;
	}
	public Integer getCod() {
		return cod;
	}
	public String getDescricao() {
		return descricao;
	}
	
	public static Tipo toEnum(Integer cod) {
		if(cod == null) {
			return null;
		}
		for(Tipo x : Tipo.values()) {
			if(cod.equals(x.getCod())) {
				return x;
			}
		}
		throw new IllegalArgumentException("Prioridade inválida!" + cod);
	}
	
	
}
