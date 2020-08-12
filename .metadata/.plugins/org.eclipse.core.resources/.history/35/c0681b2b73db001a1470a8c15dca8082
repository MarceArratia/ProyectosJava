<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="com.desafiolatam.daos.UsuarioDao"%>
<%@ page import="java.util.List"%>
<%@ page import="java.util.ArrayList"%>
<!DOCTYPE html>
<html>
<head>

<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">
<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"
	integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN"
	crossorigin="anonymous"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js"
	integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q"
	crossorigin="anonymous"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"
	integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl"
	crossorigin="anonymous"></script>

<meta charset="ISO-8859-1">
<title>Listar Usuarios</title>
</head>
<% 
		HttpSession sesion = request.getSession();
		if(sesion.getAttribute("nombre")==null){
			request.getRequestDispatcher("login.jsp").forward(request, response);
		}
%>
<body>
	<div id="container">
		<!--Barra de navegacion -->
		<nav class="navbar navbar-expand-sm bg-dark navbar-dark">
			<ul class="navbar-nav">
				<li class="nav-item"><a class="nav-link" href="creacionUsuario.jsp">CREAR USUARIO</a></li>
				<li class="nav-item"><a class="nav-link" href="listarUsuarios.jsp">LISTAR USUARIO</a></li>
				<li class="nav-item"><a class="nav-link" href="eliminacionUsuario.jsp">ELIMINACION USUARIO</a></li>
				<li class="nav-item"><a class="nav-link" href="modificacionUsuario.jsp">MODIFICACION USUARIO</a></li>
				<li class="nav-item"><a class="nav-link" href="horoscopo.jsp">CONSULTAR ANIMAL ZODIACAL</a></li>
				<li class="nav-item"><a class="nav-link" href="cerrarSesion">CERRAR SESION</a></li>
			</ul>
		</nav>

		<div id="contenedor"
			style="margin: 0 auto; border: 1px solid black; width: 800px; margin-top: 50px;">
			<div id="content" style="margin: 5%">

				<div class="card">
					<div class="card-body">
						<h5 class="card-title">Busqueda de usuarios</h5>
						<form action="listar" method="post">
							<div class="form-group">
								<label for="nombre">Nombre Completo</label> <input type="text"
									class="form-control" name="nombre"
									placeholder="ingrese nombre">
							</div>
							<button type="submit" class="btn btn-primary">Buscar</button>
						</form>
					</div>
				</div>
				<br>
				<div class="card">
					<div class="card-body">
						<h5 class="card-title">Usuarios encontrados</h5>
						<table class="table table-bordered" id="dataTable"
											width="100%" cellspacing="0">
											<thead>
												<tr>
													<th scope="col">Nombre Completo</th>
													<th scope="col">Direccion</th>
													<th scope="col">Edad</th>
													<th scope="col">Profesión</th>
												</tr>
											</thead>
											<tbody>
												<%
													List<Usuario> listaUsuario = new ArrayList<>();
													if (request.getAttribute("listaUsuarios") != null) {
														List<Usuario> usuario;
														listaUsuario = (List) request.getAttribute("listaUsuarios");

														for (Usuario us : listaUsuario) {
												%>
												<tr>
													<td><%=us.getNombreCompleto()%></td>
													<td><%=us.getDireccionCorreo()%></td>
													<td><%=us.getEdad()%></td>
													<td><%=us.getProfesion()%></td>
												</tr>
												<%
													}
													}
												%>
											</tbody>
						</table>
					
					</div>
				</div>
			</div>
		</div>
	</div>
</body>
</html>