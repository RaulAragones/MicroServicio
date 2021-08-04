package com.webUsuario.Repositorios;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.webUsuario.Usuarios.usuarioExterno;
@Repository
public interface IUsuarioExterno extends MongoRepository<usuarioExterno, Integer> {

}
