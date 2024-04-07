package com.javadb.usuarioapi.infrastructure.repository;

import com.javadb.usuarioapi.infrastructure.entidy.EnderecoEntidy;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.transaction.annotation.Transactional;

public interface EnderecoRepository extends MongoRepository<EnderecoEntidy,String> {

    EnderecoEntidy findByUsuarioId(String usuarioId);

    @Transactional
    void deleteByUsuarioId(String usuarioId);
}
