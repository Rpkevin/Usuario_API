package com.javadb.usuarioapi.business;

import com.javadb.usuarioapi.infrastructure.entity.EnderecoEntity;
import com.javadb.usuarioapi.infrastructure.repository.EnderecoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class EnderecoService {
    private final EnderecoRepository enderecoRepository;

    public EnderecoEntity salvaEndereco(EnderecoEntity endereco) {
        return enderecoRepository.save(endereco);
    }

    public EnderecoEntity findByUsuario(String usuarioId) {return enderecoRepository.findByUsuarioId(usuarioId);}

    public void deleteByUsuarioId(String usuarioId) {enderecoRepository.deleteByUsuarioId(usuarioId);}
}
