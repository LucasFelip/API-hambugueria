package com.am.hambuqueria.domain.repository.extend;

import com.am.hambuqueria.domain.model.extend.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Integer> {
    Cliente findByNomeContainingIgnoreCase(@NonNull String nome);


}