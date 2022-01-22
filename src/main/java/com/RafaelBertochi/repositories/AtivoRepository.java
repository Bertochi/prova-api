package com.RafaelBertochi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.RafaelBertochi.domain.Ativo;

@Repository
public interface AtivoRepository extends JpaRepository<Ativo, Integer>{

}
