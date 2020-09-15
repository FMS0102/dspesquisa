package com.fms.dspesquisa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fms.dspesquisa.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long> {

}