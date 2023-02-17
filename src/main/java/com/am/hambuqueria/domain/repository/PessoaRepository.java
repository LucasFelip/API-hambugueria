package com.am.hambuqueria.domain.repository;

import com.am.hambuqueria.domain.model.Pessoa;
import org.springframework.stereotype.Repository;

@Repository
public abstract class PessoaRepository<T extends Pessoa> {
    public abstract void save(T entity);
}
