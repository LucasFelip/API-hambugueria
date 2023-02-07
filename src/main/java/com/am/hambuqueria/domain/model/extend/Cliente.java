package com.am.hambuqueria.domain.model.extend;

import com.am.hambuqueria.domain.model.Pedido;
import com.am.hambuqueria.domain.model.Pessoa;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Cliente extends Pessoa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "codigo_cliente")
    private Integer id;

    @OneToMany
    @JoinColumn(name = "codigo_pedido")
    private List<Pedido> pedidos;
}
