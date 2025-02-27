<%@page import="model.TblProveedorcl2"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="java.util.*" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Listado de Proveedores</title>
</head>
<body bgcolor="#ffb233
">
<h1 align="center">Listado de Proveedores</h1>
<h2 align="center">
    <a href="ControladorProveedor?accion=Registrar" style="text-decoration: none">Registrar Proveedor</a>
</h2>
<table align="center" border="2">
    <tr>
        <td>C�digo</td>
        <td>Nombre</td>
        <td>Raz�n Social</td>
        <td>RUC</td>
        <td>Email</td>
        <td>Fecha de Ingreso</td>
        <td colspan="2" align="center">Acciones</td>
    </tr>
    <%
    List<TblProveedorcl2> listadoProveedores = (List<TblProveedorcl2>) request.getAttribute("listado");

    if (listadoProveedores != null) {

        for (TblProveedorcl2 prov : listadoProveedores) {
    %>
    <tr>
        <td><%=prov.getIdproveedorcl2()%></td>
        <td><%=prov.getNomproveecl2()%></td>
        <td><%=prov.getRsocialproveecl2()%></td>
        <td><%=prov.getRucproveecl2()%></td>
        <td><%=prov.getEmailproveecl2()%></td>
        <td><%=prov.getFeingproveecl2()%></td>
        <td>
            <a href="ControladorProveedor?accion=Modificar&cod=<%=prov.getIdproveedorcl2()%>"
               style="text-decoration:none">Actualizar</a>
        </td>
        <td>
            <a href="ControladorProveedor?accion=Eliminar&cod=<%=prov.getIdproveedorcl2()%>"
               style="text-decoration:none">Eliminar</a>
        </td>
    </tr>
    <%
        } 
    } 
    %>
</table>
</body>
</html>