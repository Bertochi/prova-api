package com.RafaelBertochi.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;

import com.RafaelBertochi.domain.Ordem;

@Repository
public interface OrdemRepository extends JpaRepository<Ordem, Integer> {

	@Query("SELECT obj FROM Ordem obj WHERE obj.ativo.id =:ativo")
	List<Ordem> findOrdemByAtivo(@PathVariable Integer ativo);
	
}
