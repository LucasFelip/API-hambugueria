package com.am.hambuqueria.domain.repositoryTest;

import com.am.hambuqueria.domain.model.Comida;
import com.am.hambuqueria.domain.model.TipoComida;
import com.am.hambuqueria.domain.repository.ComidaRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest
public class ComidaRepositoryTest {
    @Autowired
    private ComidaRepository repository;

    Comida comida = (Comida.builder()
            .id(1)
            .nome("Thor")
            .descrição("Comida")
            .tipoComida(TipoComida.HAMBURGUER)
            .ingredientes("pão")
            .preco(27)
            .build());

    @Test
    void deveListarTodasComidas() {
        var comida = repository.findAll();
        assertNotNull(comida);
    }

    @Test
    void deveBuscarPorTipoComida(){
        TipoComida tipoComida = TipoComida.HAMBURGUER;
        var comidas = repository.findByTipoComida(tipoComida);
        comidas.forEach(comida -> {
            System.out.println("Response\n\n Expected type: " + tipoComida + " --- Food Type: " + comida.getTipoComida());
            assertTrue(comida.getTipoComida().equals(tipoComida));
        });
    }

    @Test
    void deveBuscarComidaPorId() {
        var expectedId = 1;
        var comida = repository.findById(expectedId);
        System.out.println("Response\n\n Expected ID: " + expectedId + " --- Food ID: " + comida.getId());
        assertEquals(expectedId, comida.getId());
    }

    @Test
    void deveBuscarComidaPorNome() {
        var containing = "T";
        var comidas = repository.findByNomeContaining(containing);
        comidas.forEach(comida -> {
            System.out.println("Response\n\n Containing: " + containing + " --- Food Name: " + comida.getNome());
            assertTrue(comida.getNome().contains(containing));
        });
    }
}
