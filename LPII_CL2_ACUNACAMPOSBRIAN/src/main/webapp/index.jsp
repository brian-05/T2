<html>
<body bgcolor="#3377ff">
<h2 align="center">Iniciar Sesion</h2>


<%
// Mostrar mensaje de error si el login falla
String error = request.getParameter("error");
if (error != null && error.equals("1")) {
    out.println("<p align='center' style='color:red;'>Usuario o contraseña incorrectos.</p>");
}
%>

<table border="2" align="center">
<form method="post" action="ControladorLogueo">
<tr>
<td>Usuario</td>
<td><input type="text" name="usuario"></td>
</tr>
<tr>
<td>Password</td>
<td><input type="password" name="password"></td>
</tr>
<tr>
<td colspan="2" align="center"><input type="submit" value="ingresar al sistema"></td>
</tr>
</form>
</table>
</body>
</html>