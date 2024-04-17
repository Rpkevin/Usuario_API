package com.javadb.usuarioapi.api.response;

public record UsuarioResponseDTO(String id,

                                 String nome,

                                 String email,

                                 String documento,

                                 EnderecoResponseDTO endereco) {
}
