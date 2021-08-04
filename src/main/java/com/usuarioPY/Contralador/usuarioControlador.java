package com.usuarioPY.Contralador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.usuarioPY.Repositorio.IControladorMGDB;
import com.usuarioPY.Usuario.usuario;

@RestController
@RequestMapping(path = "/UsuarioPY/mongodb")
public class usuarioControlador {
	
	@Autowired
	private IControladorMGDB icontrolMGDB;
	
	@PostMapping("/guardarUsuario")
	 public String guardarUsuarioExterno(@RequestBody usuario usuario) {
		icontrolMGDB.save(usuario);
		return "ID Ingresado: "+usuario.getId()+" - Nombre Ingresado: "+usuario.getNombreUsuario();
	}
	
	@GetMapping("/ConsultarUsuario")
	public List<usuario> consultarUsuario(){
		
		return icontrolMGDB.findAll();
	}
}
