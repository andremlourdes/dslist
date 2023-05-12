package com.devsupeior.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.devsupeior.dslist.dto.GameListDTO;
import com.devsupeior.dslist.entities.GameList;
import com.devsupeior.dslist.repositories.GameListRepository;

@Component
public class GameListService {
	
	@Autowired
	private GameListRepository gamelistRepository;
	
	@Transactional(readOnly = true)
	public List<GameListDTO> findAll(){
		List<GameList> result = gamelistRepository.findAll();
		return  result.stream().map(x -> new GameListDTO(x)).toList();
		
	}
	}
