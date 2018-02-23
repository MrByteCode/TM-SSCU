<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="form" uri="http://www.springframework.org/tags"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/estilos.css" type="text/css" />

	<title>Portal Docente Spring</title>
</head>
<body>
<%@include file="cabecera.jsp" %>
<%@include file="menuLateral.jsp" %>
<div class="cuerpo">
<form method="post" action="subirArchivo" enctype="multipart/form-data" commandName="fileFormBean">
    <table>
        <tr>
           <td>Selecciona fichero: </td>
           <td><input type="file" name="fichero"></td>
        </tr>
        <tr>
     
        </tr>
        <tr><td colspan="2" align="center">
        <input type="submit" value="Subir fichero"></td>
        </tr>
     </table>
</form>
</div>
</body>
</html>