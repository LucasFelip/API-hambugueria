package com.am.hambuqueria.domain.service;

import com.am.hambuqueria.domain.model.Pedido;
import com.am.hambuqueria.domain.model.enumeracao.StatusPedido;
import com.am.hambuqueria.domain.model.enumeracao.TipoPedido;
import com.am.hambuqueria.domain.repository.PedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PedidoService {
    @Autowired
    PedidoRepository repository;

    public List<Pedido> buscaPorStatusPedido(StatusPedido statusPedido){
        return repository.findByStatusPedido(statusPedido);
    }

    public List<Pedido> buscarPorNomeCliente(String nome){
        return repository.findByCliente_NomeContainingIgnoreCase(nome);
    }

    public List<Pedido> buscarPorCpfCliente(String cpf){
        return repository.findByCliente_CpfContainingIgnoreCase(cpf);
    }

    public List<Pedido> buscarPorTipoPedido(TipoPedido tipoPedido){
        return repository.findByTipoPedido(tipoPedido);
    }
}
