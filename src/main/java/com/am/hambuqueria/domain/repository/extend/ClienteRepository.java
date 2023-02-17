package com.am.hambuqueria.domain.repository.extend;

import com.am.hambuqueria.domain.model.extend.Cliente;
import com.am.hambuqueria.domain.repository.PessoaRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ClienteRepository extends PessoaRepository<Cliente> {
    List<Cliente> findByNomeContainingIgnoreCase(@NonNull String nome);

    List<Cliente> findByCpfContainingIgnoreCase(@NonNull String cpf);


}
