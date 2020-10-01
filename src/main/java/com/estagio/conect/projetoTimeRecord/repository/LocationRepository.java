package com.estagio.conect.projetoTimeRecord.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.estagio.conect.projetoTimeRecord.model.Location;

public interface LocationRepository extends MongoRepository<Location, String>{

}
