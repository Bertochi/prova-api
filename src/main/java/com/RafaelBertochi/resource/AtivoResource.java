package com.RafaelBertochi.resource;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.RafaelBertochi.dtos.AtivoDTO;
import com.RafaelBertochi.services.AtivoService;
@CrossOrigin("*")
@RestController
@RequestMapping(value = "/ativo")
public class AtivoResource {

	@Autowired
	private AtivoService service;
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<AtivoDTO> findById(@PathVariable Integer id) {
		AtivoDTO obj = new AtivoDTO(service.findById(id));
		return ResponseEntity.ok().body(obj);
	}
	@GetMapping
	public ResponseEntity<List<AtivoDTO>> findAll() {
		List<AtivoDTO> list = service.findAll().stream().map(obj -> new AtivoDTO(obj)).collect(Collectors.toList());
		return ResponseEntity.ok().body(list);
	}
	
	
}