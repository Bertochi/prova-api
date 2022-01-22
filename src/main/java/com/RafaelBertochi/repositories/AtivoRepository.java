package com.RafaelBertochi.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.RafaelBertochi.domain.Ativo;

@Repository
public interface AtivoRepository extends JpaRepository<Ativo, Integer>{

	@Query("SELECT obj FROM Ativo obj WHERE obj.nome =:nome")
	Optional<Ativo> findByNome(@Param("nome") String nome);
}
