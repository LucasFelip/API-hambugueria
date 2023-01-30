package com.am.hambuqueria.domain.serviceTest;

import com.am.hambuqueria.domain.model.Usuario;
import com.am.hambuqueria.domain.service.UsuarioService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.transaction.Transactional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;


@Transactional
@SpringBootTest
class UsuarioServiceTest {
    private UsuarioService service;

    String name = "Lucas";
    String email = "luscafreis@gmail.com";
    String endereco = "Algum lugar";
    String senha = "12345";

    @Test
    void listAll() {
        service.listAll();
    }

    @Test
    void findUserById() {
        var expectedId = 2;
        var usuario = service.findUserById(expectedId);
        assertEquals(expectedId, usuario.get().getId());
    }

    @Test
    void findUserByName() {
        var containing = "L";
        var users = service.findUserByName(containing);
        users.forEach(usuario -> {
            assertTrue(usuario.getNome().contains(containing));
        });
    }

    @Test
    void saveUser() {
        Usuario usuario = Usuario.builder().nome(name).email(email).endereco(endereco).senha(senha).build();
        service.saveUser(usuario);
        var usuarios = service.findUserByName(name);
        usuarios.forEach( usuario1 -> {
            assertEquals(usuario1.getNome(), name);
        });
    }

    @Test
    void deleteUserById() {
        int expectedIdExclude = 1;
        service.deleteUserById(expectedIdExclude);
        var usuario = service.findUserById(expectedIdExclude);
        assertTrue(usuario.isEmpty());
    }
}