package com.am.hambuqueria.domain.service;

import com.am.hambuqueria.domain.model.Usuario;
import com.am.hambuqueria.domain.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
public class UsuarioService {
    @Autowired
    private UsuarioRepository repository;

    public List<Usuario> listAll() {
        return repository.findAll();
    }

    public Optional<Usuario> findUserById(Integer id) {
        return repository.findById(id);
    }

    public List<Usuario> findUserByName(String name) {
        return repository.findByNomeContaining(name);
    }

    @Transactional
    public Usuario saveUser(Usuario usuario) {
        return repository.save(usuario);
    }

    @Transactional
    public void deleteUserById(Integer id) {
        repository.deleteById(id);
    }
}
