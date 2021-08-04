package com.webUsuario.Usuarios;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
@Document(collection = "UsuarioInterno")
public class usuarioInterno {

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombreUsuario() {
		return nombreUsuario;
	}
	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}
	public String getApellidoUsuario() {
		return apellidoUsuario;
	}
	public void setApellidoUsuario(String epellidoUsuario) {
		this.apellidoUsuario = epellidoUsuario;
	}
	public String getEstadoUsuario() {
		return estadoUsuario;
	}
	public void setEstadoUsuario(String estadoUsuario) {
		this.estadoUsuario = estadoUsuario;
	}
	public String getInformeUsuario() {
		return informeUsuario;
	}
	public void setInformeUsuario(String informeUsuario) {
		this.informeUsuario = informeUsuario;
	}
	public String getAreaUsuario() {
		return areaUsuario;
	}
	public void setAreaUsuario(String areaUsuario) {
		this.areaUsuario = areaUsuario;
	}
	
	
	
	
	public usuarioInterno(int id, String nombreUsuario, String apellidoUsuario, String estadoUsuario,
			String informeUsuario, String areaUsuario) {
		this.id = id;
		this.nombreUsuario = nombreUsuario;
		this.apellidoUsuario = apellidoUsuario;
		this.estadoUsuario = estadoUsuario;
		this.informeUsuario = informeUsuario;
		this.areaUsuario = areaUsuario;
	}
	
	


	public usuarioInterno() {
	
	}

	
	@Id
	public int 	id;
	public String nombreUsuario;
	public String apellidoUsuario;
	public String estadoUsuario;
	public String informeUsuario;	
	public String areaUsuario;
}
