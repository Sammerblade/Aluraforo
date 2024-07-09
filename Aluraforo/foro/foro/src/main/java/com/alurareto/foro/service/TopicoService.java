package com.alurareto.foro.service;

import com.alurareto.foro.model.Topico;
import com.alurareto.foro.repository.TopicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TopicoService {
    @Autowired
    private TopicoRepository topicoRepository;

    // Métodos CRUD para tópicos
    public List<Topico> listar() {
        return topicoRepository.findAll();
    }

    public Topico crear(Topico topico) {
        return topicoRepository.save(topico);
    }

    public void eliminar(Long id) {
        topicoRepository.deleteById(id);
    }
}
