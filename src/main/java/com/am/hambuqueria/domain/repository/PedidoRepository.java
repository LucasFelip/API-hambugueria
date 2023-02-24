package com.am.hambuqueria.domain.repository;

import com.am.hambuqueria.domain.model.Pedido;
import com.am.hambuqueria.domain.model.enumeracao.StatusPedido;
import com.am.hambuqueria.domain.model.enumeracao.TipoPedido;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PedidoRepository extends JpaRepository<Pedido, Integer> {

    List<Pedido> findByStatusPedido(@NonNull StatusPedido statusPedido);

    List<Pedido> findByCliente_NomeContainingIgnoreCase(@NonNull String nome);

    List<Pedido> findByCliente_CpfContainingIgnoreCase(@NonNull String cpf);

    List<Pedido> findByTipoPedido(@NonNull TipoPedido tipoPedido);
}
