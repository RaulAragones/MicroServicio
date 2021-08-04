package com.usuarioMS.Repositorio;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.usuarioMS.Usuarios.UsuarioInterno;
@Repository
public interface RepositorioUsuarioInternoMGDB extends MongoRepository<UsuarioInterno, Integer>{

}
