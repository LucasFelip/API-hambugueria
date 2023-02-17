package com.am.hambuqueria.domain.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class Pessoa {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "codigo_pessoa")
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

    @Size(min = 11, max = 11)
    @NotBlank
    private String cpf;
}
