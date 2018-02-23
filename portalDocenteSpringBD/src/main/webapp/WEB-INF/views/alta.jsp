<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
<link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/estilos.css" type="text/css" />

	<title>Portal Docente Spring</title>
</head>
<body>
<%@include file="cabecera.jsp" %>
<%@include file="menuLateral.jsp" %>
<div class="cuerpo">
<form name="form1" method="post" action="alta" >
<table>
<tr>
<td>
Usuario:
<input type="text" name="userr" id="usser" />
</td>
</tr>
<tr>
<td>
Password:
<input type="password" name="contra" id="contra" />
</td>
</tr>
<tr>
<td>
Escoge el tipo:
<select name="rol" id="rol">
<option value="alumno">Alumno</option>
<option value="profesor">Profesor</option>

</select> 
</td>
</tr>

<tr>
<td>
<input type="submit" value="Enviar" /> 
</td>
</tr>
</table>


</form>


</div>
</body>
</html>