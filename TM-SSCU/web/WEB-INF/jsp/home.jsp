<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <title>Usuarios</title>        
        <spring:url value="/src/img/favicon.ico" var="ico" />                  
        <link href="${ico}" rel="shortcut icon"/>
        <spring:url value="/src/css/bootstrap.min.css" var="bootstrapCss" />          
        <link href="${bootstrapCss}" rel="stylesheet" />                  
        <script defer src="https://use.fontawesome.com/releases/v5.0.4/js/all.js"></script>        
    </head>
    <body>
        <div class="container body-content">
            <nav role="navigation" class="navbar navbar-inverse">                 
                <div class="navbar-header">
                    <p class="form-control-static">
                        <spring:url value="/src/img/Ticketmaster_logo_white.png" var="logo" />
                        <input type="image" name="ctl00$imageTM" id="imageTM" class="pointcursor marginleft30" src="${logo}" style="height:30px;width:200px;" />
                    </p>
                </div>
                <div id="navbarCollapse" class="collapse navbar-collapse"> 
                    <ul class="nav navbar-nav">
                        <li class="active"><a href="#"></a></li>
                        <li><a href="#"></a></li>
                    </ul> 
                    <ul class="nav navbar-nav navbar-right"> 
                        <li><a href="#"><span class="glyphicon glyphicon-user"></span> Login</a></li> 
                    </ul> 
                </div> 
            </nav> 
            <div class="jumbotron">                   
                <div class="container">
                    <div class="row">                
                        <form:form method="POST" commandName="usuarios">
                            <form:errors path="*" element="div" cssClass="alert alert-danger"></form:errors>
                            <h1>Directorio Usuarios</h1>
                            <p>                        
                                <a href="<c:out value="add.htm"/>" class="btn btn-success"><span class="glyphicon glyphicon-plus-sign"></span> Agregar</a>                            
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
                                            <!--
                                            <form:select path="">
                                                <form:options items="${dato.fileMetaList}"></form:options>
                                            </form:select>
                                            -->
                                            
                                            <select style="font-family: 'FontAwesome', Helvetica;">
                                                <c:forEach items="${dato.fileMetaList}" var="datoF" varStatus="status">
                                                    <option>&#xf083;  &#x2212; &#x20ac; ${datoF.fileName} ${status.count} 
                                                        <a href="<c:out value="document.htm?idUsuario=${dato.idUsuario}&fileId=${datoF.idFile}"/>"><span class="glyphicon glyphicon-pencil" aria-hidden="true"></span></a>
                                                    </option>                                            
                                                </c:forEach>
                                            </select>                                                                                                            
                                        </td>                               
                                        <td class="text-center">
                                            <a href="<c:out value="edit.htm?idUsuario=${dato.idUsuario}"/>"><span class="glyphicon glyphicon-pencil" aria-hidden="true"></span> </a>
                                            <a href="<c:out value="delete.htm?idUsuario=${dato.idUsuario}"/>"><span class="glyphicon glyphicon-trash" aria-hidden="true"></span> </a>
                                        </td>
                                    </tr>                            
                                    </c:forEach>                            
                                </tbody>
                            </table>
                        </form:form>
                    </div>            
                </div>
            </div>
        </div> 
    </body>
</html>