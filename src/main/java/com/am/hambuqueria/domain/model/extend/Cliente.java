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
    @OneToMany
    @JoinColumn(name = "codigo_pedido")
    private List<Pedido> pedidos;
}
