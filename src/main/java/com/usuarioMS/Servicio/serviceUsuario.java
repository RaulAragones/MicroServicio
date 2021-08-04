package com.usuarioMS.Servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.usuarioMS.Repositorio.RepositorioUsuarioExternoMGDB;
import com.usuarioMS.Repositorio.RepositorioUsuarioInternoMGDB;
import com.usuarioMS.Usuarios.UsuarioExterno;
import com.usuarioMS.Usuarios.UsuarioInterno;

//@Service
@Component
public class serviceUsuario {
	@Autowired
	RepositorioUsuarioExternoMGDB RepoUsuarioExternoMGDB;
	
	@Autowired
	RepositorioUsuarioInternoMGDB RepoUsuarioInternoMGDB;
	
	public UsuarioExterno guardarUsuarioExterno(UsuarioExterno UserExt) {
		return RepoUsuarioExternoMGDB.save(UserExt);
	}
	
	public UsuarioInterno guardarUsuarioInterno(UsuarioInterno UserInt) {
		return RepoUsuarioInternoMGDB.save(UserInt);
	}
	
	public List<UsuarioExterno>consultarTodosUE() {
		return RepoUsuarioExternoMGDB.findAll();
	}
	
	public List<UsuarioInterno>consultarTodosUI() {
		return RepoUsuarioInternoMGDB.findAll();
	}
}
