<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Actualizar Proveedor</title>
</head>
<body bgcolor="#c5dec9">
<h1 align="center">
Actualizar Proveedor...
</h1>

<form method="post" action="ControladorProveedor">
<table align="center" border="2">

<%
String codigo = request.getAttribute("codigo").toString();
String nombre = (request.getAttribute("nombre") != null) ? request.getAttribute("nombre").toString() : "";
String razonsocial = (request.getAttribute("razonsocial") != null) ? request.getAttribute("razonsocial").toString() : "";
String ruc = (request.getAttribute("ruc") != null) ? request.getAttribute("ruc").toString() : "";
String email = (request.getAttribute("email") != null) ? request.getAttribute("email").toString() : "";
String fecha = (request.getAttribute("fecha") != null) ? request.getAttribute("fecha").toString() : "";
%>

<input type="hidden" name="codigo" value="<%=codigo%>">
<tr>
    <td>Nombre</td>
    <td><input type="text" name="nombre" value="<%=nombre%>"></td>
</tr>
<tr>
    <td>Razón Social</td>
    <td><input type="text" name="razonsocial" value="<%=razonsocial%>"></td>
</tr>
<tr>
    <td>RUC</td>
    <td><input type="text" name="ruc" value="<%=ruc%>"></td>
</tr>
<tr>
    <td>Email</td>
    <td><input type="text" name="email" value="<%=email%>"></td>
</tr>
<tr>
    <td>Fecha de Ingreso</td>
    <td><input type="date" name="fecha" value="<%=fecha%>"></td>
</tr>
<tr>
    <td colspan="2" align="center">
        <input type="submit" value="Actualizar">
    </td>
</tr>

</table>
</form>
</body>
</html>