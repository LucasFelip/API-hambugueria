package com.am.hambuqueria.domain.repository;

import com.am.hambuqueria.domain.model.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PedidoRepository extends JpaRepository<Pedido, Integer> {

    //Pedido findByNum_pedido(@Nullable Integer num_pedido);

    List<Pedido> findAll();
}
