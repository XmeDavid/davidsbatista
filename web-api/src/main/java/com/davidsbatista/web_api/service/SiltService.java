
package com.davidsbatista.web_api.service;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.stream.Collectors;

import com.davidsbatista.web_api.dto.CreateSiltDTO;
import com.davidsbatista.web_api.dto.SiltDTO;
import com.davidsbatista.web_api.model.Silt;
import com.davidsbatista.web_api.repository.SiltRepository;

import org.springframework.stereotype.Service;

@Service
public class SiltService {

	private final SiltRepository siltRepository;

	public SiltService(SiltRepository siltRepository){
		this.siltRepository = siltRepository;
	}

	public SiltDTO create(CreateSiltDTO request) {
		Silt silt = new Silt();
		silt.setTitle(request.getTitle());
		silt.setUrl(request.getUrl());
		silt.setNotes(request.getNotes());
		Silt savedSilt = this.siltRepository.save(silt);
		return SiltDTO.from(savedSilt);
	}

	public Optional<SiltDTO> get(UUID id){
		Silt silt = this.siltRepository.findById(id)
			.orElseThrow(() -> new RuntimeException("Silt not found with id: " + id));
		return SiltDTO.from(silt);
	}

	public List<SiltDTO> getAll(){
		return this.siltRepository.findAll()
			.stream()
			.map(SiltDTO::from)
			.collect(Collectors.toList());
	}
}
