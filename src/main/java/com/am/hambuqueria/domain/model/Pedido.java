package com.am.hambuqueria.domain.model;

import com.am.hambuqueria.domain.model.enumeracao.StatusPedido;
import com.am.hambuqueria.domain.model.enumeracao.TipoPedido;
import com.am.hambuqueria.domain.model.extend.Cliente;
import jakarta.persistence.*;
import lombok.*;

import java.util.HashSet;
import java.util.Set;

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Pedido {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "codigo_pedido")
    private Integer id;

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer numPedido;

    private TipoPedido tipoPedido;

    private StatusPedido statusPedido = null;

    @ManyToOne
    @JoinColumn(name = "codigo_pessoa", referencedColumnName = "codigo_pessoa")
    private Cliente cliente;

    @ManyToMany(cascade = {CascadeType.ALL})
    @JoinTable(name = "comida_pedido",
            joinColumns = {@JoinColumn(name = "codigo_comida")},
            inverseJoinColumns = {@JoinColumn(name = "codigo_pedido")}
    )
    private Set<Comida> comidas = new HashSet<Comida>();

    public void setStatusPedido(StatusPedido statusPedido) {
        if (tipoPedido == TipoPedido.ENTREGA) {
            this.statusPedido = statusPedido;
        } else {
            throw new IllegalArgumentException("Status de pedido é válido apenas para os tipo ENTREGA");
        }
    }
}
