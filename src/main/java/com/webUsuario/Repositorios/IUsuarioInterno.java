package com.webUsuario.Repositorios;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.webUsuario.Usuarios.usuarioInterno;

@Repository
public interface IUsuarioInterno extends MongoRepository<usuarioInterno, Integer>{

}
