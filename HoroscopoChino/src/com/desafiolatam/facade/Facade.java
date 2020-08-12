package com.desafiolatam.facade;

import java.sql.SQLException;

import com.desafiolatam.daos.UsuarioDao;
import com.desafiolatam.modelo.UsuarioDTO;

public class Facade {

	
public boolean registroUsuario(UsuarioDTO dto) throws ClassNotFoundException, SQLException {
	UsuarioDao udao = new UsuarioDao();
	return udao.registroUsuario(dto);
	
}

public boolean loginUsuario(String nombre,String clave) throws ClassNotFoundException, SQLException {
	UsuarioDao ndao = new UsuarioDao();
	 return ndao.loginUsuario(nombre, clave);
}
	

	public UsuarioDTO modificarDatos(String nombreUsuario) throws ClassNotFoundException, SQLException {
		UsuarioDao ndao = new UsuarioDao();
		 return ndao.modificarDatos(nombreUsuario);
	}

	public boolean actualizarUsuario(UsuarioDTO udao) throws ClassNotFoundException, SQLException {
		UsuarioDao ndao = new UsuarioDao();
		return ndao.actualizarUsuario(udao);
	}
	public boolean eliminarDatos(String nombreUsuario) throws ClassNotFoundException, SQLException {
		UsuarioDao ndao = new UsuarioDao();
		 return (boolean) ndao.eliminarDatos(nombreUsuario);
	}

}
