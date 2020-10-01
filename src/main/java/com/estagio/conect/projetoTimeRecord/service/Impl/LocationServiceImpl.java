package com.estagio.conect.projetoTimeRecord.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.estagio.conect.projetoTimeRecord.model.Location;
import com.estagio.conect.projetoTimeRecord.repository.LocationRepository;
import com.estagio.conect.projetoTimeRecord.service.LocationService;

@Service
public class LocationServiceImpl implements LocationService {
	
	@Autowired
	private LocationRepository locationRepository;

	@Override
	public List<Location> obterTodos() {
		return this.locationRepository.findAll();
	}

	@Override
	public Location criar(Location location) {
		return this.locationRepository.save(location);
	}

	@Override
	public Location obterPorCodigo(String codigo) {
		return this.locationRepository.findById(codigo).orElseThrow(() -> new IllegalArgumentException("Location não existe."));
	}


}
