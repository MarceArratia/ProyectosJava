package com.desafiolatam.servlet;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.desafiolatam.facade.Facade;
import com.desafiolatam.modelo.UsuarioDTO;

@WebServlet("/ModificacionUsuario")
public class ModificacionUsuario extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//obtenemos el facade
		Facade facade = new Facade();
		
		
		UsuarioDTO udao = new UsuarioDTO();
	
			udao.setNombre(request.getParameter("nombre"));
			udao.setPassword(request.getParameter("password"));
			udao.setNickname(request.getParameter("usuario"));
			udao.setMail(request.getParameter("correo"));
			udao.setFecha(Integer.parseInt(request.getParameter("fecha"))) ;
			try {
				boolean respuesta = facade.actualizarUsuario(udao);
			} catch (ClassNotFoundException | SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			

			
			//mandamos el request a la pagina jsp
			request.getRequestDispatcher("ModificacionUsuario.jsp").forward(request, response);
		
		
	}

}