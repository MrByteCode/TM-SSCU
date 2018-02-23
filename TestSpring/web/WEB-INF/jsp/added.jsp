<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Create</title>
        <link rel="stylesheet" href="<c:url value="/resources/css/bootstrap.min.css"/>" type="text/css"/>
    </head>
    <body>
        <div class="container">
            <ol class="breadcrumb">
                <li><a href="<c:url value="/add.htm"/>"> Listado</a></li>
                <li class="active">Agregar</li>
            </ol>
            <div class="panel panel-primary">
                <div class="panel-heading">Agregar Usuario</div>
                <div class="panel-body">
                    <form:form method="POST" commandName="usuario">
                        <h1>Completa el formulario:</h1>
                        <form:errors path="*" element="div" cssClass="alert alert-danger"></form:errors>
                            <p>                        
                                <form:label path="nombre">Nombre</form:label>
                                <form:input path="nombre" cssClass="form-control"/>                                    
                            </p>
                            <p>                        
                                <form:label path="correo">Correo</form:label>
                                <form:input path="correo" cssClass="form-control"/>
                            </p>
                            <p>                        
                                <form:label path="telefono">Telefono</form:label>
                                <form:input path="telefono" cssClass="form-control"/>                                    
                            </p>
                            <hr/>
                            <input type="submit" value="Enviar" class="btn btn-danger"/>
                    </form:form>
                </div>
            </div>
        </div>            
    </body>
</html>
