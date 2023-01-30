package com.am.hambuqueria.domain.repository;

import com.am.hambuqueria.domain.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {

    List<Usuario> findByNomeContaining(@NonNull String nome);

    Usuario findByEmail(@NonNull String email);

    Usuario findById(@NonNull int expectedId);
}
