package com.am.hambuqueria.domain.repository.extend;

import com.am.hambuqueria.domain.model.enumeracao.FuncaoFuncionario;
import com.am.hambuqueria.domain.model.extend.Funcionario;
import com.am.hambuqueria.domain.repository.PessoaRepository;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FuncionarioRepository extends PessoaRepository<Funcionario> {
    List<Funcionario> findByFuncaoFuncionario(@NonNull FuncaoFuncionario funcaoFuncionario);

    Funcionario findByNomeContainingIgnoreCase(@NonNull String nome);

    Funcionario findByCpfContainingIgnoreCase(@NonNull String cpf);
}
