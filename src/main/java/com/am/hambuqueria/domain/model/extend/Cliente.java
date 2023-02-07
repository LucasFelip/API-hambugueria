package com.am.hambuqueria.domain.model.extend;

import com.am.hambuqueria.domain.model.Pedido;
import com.am.hambuqueria.domain.model.Pessoa;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.*;

import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Cliente extends Pessoa {
    @Size(min = 11, max = 11)
    @NotBlank
    private String cpf;

    @OneToMany
    @JoinColumn(name = "codigo_pedido")
    private List<Pedido> pedidos;
}
