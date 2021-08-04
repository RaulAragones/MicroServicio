package com.usuarioMS.Controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.usuarioMS.Servicio.*;
import com.usuarioMS.Usuarios.UsuarioExterno;
import com.usuarioMS.Usuarios.UsuarioInterno;

@RestController
@RequestMapping(path = "/usuarioMS/mongodb/pruebas")
public class Controlador {
	@Autowired
	serviceUsuario Usuarioservice;
	
	 
	
	 
	@PostMapping(value = "/guardarUserExterno")
	 public @ResponseBody UsuarioExterno guardarUserExterno(@RequestBody UsuarioExterno UserExt) {
		
		return Usuarioservice.guardarUsuarioExterno(UserExt);
	}
	 
	 @PostMapping(value = "/guardarUserInterno")
	 public @ResponseBody UsuarioInterno guardarUserInterno(@RequestBody UsuarioInterno UserInter) {
		
		return Usuarioservice.guardarUsuarioInterno(UserInter);
	}
	
	 @GetMapping("/Usuarios/externo")
	 public @ResponseBody List<UsuarioExterno> consultarUsuarioE() {
		 return Usuarioservice.consultarTodosUE();
		 
	 }
	 
	 @GetMapping("/Usuarios/interno")
	 public @ResponseBody List<UsuarioInterno> consultarUsuarioI() {
		 
		
			 return Usuarioservice.consultarTodosUI();
		
	 } 
}
