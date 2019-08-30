package com.glicose.controle.cadastro.service;

import com.glicose.controle.cadastro.domain.Glicose;
import com.glicose.controle.cadastro.dto.ControleDto;
import com.glicose.controle.cadastro.exceptions.ObjectNotFoundException;
import com.glicose.controle.cadastro.repository.GlicoseRepository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class GlicoseService {

    private GlicoseRepository glicoseRepository;

    public GlicoseService(GlicoseRepository glicoseRepository){
        this.glicoseRepository = glicoseRepository;
    }

    public List<Glicose> listar(){
        return glicoseRepository.findAll();
    }

    public Glicose buscar(String id){
        return Optional.ofNullable(glicoseRepository.findById(id)).get()
                       .orElseThrow(() -> new ObjectNotFoundException("Controle de glicose não encontrado"));
    }

    public void inserir(ControleDto controleDto){
        glicoseRepository.insert(new Glicose(controleDto.getStatusRefeicao(), controleDto.getIndice()));
    }

    public void alterar(ControleDto controleDto, String id){
        Glicose glicose = buscar(id);
        glicose.setIndice(controleDto.getIndice());
        glicose.setStatusRefeicao(controleDto.getStatusRefeicao());
        glicoseRepository.save(glicose);
    }

    public void deletar(String id){
        glicoseRepository.delete(buscar(id));
    }

}
