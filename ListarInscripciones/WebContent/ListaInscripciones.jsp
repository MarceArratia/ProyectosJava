<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ page import="com.desafiolatam.modelo.InscripcionDTO" %>
<%@ page import="java.util.List"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.0/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>	
<title>Lista inscripciones</title>
</head>
<%
List<InscripcionDTO>  inscripcion;

// capturamos informacion que viene desde el request
inscripcion = (List<InscripcionDTO>)request.getAttribute("inscripcion");
%>
<body>
<nav class="navbar navbar-default">
<div class="container-fluid">
<div class="navbar-header">
<a class="navbar-brand" href="#">Mantenedor De Cursos</a>
</div>
<ul class="nav navbar-nav">
<li><a href="preInscripcion">Inscribir Cursos</a></li>
<li><a href="preListarInscripciones">Lista Cursos</a></li>
</ul>
</div>
</nav>
<div class="container">
<table class="table">
<th>Id</th>
<th>Nombre</th>
<th>Tel�fono</th>
<th>C�digo Curso</th>
<th>Forma de pago</th>
<%
for(InscripcionDTO dto: inscripcion){
	
%>
<tr class="table-active"><%= " " %>
<td class="bg-success"><%=dto.getIdInsc() %></td>
<td class="bg-success"><%=dto.getNombre() %></td>
<td class="bg-success"><%=dto.getCelular() %></td>
<td class="bg-success"><%=dto.getIdCurso() %></td>
<td class="bg-success"><%=dto.getIdFormaDePago() %></td>
</tr>
<%
}
%>
</table>
</div>
</body>
</html>