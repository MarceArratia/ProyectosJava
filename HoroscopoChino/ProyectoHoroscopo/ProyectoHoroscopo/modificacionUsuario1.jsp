<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@ page import="com.desafiolatam.modelo.Usuario"%>
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
<title>Insert title here</title>
</head>
<% 
		HttpSession sesion = request.getSession();
		if(sesion.getAttribute("nombre")==null){
			request.getRequestDispatcher("login.jsp").forward(request, response);
		}
		
		Usuario user = new Usuario();
		if (request.getAttribute("listaUsuarios") != null) {
			user = (Usuario) request.getAttribute("listaUsuarios");

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
			style="margin: 0 auto; border: 1px solid black; width: 600px; margin-top: 50px;">
			<div id="content" style="margin: 5%">

				<div class="card">
					<div class="card-body">
					<h5 class="card-title">Buscar usuario a modificar</h5>
						<form action="listarMod" method="post">
							<div class="form-group">
								<label for="nombre">Nombre Completo</label> <input type="text"
									class="form-control" name="nombre"
									placeholder="ingrese nombre">
							</div>
							<button type="submit" class="btn btn-primary" name="modificacion" value="mod" >Buscar</button>
						</form>
					</div>
				</div>
				<br>
				<div class="card">
					<div class="card-body">
					<h5 class="card-title">Usuario encontrado</h5>
						<form action="modificacion" method="post">
							<div class="form-group">
								<label for="nombre">Id Usuario</label> <input type="text"
									class="form-control" name="idUsuario" value="<%=user.getIdUsuario()%>">
							</div>
							<div class="form-group">
								<label for="nombre">Nombre Completo</label> <input type="text"
									class="form-control" name="nombreCompleto" value="<%=user.getNombreCompleto()%>">
							</div>
							<div class="form-group">
								<label for="correo">Correo Electronico</label> <input
									type="email" class="form-control" name="correo" value="<%=user.getDireccionCorreo()%>">
							</div>
							<div class="form-group">
								<label for="edad">Edad</label> <input type="number"
									class="form-control" name="edad" value="<%=user.getEdad()%>">
							</div>
							<div class="form-group">
								<label for="profesion">Profesion</label> <input type="text"
									class="form-control" name="profesion" value="<%=user.getProfesion()%>">
							</div>

							<button type="submit" class="btn btn-primary">Modificar</button>
						</form>
					</div>
				</div>
			</div>
		</div>
	</div>
</body>
</html>