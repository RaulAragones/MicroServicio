package com.webUsuario.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.webUsuario.Repositorios.IUsuarioExterno;
import com.webUsuario.Repositorios.IUsuarioInterno;
import com.webUsuario.Usuarios.usuarioExterno;
import com.webUsuario.Usuarios.usuarioInterno;

@Service
@Transactional
public class usuarioService {
	
	@Autowired
	IUsuarioExterno UE;
	
	@Autowired
	IUsuarioInterno UI;
	
	
	public List<usuarioExterno> consultarUsuarioE(){//Devuelve todos los datos de la tabla UsuarioExterno
		return UE.findAll();
	}
	
	public List<usuarioInterno> consultarUsuarioI(){//Devuelve todos los datos de la tabla UsuarioInterno
		return UI.findAll();
	}

}
