package com.glicose.controle.cadastro.repository;

import com.glicose.controle.cadastro.domain.Glicose;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GlicoseRepository extends MongoRepository<Glicose, String> {
}
