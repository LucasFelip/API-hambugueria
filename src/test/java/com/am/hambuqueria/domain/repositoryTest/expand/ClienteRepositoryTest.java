package com.am.hambuqueria.domain.repositoryTest.expand;

import com.am.hambuqueria.domain.model.extend.Cliente;
import com.am.hambuqueria.domain.repository.PessoaRepository;
import com.am.hambuqueria.domain.repository.extend.ClienteRepository;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import static org.mockito.Mockito.*;
import static org.springframework.test.util.AssertionErrors.assertNotNull;

@DataJpaTest
@RunWith(MockitoJUnitRunner.class)
public class ClienteRepositoryTest {
    @Mock
    ClienteRepository repository;
    Cliente info;

    @Before
    public void init() {
        info = new Cliente();
        info.setNome("Lucas Felipe");
        info.setCpf("12345678998");
        info.setEmail("lucas@gmail.com");
        info.setSenha("123");
        info.setTelefone("98988885252");
        info.setEndereco("Algum lugar");
//        info.setPedidos();
    }

    @Test
    public void deveInserirNovaInfo() {
        info = new Cliente();
        info.setNome("Lucas Felipe");
        info.setCpf("12345678998");
        info.setEmail("lucas@gmail.com");
        info.setSenha("123");
        info.setTelefone("98988885252");
        info.setEndereco("Algum lugar");
        repository.save(info);
        when(repository.save(info)).thenReturn(info);
    }
}
