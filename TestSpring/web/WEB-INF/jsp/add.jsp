<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Usuarios</title>        
        <link rel="stylesheet" href="<c:url value="/resources/css/bootstrap.min.css"/>" type="text/css"/>        
        <!--
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.3/css/bootstrap.min.css"/>                 
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-alpha.6/css/bootstrap.min.css"/>        
        -->
    </head>
    <body>
        <div class="container">
            <div class="row">                
                <form:form method="POST" commandName="personaOK">
                    <form:errors path="*" element="div" cssClass="alert alert-danger"></form:errors>
                    <h1>Directorio Usuarios</h1>
                    <p>                        
                        <a href="<c:out value="added.htm"/>" class="btn btn-success"><span class="glyphicon glyphicon-plus"></span> Agregar</a>                            
                    </p>
                    <table class="table table-bordered table-striped table-hover">
                        <thead>
                            <tr>
                                <th>ID</th>
                                <th>NOMBRE</th>
                                <th>CORREO</th>
                                <th>TELÉFONO</th>
                                <th>ACCIONES</th>
                            </tr>
                        </thead>
                        <tbody>
                        <c:forEach items="${datos}" var="dato">
                            <tr>
                                <td><c:out value="${dato.id}" /></td>
                                <td><c:out value="${dato.nombre}" /></td>
                                <td><c:out value="${dato.correo}" /></td>
                                <td><c:out value="${dato.telefono}" /></td>
                                <td>
                                    <a href="<c:out value="edit.htm?id=${dato.id}"/>"><span class="glyphicon glyphicon-pencil" aria-hidden="true"></span> </a>
                                    <a href="<c:out value="delete.htm?id=${dato.id}"/>"><span class="glyphicon glyphicon-trash" aria-hidden="true"></span> </a>
                                </td>
                            </tr>                            
                        </c:forEach>                            
                        </tbody>
                    </table>
                </form:form>
            </div>            
        </div>
    </body>
</html>
