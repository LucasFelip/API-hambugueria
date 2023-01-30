package com.am.hambuqueria.api.controller;
import com.am.hambuqueria.domain.repository.UsuarioRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.am.hambuqueria.domain.model.Usuario;

import lombok.AllArgsConstructor;
import lombok.Builder;

@Builder
@RestController
@AllArgsConstructor
@RequestMapping(value = "/usuario")
public class UsuarioController {

    final UsuarioRepository usuarioRepository;

    @DeleteMapping(value= "/{id}")
    @ResponseStatus(code = HttpStatus.NO_CONTENT)
    public void delete(@PathVariable int id){
        usuarioRepository.deleteById(id);
    }

    @PostMapping
    @ResponseStatus
    public ResponseEntity<Usuario> create(@RequestBody Usuario usuario){
        Usuario usuarioCreated = usuarioRepository.save(usuario);
        return new ResponseEntity<>(usuarioCreated, HttpStatus.CREATED);
    }
}
