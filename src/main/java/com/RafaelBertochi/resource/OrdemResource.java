package com.RafaelBertochi.resource;

import java.net.URI;
import java.util.List;
import java.util.stream.Collectors;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.RafaelBertochi.dtos.OrdemDTO;
import com.RafaelBertochi.services.OrdemService;
@CrossOrigin("*")
@RestController
@RequestMapping(value = "/ordem")
public class OrdemResource {

	@Autowired
	private OrdemService service;
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<OrdemDTO> findById(@PathVariable Integer id) {
		OrdemDTO obj = new OrdemDTO(service.findById(id));
		return ResponseEntity.ok().body(obj);
	}
	@GetMapping
	public ResponseEntity<List<OrdemDTO>> findAll() {
		List<OrdemDTO> list = service.findAll().stream().map(obj -> new OrdemDTO(obj)).collect(Collectors.toList());
		return ResponseEntity.ok().body(list);
	}
	@PostMapping
	public ResponseEntity<OrdemDTO> create(@Valid @RequestBody OrdemDTO obj){
		 obj = new OrdemDTO (service.create(obj));
		 URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
				 .buildAndExpand(obj.getId()).toUri();
		 return ResponseEntity.created(uri).build();
	}
	
}
