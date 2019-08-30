package com.glicose.controle.cadastro.controller;

import com.glicose.controle.cadastro.dto.ControleDto;
import com.glicose.controle.cadastro.service.GlicoseService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@AllArgsConstructor
@RequestMapping(path = "/api/controle/glicose")
public class GlicoseController {

    private GlicoseService glicoseService;

    @GetMapping("/listar")
    public ResponseEntity<?> listar(){
        return ResponseEntity.ok(glicoseService.listar());
    }

    @GetMapping("/buscar/{id}")
    public ResponseEntity<?> buscarPorId(@PathVariable String id){
        return ResponseEntity.ok(glicoseService.buscar(id));
    }

    @PostMapping("/inserir")
    public ResponseEntity inserir(@Valid @RequestBody ControleDto controleDto){
        glicoseService.inserir(controleDto);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @PutMapping("/alterar/{id}")
    public ResponseEntity alterar(@Valid @RequestBody ControleDto controleDto, @PathVariable String id){
        glicoseService.alterar(controleDto, id);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }

    @DeleteMapping("/deletar/{id}")
    public ResponseEntity deletar(@PathVariable String id){
        glicoseService.deletar(id);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }

}
