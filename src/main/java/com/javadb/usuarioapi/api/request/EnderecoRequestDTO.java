package com.javadb.usuarioapi.api.request;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder

public class EnderecoRequestDTO {

    private String rua;
    private String numero;
    private String bairro;
    private String complemento;
    private String cidade;
    private String cep;

}
