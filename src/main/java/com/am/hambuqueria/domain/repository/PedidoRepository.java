package com.am.hambuqueria.domain.repository;

import com.am.hambuqueria.domain.model.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PedidoRepository extends JpaRepository<Pedido, Integer> {
    List<Pedido> findByUsuario_Nome(@NonNull String nome);

    Pedido findByNum_pedido(@NonNull Integer num_pedido);

    List<Pedido> findAll();
}
