package com.glicose.controle.cadastro.dto;

import lombok.Data;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Positive;
import javax.validation.constraints.Size;
import java.io.Serializable;

@Data
public class ControleDto implements Serializable {

    private static final long serialVersionUID = 1L;

    @NotEmpty(message="Preenchimento obrigatório")
    @Size(min = 1, max = 1, message = "Deve possuir somente um caracter ( A ou D )")
    private String statusRefeicao;
    @Positive(message = "Somente valores positivos são permitidos")
    private Integer indice;

}
