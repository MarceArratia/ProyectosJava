<%@page language="java" contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Area Privada</title>
<link
href="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
rel="stylesheet" id="bootstrap-css">
<link href="css/estilos.css" rel="stylesheet">
<script
src="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js">
</script>
<script
src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js">
</script>
</head>
<body>
<%
HttpSession misesion = request.getSession();
String nombre;
nombre = (String)misesion.getAttribute("Nombre");
%>
<nav class="navbar navbar-expand navbar-dar bg-primary">
<a href="#menu-toggler" id="menu-toggle" class="navbar-brand"><span
class="navbar-toggler-icon"></span></a>
<button class="navbar-toggler" type="button" data-toggle="collapse"
data-target="#navbarsExample02" aria-controls="navbarExample02"
aria-expanded="false" aria-label="Toggle navigation">
<span class="navbar-toggler-icon"></span>
</button>
<div class="collapse navbar-collapse" id="navbarsExample02">
<ul class="navbar-nav mr-auto">
<li class="nav-item active"><a class="nav-link" href="#">Bienvenido: <%= nombre %><span class="sr-only">(current)</span></a></li>
<li class="nav-item active"><a class="nav-link" href="logout">Cerrar Sesion<span class="sr-only">(current)</span>
</a></li>
</ul>
<form class="form-inline my-2 my-md-0"></form>
</div>
</nav>
<div id="wrapper" class="toggled">
<!-- Page Content -->
<div id="page-content-wrapper">
<div class="container-fluid">
<h1>Area Privada</h1>
<p>Si estás viendo esta página, es porque estás logueado correctamente y el nombre de usuario está guardado en la sesión.</p>
</div>
</div>
</div>
<script src="js/jquery.min.js"></script>
<script src="js/bootstrap.bundle.min.js"></script>
<script>
$(function() {
$("#menu-toggle").click(function(e) {
e.preventDefault();
$("#wrapper").toggleClass("toggled");
});
$(window).resize(function(e) {
if ($(window).width() <= 768) {
$("#wrapper").removeClass("toggled");
} else {
$("#wrapper").addClass("toggled");
}
});
});
</script>
</body>
</html>