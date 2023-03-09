package com.am.hambuqueria.domain.service.extend;

import com.am.hambuqueria.domain.model.extend.Cliente;
import com.am.hambuqueria.domain.repository.extend.ClienteRepository;
import com.am.hambuqueria.domain.service.PessoaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClienteService extends PessoaService<Cliente> {
    @Autowired
    ClienteRepository repository;

    public Cliente buscarPorNumPedido(Integer num_pedido) {
        return repository.findByPedidos_numPedido(num_pedido);
    }
}
