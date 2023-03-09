package com.am.hambuqueria.domain.repository;

import com.am.hambuqueria.domain.model.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.lang.NonNull;

public interface PessoaRepository<T extends Pessoa> extends JpaRepository<T,Integer> {

}
