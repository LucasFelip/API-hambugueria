package com.am.hambuqueria.domain.model;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
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
