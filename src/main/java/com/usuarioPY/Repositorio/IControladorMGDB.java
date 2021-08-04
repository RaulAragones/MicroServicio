package com.usuarioPY.Repositorio;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.usuarioPY.Usuario.usuario;

public interface IControladorMGDB extends MongoRepository<usuario, Integer>{

}
