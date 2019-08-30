package com.glicose.controle.cadastro.domain;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Data
@Document(collection="glicose")
public class Glicose {

    @Id
    private String id;
    private String horario;
    private String statusRefeicao;
    private Integer indice;

    public Glicose(String statusRefeicao, Integer indice){
        this.horario = LocalDateTime.now().toString();
        this.statusRefeicao = statusRefeicao;
        this.indice = indice;
    }

}
