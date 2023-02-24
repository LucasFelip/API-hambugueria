package com.am.hambuqueria.domain.repository;

import com.am.hambuqueria.domain.model.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.lang.NonNull;

import java.util.List;

public interface PessoaRepository<T extends Pessoa> extends JpaRepository<T,Integer> {
    T findByNomeContainingIgnoreCase(@NonNull String nome);

    T findByCpfContainingIgnoreCase(@NonNull String cpf);
}
