package com.estagio.conect.projetoTimeRecord.service;

import java.util.List;

import com.estagio.conect.projetoTimeRecord.model.Location;

public interface LocationService {
	
	public List<Location> obterTodos();
	public Location criar(Location location);
	public Location obterPorCodigo(String codigo);

}
