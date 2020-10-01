package com.estagio.conect.projetoTimeRecord.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.estagio.conect.projetoTimeRecord.model.Location;
import com.estagio.conect.projetoTimeRecord.service.LocationService;

@RestController
@RequestMapping("/location")
public class LocationController {
	
	@Autowired
	private LocationService locationService;
	
	@GetMapping
	public List<Location> obterTodos() {
		return this.locationService.obterTodos();
	}
	
	@PostMapping
	public Location criar(@RequestBody Location location) {
		return this.locationService.criar(location);
	}
	
	@GetMapping("/{codigo}")
	public Location obterPorCodigo(@PathVariable String codigo){
		return this.locationService.obterPorCodigo(codigo);
	}

}
