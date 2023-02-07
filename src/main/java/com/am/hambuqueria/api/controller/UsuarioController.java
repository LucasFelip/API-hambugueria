package com.am.hambuqueria.api.controller;

import lombok.AllArgsConstructor;
import lombok.Builder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Builder
@RestController
@AllArgsConstructor
@RequestMapping(value = "/usuario")
public class UsuarioController {
    /*
    final PessoaRepository pessoaRepository;

    @DeleteMapping(value= "/{id}")
    @ResponseStatus(code = HttpStatus.NO_CONTENT)
    public void delete(@PathVariable int id){
        pessoaRepository.deleteById(id);
    }

    @PostMapping
    @ResponseStatus
    public ResponseEntity<Pessoa> create(@RequestBody Pessoa pessoa){
        Pessoa pessoaCreated = pessoaRepository.save(pessoa);
        return new ResponseEntity<>(pessoaCreated, HttpStatus.CREATED);
    }
     */
}
