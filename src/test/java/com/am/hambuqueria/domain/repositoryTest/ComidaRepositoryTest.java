package com.am.hambuqueria.domain.repositoryTest;

import com.am.hambuqueria.domain.model.enumeracao.TipoComida;
import com.am.hambuqueria.domain.repository.ComidaRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest
public class ComidaRepositoryTest {
    @Autowired
    private ComidaRepository repository;

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
            assertTrue(comida.getTipoComida().equals(tipoComida));
        });
    }

    @Test
    void deveBuscarComidaPorId() {
        var expectedId = 1;
        var comida = repository.findById(expectedId);
        assertEquals(expectedId, comida.getId());
    }

    @Test
    void deveBuscarComidaPorNome() {
        var containing = "T";
        var comidas = repository.findByNomeContaining(containing);
        comidas.forEach(comida -> {
            assertTrue(comida.getNome().contains(containing));
        });
    }
}
