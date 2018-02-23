<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/estilos.css" type="text/css" />

	<title>Portal Docente Spring</title>
</head>
<body>
<%@include file="../cabecera.jsp" %>
<%@include file="../menuLateral.jsp" %>
<div class="cuerpo">

<form name="form1" method="post" action="/portalDocenteSpringBD/profesor/addE" >
<table>
<tr>
<td>Nombre del enlace a añadir: <input type="text" id="enlace" name="enlace"  />    </td>

</tr>
<tr>
<td>
<input type="submit" name="enviar" value="enviar" />
</td>
</tr>
</table>

</form>
</div>
</body>
</html>