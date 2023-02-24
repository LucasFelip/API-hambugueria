package com.am.hambuqueria.domain.model;

import com.am.hambuqueria.domain.model.enumeracao.TipoComida;
import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.*;

import java.util.HashSet;
import java.util.Set;

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Comida {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "codigo_comida")
    private Integer id;

    @NotBlank
    @Size(min = 3, max = 100)
    private String nome;

    @NotBlank
    private Boolean disponibilidade;

    private String descrição;

    @NotBlank
    private Integer preco;

    @NotBlank
    private String ingredientes;

    @ManyToMany(mappedBy = "comidas", cascade = { CascadeType.ALL })
    private Set<Pedido> pedidos = new HashSet<Pedido>();

    @NotBlank
    private TipoComida tipoComida;
}
