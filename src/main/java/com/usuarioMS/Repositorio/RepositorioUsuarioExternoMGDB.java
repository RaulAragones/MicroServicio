package com.usuarioMS.Repositorio;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.usuarioMS.Usuarios.UsuarioExterno;

@Repository
public interface RepositorioUsuarioExternoMGDB extends MongoRepository<UsuarioExterno, Integer>{

}
