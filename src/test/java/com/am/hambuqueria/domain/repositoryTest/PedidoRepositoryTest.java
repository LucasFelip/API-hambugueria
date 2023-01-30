package com.am.hambuqueria.domain.repositoryTest;

import com.am.hambuqueria.domain.repository.PedidoRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest
public class PedidoRepositoryTest {
    @Autowired
    private PedidoRepository repository;

    @Test
    void deveListarTodosPedidos() {
        var pedido = repository.findAll();
        assertNotNull(pedido);
    }

    @Test
    void deveBuscarPedidoPorNumeroPedido() {
        var expectedNum_pedido = 123123;
        var pedido = repository.findByNum_pedido(expectedNum_pedido);
        assertEquals(expectedNum_pedido, pedido.getNum_pedido());
    }

    @Test
    void deveBuscarPedidoPorNomeUsuario() {
        var containing = "L";
        var pedidos = repository.findByUsuario_Nome(containing);
        pedidos.forEach(pedido -> {
            assertTrue(pedido.getUsuario().getNome().contains(containing));
        });
    }
}
