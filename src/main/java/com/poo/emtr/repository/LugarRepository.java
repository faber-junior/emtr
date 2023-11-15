package com.poo.emtr.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.poo.emtr.model.Lugar;

@Repository
public interface LugarRepository extends JpaRepository<Lugar, Long>
{

}
