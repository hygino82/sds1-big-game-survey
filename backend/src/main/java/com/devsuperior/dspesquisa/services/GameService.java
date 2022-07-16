package com.devsuperior.dspesquisa.services;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.devsuperior.dspesquisa.dto.GameDTO;
import com.devsuperior.dspesquisa.repositories.GameRepository;

@Service
public class GameService {

	@Autowired
	private ModelMapper mapper;

	@Autowired
	private GameRepository gameRepository;

	@Transactional(readOnly = true)
	public Page<GameDTO> findAll(Pageable pageable) {
		var page = gameRepository.findAll(pageable);

		return page.map(x -> mapper.map(x, GameDTO.class));
	}

	@Transactional(readOnly = true)
	public GameDTO findById(Long id) {
		var obj = gameRepository.findById(id);

		return mapper.map(obj, GameDTO.class);
	}
}
