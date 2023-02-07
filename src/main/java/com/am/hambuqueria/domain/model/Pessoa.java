package com.am.hambuqueria.domain.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.*;

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Pessoa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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
}
