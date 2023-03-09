package com.am.hambuqueria.domain.service.extend;

import com.am.hambuqueria.domain.model.enumeracao.FuncaoFuncionario;
import com.am.hambuqueria.domain.model.extend.Funcionario;
import com.am.hambuqueria.domain.repository.extend.FuncionarioRepository;
import com.am.hambuqueria.domain.service.PessoaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FuncionarioService extends PessoaService<Funcionario> {
    @Autowired
    private FuncionarioRepository repository;

    public List<Funcionario> buscarPorFuncao(FuncaoFuncionario funcaoFuncionario) {
        return repository.findByFuncaoFuncionario(funcaoFuncionario);
    }
}
