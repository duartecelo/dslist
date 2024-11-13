package com.duartecelo.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.duartecelo.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long>{

}
