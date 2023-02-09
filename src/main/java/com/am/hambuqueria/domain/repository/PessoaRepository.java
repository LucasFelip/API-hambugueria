package com.am.hambuqueria.domain.repository;

import com.am.hambuqueria.domain.model.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Repository;

@Repository
public interface PessoaRepository extends JpaRepository<Pessoa, Integer> {

    Pessoa findByNomeContainingIgnoreCase(@NonNull String nome);

    Pessoa findByEmail(@NonNull String email);

    Pessoa findById(@NonNull int expectedId);

}
