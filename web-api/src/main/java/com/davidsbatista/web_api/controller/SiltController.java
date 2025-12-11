package com.davidsbatista.web_api.controller;

import java.util.List;

import com.davidsbatista.web_api.dto.CreateSiltDTO;
import com.davidsbatista.web_api.dto.SiltDTO;
import com.davidsbatista.web_api.service.SiltService;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/silts/")
public class SiltController {

	private final SiltService siltService;

	public SiltController(SiltService siltService){
		this.siltService = siltService;
	}

	@GetMapping
	public List<SiltDTO> getAll(){
		return this.siltService.getAll();
	}

	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public SiltDTO create(@RequestBody @Valid CreateSiltDTO request) {
		return this.siltService.create(request);

	}
	
}
