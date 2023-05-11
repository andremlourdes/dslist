package com.devsupeior.dslist.services;

import java.util.List;

import org.hibernate.transform.ToListResultTransformer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.devsupeior.dslist.dto.GameMinDto;
import com.devsupeior.dslist.entities.Game;
import com.devsupeior.dslist.repositories.GameRepository;

@Component
public class GameService {
	
	@Autowired
	private GameRepository gameRepository;
	
	public List<GameMinDto> findAll(){
		List<Game> result = gameRepository.findAll();
		return  result.stream().map(x -> new GameMinDto(x)).toList();
		
	}
}
