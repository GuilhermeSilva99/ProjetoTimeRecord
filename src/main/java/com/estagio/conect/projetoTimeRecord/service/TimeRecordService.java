package com.estagio.conect.projetoTimeRecord.service;

import java.util.List;

import com.estagio.conect.projetoTimeRecord.model.TimeRecord;

public interface TimeRecordService {
	
	public List<TimeRecord> obterTodos();
	public TimeRecord obterPorCodigo(String codigo);
	public TimeRecord criar(TimeRecord timerecord);

}
