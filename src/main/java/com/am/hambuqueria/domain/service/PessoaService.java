package com.am.hambuqueria.domain.service;

import com.am.hambuqueria.domain.model.Pessoa;
import com.am.hambuqueria.domain.repository.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public abstract class PessoaService<T extends Pessoa> {
    @Autowired
    private PessoaRepository<T> repository;

    public T salvar(T pessoa) {
        return repository.save(pessoa);
    }

    public List<T> buscarTodas() {
        return repository.findAll();
    }

    public Optional<T> buscarPorId(Integer id) {
        return repository.findById(id);
    }

    public void deletarPorId(Integer id) {
        repository.deleteById(id);
    }

}
