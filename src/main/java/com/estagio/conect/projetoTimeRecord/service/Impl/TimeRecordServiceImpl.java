package com.estagio.conect.projetoTimeRecord.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.estagio.conect.projetoTimeRecord.model.Location;
import com.estagio.conect.projetoTimeRecord.model.TimeRecord;
import com.estagio.conect.projetoTimeRecord.repository.LocationRepository;
import com.estagio.conect.projetoTimeRecord.repository.TimeRecordRepository;
import com.estagio.conect.projetoTimeRecord.service.TimeRecordService;

@Service
public class TimeRecordServiceImpl implements TimeRecordService {
	
	@Autowired
	private TimeRecordRepository timeRecordRepository;
	@Autowired
	private LocationRepository locationRepository;

	@Override
	public List<TimeRecord> obterTodos() {
		return this.timeRecordRepository.findAll();
	}

	@Override
	public TimeRecord obterPorCodigo(String codigo) {
		return this.timeRecordRepository
				.findById(codigo)
				.orElseThrow(() -> new IllegalArgumentException("Record não existe."));
	}

	@Override
	public TimeRecord criar(TimeRecord timerecord) {
		if(timerecord.getLocation() != null) {
			Location location =
					this.locationRepository
					.findById(timerecord.getLocation().getId())
					.orElseThrow(() -> new IllegalArgumentException("Location inexiste"));
			timerecord.setLocation(location);
		}
		return this.timeRecordRepository.save(timerecord);
	}

}
