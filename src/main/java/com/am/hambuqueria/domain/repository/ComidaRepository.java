package com.am.hambuqueria.domain.repository;

import com.am.hambuqueria.domain.model.Comida;
import com.am.hambuqueria.domain.model.enumeracao.TipoComida;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ComidaRepository extends JpaRepository<Comida, Integer> {
    Comida findById(@NonNull int expectedId);

    List<Comida> findByNomeContainingIgnoreCase(@NonNull String nome);

    List<Comida> findAll();

    List<Comida> findByTipoComida(TipoComida tipoComida);

}