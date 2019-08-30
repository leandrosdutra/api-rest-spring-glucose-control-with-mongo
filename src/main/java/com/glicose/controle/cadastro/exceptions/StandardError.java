package com.glicose.controle.cadastro.exceptions;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
public class StandardError implements Serializable {

    private static final long serialVersionUID = 1L;

    private LocalDateTime timestamp;
    private Integer status;
    private String error;
    private String message;
    private String path;

}
