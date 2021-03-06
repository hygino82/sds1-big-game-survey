package com.devsuperior.dspesquisa.services;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.devsuperior.dspesquisa.dto.GenreDTO;
import com.devsuperior.dspesquisa.repositories.GenreRepository;

@Service
public class GenreService {

	@Autowired
	private ModelMapper mapper;

	@Autowired
	private GenreRepository genreRepository;

	@Transactional(readOnly = true)
	public List<GenreDTO> findAll() {
		var list = genreRepository.findAll();
		return list.stream().map(x -> mapper.map(x, GenreDTO.class)).collect(Collectors.toList());
	}

	@Transactional(readOnly = true)
	public GenreDTO findById(Long id) {
		var obj = genreRepository.findById(id);
		return mapper.map(obj, GenreDTO.class);
	}
}
