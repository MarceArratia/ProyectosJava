<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="x" uri="http://java.sun.com/jsp/jstl/xml" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Respuestos automotríces</title>
<style>
#texto{
margin:0 auto;
width:50%;
height:auto;
border:solid 1px black;
padding-left:30px;
}
#cabecera{
margin:0 auto;
width:50%;
border:solid 1px black;
padding-left:30px;
background-color:black;
color:white;
text-align: center;
}
#header{
width:auto;
height:100px;
}
</style>
<body>
<%
HttpSession misesion = request.getSession();
String nombre;
nombre = (String)misesion.getAttribute("Nombre");
%>
<div id="cabecera">
<h1>Bienvenido: <%= nombre %></h1>
<img id="header" src="https://www.repricerexpress.com/wp-content/uploads/2019/10/sell-auto-parts-amazon.jpg"
id="icon" alt="User Icon" />
<h3>FORMULARIO DE ENVIO</h3>
</div>
<div id="texto">
<form action="http://localhost:9090/GeneradorFactura/inicio" method="get">

        <div class="row">
            <div class="col-md-1">
                <label>Nombre</label>
            </div>
            <div class="col-md-3">
                <input name="nombre" type="text">
            </div>
        </div>
        <div class="row">
            <div class="col-md-1">
                <label>Empresa</label>
            </div>
            <div class="col-md-3">
                <input name="empresa" type="text">
            </div>
        </div>
        <div class="row">
            <div class="col-md-1">
                <label>Rut</label>
            </div>
            <div class="col-md-3">
                <input name="rut" type="text">
            </div>
        </div>
        <div class="row">
            <div class="col-md-1">
                <label>Dirección</label>
            </div>
            <div class="col-md-3">
                <input name="direccion" type="text">
            </div>
        </div>
        <div class="row">
            <div class="col-md-1">
                <label>Ciudad</label>
            </div>
            <div class="col-md-3">
                <input name="ciudad" type="text">
            </div>
        </div>
        <div class="row">
            <div class="col-md-1">
                <label>País</label>
            </div>
            <div class="col-md-3">
                <input name="pais" type="text">
            </div>
        </div>
        <div class="row">
            <div class="col-md-8">
<table name="tablaRepuestos">
    <th>Item</th>
    <th>Descripción</th>
    <th>Valor unidad</th>
    <th>Cantidad</th>
    <tbody>
        <tr >  
            <td>R123</td>
            <td>Tuerca 1/8</td>
            <td><input name="valorProducto1" type="text" value="300"></td>
            <td><input name="cantidadProducto1" type="number"></td>
        </tr>
        <tr>
            <td>R321</td>
            <td>Golilla 1/8</td>
            <td><input name="valorProducto2" type="text" value="200"></td>
            <td><input name="cantidadProducto2" type="number"></td>
        </tr>
        <tr>
            <td>R345</td>
            <td>Perno 1/8</td>
            <td><input name="valorProducto3" type="text" value="400"></td>
            <td><input name="cantidadProducto3" type="number"></td>
        </tr>
        <tr>
            <td>R678</td>
            <td>Bomba</td>
            <td><input name="valorProducto4" type="text" value="2000"></td>
            <td><input name="cantidadProducto4" type="number"></td>
        </tr>
    </tbody>
</table>
</div>
</div>
<div class="row">
    <div class="col-md-1">
        <input type="submit">
    </div>
    <div class="col-md-3">
        <input type="reset">
    </div>
        </div>
</form>
</div>
</body>
</html>