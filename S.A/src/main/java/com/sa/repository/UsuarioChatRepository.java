package com.sa.repository;

import com.sa.model.Usuario;
import com.sa.model.UsuarioChat;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UsuarioChatRepository extends JpaRepository<UsuarioChat,Long> {

    public UsuarioChat findByUsuario1AndUsuario2(Usuario usuario1, Usuario usuario2);
    public List<UsuarioChat> findByUsuario1OrUsuario2(Usuario usuario1, Usuario usuario2);


}
