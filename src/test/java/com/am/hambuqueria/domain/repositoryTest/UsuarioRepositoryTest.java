package com.am.hambuqueria.domain.repositoryTest;

import com.am.hambuqueria.domain.repository.UsuarioRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@DataJpaTest
public class UsuarioRepositoryTest {
    @Autowired
    private UsuarioRepository repository;

    @Test
    void deveBuscarUsuarioPorId() {
        var expectedId = 2;
        var usuario = repository.findById(expectedId);
        assertEquals(expectedId, usuario.getId());
    }

    @Test
    void deveBuscarUsuarioPorNome() {
        var containing = "E";
        var usuarios = repository.findByNomeContaining(containing);
        usuarios.forEach(usuario -> {
            assertTrue(usuario.getNome().contains(containing));
        });
    }

    @Test
    void deveBuscarUsuarioPorEmail() {
        var email = "lucasfelipe@gmail.com";
        var usuario = repository.findByEmail(email);
        assertEquals(email, usuario.getEmail());
    }
}
