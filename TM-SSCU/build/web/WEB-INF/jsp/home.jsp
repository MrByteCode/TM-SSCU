<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <title>Usuarios</title>        
        <link rel="stylesheet" href="<c:url value="/src/css/bootstrap.min.css"/>" type="text/css"/>    
        <link rel="stylesheet" href="/src/css/font-awesome.min.css"/>
        <script defer src="https://use.fontawesome.com/releases/v5.0.4/js/all.js"></script>        
        <link rel="stylesheet" href="<c:url value="src/css/font-awesome.min.css"/>"/>       
        <script src="<c:url value="/src/js/funciones.js"/>"></script>
    </head>
    <body>
        <div class="container">
            <div class="row">                
                <form:form method="POST" commandName="usuarios">
                    <form:errors path="*" element="div" cssClass="alert alert-danger"></form:errors>
                    <h1>Directorio Usuarios</h1>
                    <p>                        
                        <a href="<c:out value="add.htm"/>" class="btn btn-success"><span class="fa fa-plus"></span> Agregar</a>                            
                    </p>
                    <table class="table table-bordered table-striped table-hover table-sm table-responsive-md" style="width:auto;" cellspacing="0" width="100%">
                        <thead>
                            <tr>
                                <th>ID</th>
                                <th>NOMBRE</th>
                                <th>CORREO</th>
                                <th>TELÉFONO</th>
                                <th>RESPONSIVA</th>
                                <th>ACCIONES</th>
                            </tr>
                        </thead>
                        <tbody>
                            <c:forEach items="${usuarios}" var="dato">
                            <tr>
                                <td><c:out value="${dato.idUsuario}" /></td>
                                <td><c:out value="${dato.nombre}" /></td>
                                <td><c:out value="${dato.correo}" /></td>
                                <td><c:out value="${dato.telefono}" /></td>   
                                <td class="text-center">                                                                        
                                    <form:select path="">
                                        <form:options items="${dato.fileMetaList}"></form:options>
                                    </form:select>
                                    
                                    <select style="font-family: 'FontAwesome', Helvetica;">
                                        <c:forEach items="${dato.fileMetaList}" var="datoF" varStatus="status">
                                            <option>&#xf083; ${datoF.fileName} ${status.count}</option>
                                        </c:forEach>
                                    </select>                                                                                                            
                                </td>                               
                                <td class="text-center">
                                    <a href="<c:out value="edit.htm?idUsuario=${dato.idUsuario}"/>"><span class="fa fa-pencil-alt" aria-hidden="true"></span> </a>
                                    <a href="<c:out value="delete.htm?idUsuario=${dato.idUsuario}"/>"><span class="fa fa-trash-alt" aria-hidden="true"></span> </a>
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