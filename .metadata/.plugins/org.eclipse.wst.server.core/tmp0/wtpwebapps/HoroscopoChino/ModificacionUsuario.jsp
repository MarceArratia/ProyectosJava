<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ page import="com.desafiolatam.entidades.UsuarioDTO"%>
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
<title>Modificar Usuario</title>
</head>
<% 
		UsuarioDTO user = new UsuarioDTO();
		if (request.getAttribute("listaUsuario") != null) {
			user = (UsuarioDTO) request.getAttribute("listaUsuario");

		}
%>
<body>
	<div id="container">
		<!--Barra de navegacion -->
		<nav class="navbar navbar-expand-sm bg-dark navbar-dark">
			<ul class="navbar-nav">
				<li class="nav-item"><a class="nav-link" href="RegistroUsuario.jsp">CREAR USUARIO</a></li>
				<li class="nav-item"><a class="nav-link" href="listarUsuarios.jsp">LISTAR USUARIO</a></li>
				<li class="nav-item"><a class="nav-link" href="eliminacionUsuario.jsp">ELIMINACION USUARIO</a></li>
				<li class="nav-item"><a class="nav-link" href="modificacionUsuario.jsp">MODIFICACION USUARIO</a></li>
				<li class="nav-item"><a class="nav-link" href="horoscopo.jsp">CONSULTAR ANIMAL ZODIACAL</a></li>
				<li class="nav-item"><a class="nav-link" href="cerrarSesion">CERRAR SESION</a></li>
			</ul>
		</nav>

		<div id="contenedor" style="margin: 0 auto; border: 1px solid black; width: 600px; margin-top: 50px;">
			<div id="content" style="margin: 5%">
<form action="BuscarUsuario" method="post">
<input type="text" placeholder="Escriba nombre usuario" name="nombre">
<button type="submit" class="btn btn-default">Enviar</button>
</form> 
</div>
</div>
<div class="card">
					<div class="card-body">
					<h5 class="card-title">Usuario encontrado</h5>
						<form action="ModificacionUsuario" method="post">
							<div class="form-group">
								<label for="nombre">Nombre usuario</label> <input type="text"
									class="form-control" name="nombre" value="<%=user.getNombre() %>">
							</div>
							<div class="form-group">
								<label for="password">Clave usuario</label> <input type="text"
									class="form-control" name="password" value="<%=user.getPassword() %>">
							</div>
							<div class="form-group">
								<label for="correo">Correo Electronico</label> <input
									type="email" class="form-control" name="correo" value="<%=user.getMail() %>">
							</div>
							<div class="form-group">
								<label for="fecha">Fecha</label> <input type="number"
									class="form-control" name="fecha" value="<%=user.getFecha() %>">
							</div>
							<div class="form-group">
								<label for="usuario">Usuario</label> <input type="text"
									class="form-control" name="usuario" value="<%=user.getNickname() %>">
							</div>

							<button type="submit" class="btn btn-primary">Modificar</button>
						</form>
					</div>
				</div>
				</div>
</body>
</html>