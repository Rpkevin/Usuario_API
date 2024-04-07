package com.javadb.usuarioapi.infrastructure.entidy;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Document(collation = "usuario_entidy")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UsuarioEntidy {

    @Id
    private String id;
    private String nome;
    private String email;
    private String documento;
    private LocalDateTime dataCadastro;
    private LocalDateTime dataAtualizacao;

}
