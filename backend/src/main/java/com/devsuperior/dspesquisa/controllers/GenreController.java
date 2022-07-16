package com.devsuperior.dspesquisa.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.dspesquisa.dto.GenreDTO;
import com.devsuperior.dspesquisa.services.GenreService;

@RestController
@RequestMapping("/genres")
public class GenreController {

	@Autowired
	private GenreService genreService;

	@GetMapping
	public List<GenreDTO> findAll() {
		return genreService.findAll();
	}

	@GetMapping("/{id}")
	public GenreDTO findById(@PathVariable Long id) {
		return genreService.findById(id);
	}
}
