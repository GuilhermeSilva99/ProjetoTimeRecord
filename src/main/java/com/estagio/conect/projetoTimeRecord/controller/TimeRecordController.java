package com.estagio.conect.projetoTimeRecord.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.estagio.conect.projetoTimeRecord.model.TimeRecord;
import com.estagio.conect.projetoTimeRecord.service.TimeRecordService;

@RestController
@RequestMapping("/timerecord")
public class TimeRecordController {
	
	@Autowired
	private TimeRecordService timeRecosdService;
	
	@GetMapping
	public List<TimeRecord> obterTodos(){
		return timeRecosdService.obterTodos();
	}
	
	@GetMapping("/{codigo}")
	public TimeRecord obterPorCodgio(@PathVariable String codigo) {
		return this.timeRecosdService.obterPorCodigo(codigo);
	}
	
	@PostMapping
	public TimeRecord criar(@RequestBody TimeRecord timeRecord) {
		 	return this.timeRecosdService.criar(timeRecord);
	}

}
