
    <%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="x" uri="http://java.sun.com/jsp/jstl/xml" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
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
background-color:grey;
color:white;
text-align: center;
margin-top:5%;
border:solid 1px white;
}
</style>
</head>
<body>
<div id="cabecera">
<p>Nombre: <c:out value="${param.nombre}"/></p>
<p>Empresa: <c:out value="${param.empresa}"/></p>
<p>Rut: <c:out value="${param.rut}"/></p>
<p>Dirección: <c:out value="${param.direccion}"/></p>
<p>Ciudad: <c:out value="${param.ciudad}"/></p>
<p>País: <c:out value="${param.pais}"/></p>

<table name="tablaRepuestos">
    <th>Item</th>
    <th>Descripción</th>
    <th>Valor unidad</th>
    <th>Cantidad</th>
    <th>Valor total</th>
    <th>Descuento 10%</th>
    <th>Valor final</th>
    <tbody>
        <tr >  
            <td>R123</td>
            <td>Tuerca 1/8</td>
            <td><c:out value="${param.valor1}"/></td>
            <td><c:out value="${param.cantidad1}"/></td>
            <td><%int total=0;%>
    <% total=Integer.parseInt(request.getParameter("valor1"))*Integer.parseInt(request.getParameter("cantidad1")) ;%>
          <%= total%>
            </td>
          <td><%= total*0.1%></td>
            <td><%= total-((total/100)*10) %></td>
        </tr>
        <tr>
            <td>R321</td>
            <td>Golilla 1/8</td>
            <td><c:out value="${param.valor2}"/></td>
            <td><c:out value="${param.cantidad2}"/></td>
            <td><%int total2=0;%>
    <% total2=Integer.parseInt(request.getParameter("valor2"))*Integer.parseInt(request.getParameter("cantidad2")) ;%>
          <%= total2%>
            </td>
          <td><%= total2*0.1%></td>
            <td><%= total2-((total2/100)*10) %></td>
        </tr>
        <tr>
            <td>R345</td>
            <td>Perno 1/8</td>
           <td><c:out value="${param.valor3}"/></td>
            <td><c:out value="${param.cantidad3}"/></td>
            <td><%int total3=0;%>
    <% total3=Integer.parseInt(request.getParameter("valor3"))*Integer.parseInt(request.getParameter("cantidad3")) ;%>
          <%= total3%>
            </td>
          <td><%= total3*0.1%></td>
            <td><%= total3-((total3/100)*10) %></td>
        </tr>
        <tr>
            <td>R678</td>
            <td>Bomba</td>
           <td><c:out value="${param.valor4}"/></td>
            <td><c:out value="${param.cantidad4}"/></td>
            <td><%int total4=0;%>
    <% total4=Integer.parseInt(request.getParameter("valor4"))*Integer.parseInt(request.getParameter("cantidad4")) ;%>
          <%= total4%>
            </td>
          <td><%= total4*0.1%></td>
            <td><%= total4-((total4/100)*10) %></td>
        </tr>
    </tbody>
</table>
</div>
</body>
</html>