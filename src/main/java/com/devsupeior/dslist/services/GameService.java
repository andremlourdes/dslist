package com.devsupeior.dslist.services;

import java.util.List;

import org.hibernate.transform.ToListResultTransformer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.devsupeior.dslist.dto.GameDTO;
import com.devsupeior.dslist.dto.GameMinDto;
import com.devsupeior.dslist.entities.Game;
import com.devsupeior.dslist.projections.GameMinProjection;
import com.devsupeior.dslist.repositories.GameRepository;

@Component
public class GameService {
	
	@Autowired
	private GameRepository gameRepository;
	
	@Transactional(readOnly = true)
	public GameDTO findById(long id) {
		Game result = gameRepository.findById(id).get();
		return new GameDTO(result);
	}
	@Transactional(readOnly = true)
	public List<GameMinDto> findAll(){
		List<Game> result = gameRepository.findAll();
		return  result.stream().map(x -> new GameMinDto(x)).toList();
		}
	@Transactional(readOnly = true)
	public List<GameMinDto> findbyList(long listId){
		List<GameMinProjection> result = gameRepository.searchByList(listId);
		return  result.stream().map(x -> new GameMinDto(x)).toList();
		}
}
