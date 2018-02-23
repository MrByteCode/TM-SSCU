<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta charset=UTF-8">
        <title>Ejemplo de Vista Spring</title>        
        <!--
        <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/estilos.css"/>
        -->
        <link rel="stylesheet" href="<c:url value="/resources/css/estilos.css"/>"/>
        <script src="<c:url value="/resources/js/funciones.js"/>"></script>
    </head>
    <body>
        <h1 class="clase">Recuperacion de parametros</h1>
        <hr>
        <a href="javascript:void(0)" onclick="saludo();">Haz clic</a>
        <a href="<c:url value="/otro.htm" />"> Ir a Otro</a>
        <hr>
        <img src="<c:url value="/resources/images/carro.jpeg"/>"/>
        <ul>
            <li>ID= <c:out value="${id}" /></li>
            <li>ID= ${id2}</li>
        </ul>
    </body>
</html>
