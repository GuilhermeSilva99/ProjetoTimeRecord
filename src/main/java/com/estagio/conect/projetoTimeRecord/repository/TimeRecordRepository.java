package com.estagio.conect.projetoTimeRecord.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.estagio.conect.projetoTimeRecord.model.TimeRecord;

public interface TimeRecordRepository extends MongoRepository<TimeRecord, String>{

}
