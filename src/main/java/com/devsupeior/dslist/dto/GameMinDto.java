package com.devsupeior.dslist.dto;

import com.devsupeior.dslist.entities.Game;
import com.devsupeior.dslist.projections.GameMinProjection;

import jakarta.persistence.Id;

public class GameMinDto {
	@Id
	private Long id;
	private String title;
	private Integer year;
	private String imgUrl;
	private String shortDescription;
	
	public GameMinDto() {
		
	}

	public GameMinDto(Game entity) {
		super();
		id = entity.getId();
		title = entity.getTitle();
		year = entity.getYear();
		imgUrl = entity.getImgUrl();
		shortDescription = entity.getShortDescription();
	}
	
	public GameMinDto(GameMinProjection projection) {
		super();
		id = projection.getId();
		title = projection.getTtile();
		year = projection.getYear();
		imgUrl = projection.getImgUrl();
		shortDescription = projection.getShortDescription();
	}

	public Long getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public Integer getYear() {
		return year;
	}

	public String getImgUrl() {
		return imgUrl;
	}

	public String getShortDescription() {
		return shortDescription;
	}
	
	
	
}
