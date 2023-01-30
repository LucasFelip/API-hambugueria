package com.am.hambuqueria.domain.model;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.List;

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
/*  Classe de modelo de Usuário  */
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "codigo_usuario")
    private Integer id;

    @NotBlank
    @Size(min = 3, max = 100)
    private String nome;

    @Size(min = 5, max = 45)
    private String email;

    @Size(min = 6, max = 16)
    private String senha;

    @Size(max = 30)
    private String telefone;

    @Size(max = 100)
    private String endereco;

    @OneToMany
    @JoinColumn(name = "codigo_pedido")
    private List<Pedido> pedidos;
}
