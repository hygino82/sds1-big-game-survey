package com.devsuperior.dspesquisa.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.dspesquisa.dto.GameDTO;
import com.devsuperior.dspesquisa.services.GameService;

@RestController
@RequestMapping("/games")
public class GameController {

	@Autowired
	private GameService gameService;

	@GetMapping
	public Page<GameDTO> findAll(Pageable pageable) {
		return gameService.findAll(pageable);
	}

	@GetMapping("/{id}")
	public GameDTO findById(@PathVariable Long id) {
		return gameService.findById(id);
	}
}
