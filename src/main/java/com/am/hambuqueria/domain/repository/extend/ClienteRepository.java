package com.am.hambuqueria.domain.repository.extend;

import com.am.hambuqueria.domain.model.extend.Cliente;
import com.am.hambuqueria.domain.repository.PessoaRepository;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends PessoaRepository<Cliente> {
    Cliente findByPedidos_numPedido(@NonNull Integer num_pedido);
}
