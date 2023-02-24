package com.am.hambuqueria.domain.model.extend;

import com.am.hambuqueria.domain.model.Pessoa;
import com.am.hambuqueria.domain.model.enumeracao.FuncaoFuncionario;
import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.*;

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Funcionario extends Pessoa {
    @NotBlank
    private FuncaoFuncionario funcaoFuncionario;
}
