package com.RafaelBertochi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.RafaelBertochi.domain.Ordem;

@Repository
public interface OrdemRepository extends JpaRepository<Ordem, Integer> {

}
