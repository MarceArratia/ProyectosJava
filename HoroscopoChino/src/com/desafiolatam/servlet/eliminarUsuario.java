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

/**
 * Servlet implementation class ModificacionUsuario
 */
@WebServlet("/eliminarUsuario")
public class eliminarUsuario extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//obtenemos el facade
		Facade facade = new Facade();
		String nombre= request.getParameter("nombreCompleto");
		
		UsuarioDTO udao = new UsuarioDTO();
		try {
			facade.eliminarDatos(nombre);
	request.setAttribute("listaUsuario", udao);
			
			//mandamos el request a la pagina jsp
			request.getRequestDispatcher("ModificacionUsuario.jsp").forward(request, response);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
