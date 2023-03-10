package com.am.hambuqueria.domain.service;

import com.am.hambuqueria.domain.model.Comida;
import com.am.hambuqueria.domain.model.enumeracao.TipoComida;
import com.am.hambuqueria.domain.repository.ComidaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ComidaService {
    @Autowired
    ComidaRepository repository;

    public Comida buscarPorID(int expectedId){
        return repository.findById(expectedId);
    }

    public List<Comida> buscarPorNome(String nome){
        return repository.findByNomeContainingIgnoreCase(nome);
    }

    public List<Comida> buscarPorTipoComida(TipoComida tipoComida){
        return repository.findByTipoComida(tipoComida);
    }

    public List<Comida> buscarPorDisoinibilidade(Boolean disponibilidade){
        return repository.findByDisponibilidade(disponibilidade);
    }

    public List<Comida> buscarPorPedidos_NumPedido(Integer numPedido){
        return repository.findByPedidos_NumPedido(numPedido);
    }
}
