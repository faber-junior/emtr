package com.poo.emtr.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.poo.emtr.model.Viagem;

@Repository
public interface ViagemRepository extends JpaRepository<Viagem, Long>
{

}
