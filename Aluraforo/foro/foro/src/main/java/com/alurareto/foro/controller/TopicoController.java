package com.alurareto.foro.controller;

import com.alurareto.foro.model.Topico;
import com.alurareto.foro.model.Usuario;
import com.alurareto.foro.service.TopicoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/topicos")
public class TopicoController {
    @Autowired
    private TopicoService topicoService;

    @GetMapping
    public List<Topico> listar() {
        return topicoService.listar();
    }

    @PostMapping
    public Topico crear(@RequestBody Topico topico, @AuthenticationPrincipal Usuario usuario) {
        topico.setUsuario(usuario);
        return topicoService.crear(topico);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Long id) {
        topicoService.eliminar(id);
    }
}
