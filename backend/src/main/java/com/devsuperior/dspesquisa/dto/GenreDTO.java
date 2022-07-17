package com.devsuperior.dspesquisa.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.devsuperior.dspesquisa.entities.Game;

public class GenreDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	private Long id;
	private String name;
	private List<Game> games = new ArrayList<>();

	public GenreDTO() {
	}

	public GenreDTO(Long id, String name) {
		this.id = id;
		this.name = name;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Game> getGames() {
		return games;
	}
}
