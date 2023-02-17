package com.am.hambuqueria.domain.repositoryTest;

import com.am.hambuqueria.domain.model.Pessoa;
import com.am.hambuqueria.domain.repository.PessoaRepository;
import org.junit.Before;
import org.junit.Test;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import static org.mockito.Mockito.*;

@DataJpaTest
public class PessoaRepositoryTest {
   /* PessoaRepository repository;
    Pessoa info;

    @Before
    public void init() {
        repository = mock(PessoaRepository.class);
        info = Pessoa.builder()
                .id(1)
                .nome("Lucas Felipe")
                .senha("123")
                .email("luscafreis@gmail.com")
                .endereco("rua 16 algum lugar")
                .telefone("98988525278")
                .build();
    }

    @Test
    public void deveInserirNovaInfo() {
        repository.save(info);
        verify(repository, times(1)).save(info);
    }

    @Test
    public void deveBuscarInfoPorNome() {
        var finder = "Lucas";
        when(repository.findByNomeContainingIgnoreCase(finder)).thenReturn(info);
    }

    @Test
    public void deveBuscarInfoPorEmail() {
        var finder = "luscafreis@gmail.com";
        when(repository.findByEmail(finder)).thenReturn(info);
    }

    @Test
    public void deveBuscarInfoPorId() {
        var finder = 1;
        when(repository.findById(finder)).thenReturn(info);
    }

    @Test
    public void deveDeletarInfo() {
        repository.delete(info);
        verify(repository, times(1)).delete(info);
    }*/
}
