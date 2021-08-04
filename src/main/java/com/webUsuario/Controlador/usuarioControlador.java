package com.webUsuario.Controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;
import com.webUsuario.Services.usuarioService;
import com.webUsuario.Usuarios.usuarioExterno;
import com.webUsuario.Usuarios.usuarioInterno;

@RestController
@RequestMapping(path = "/ConsultasUsuarios")
@CrossOrigin(origins = "http://localhost:4200")
public class usuarioControlador {
	@Autowired
	usuarioService userServices;
	
	
	
	@GetMapping("/usuarioExterno")
	public ResponseEntity<List<usuarioExterno>> listausuarioExterno(){
		List<usuarioExterno> listExterno = userServices.consultarUsuarioE();
		return new ResponseEntity<List<usuarioExterno>>(listExterno,HttpStatus.OK);
	}
	
	@GetMapping("/usuarioInterno")
	public ResponseEntity<List<usuarioInterno>> listaUsuariosInternos(){
		List<usuarioInterno> list = userServices.consultarUsuarioI(); 
		return new ResponseEntity<List<usuarioInterno>>(list,HttpStatus.OK);
	}
}
