package com.am.hambuqueria.domain.model.extend;

import com.am.hambuqueria.domain.model.Pessoa;
import com.am.hambuqueria.domain.model.enumeracao.FuncaoFuncionario;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Funcionario extends Pessoa {
    @Size(min = 11, max = 11)
    @NotBlank
    private String cpf;

    @NotBlank
    private FuncaoFuncionario funcaoFuncionario;
}
