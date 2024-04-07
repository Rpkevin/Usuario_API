package com.javadb.usuarioapi.infrastructure.repository;

import com.javadb.usuarioapi.infrastructure.entidy.UsuarioEntidy;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.transaction.annotation.Transactional;

public interface UsuarioRepository extends MongoRepository<UsuarioEntidy, String> {

    UsuarioEntidy findByEmail(String email);

    @Transactional
    void deleteByEmail(String email);
}
