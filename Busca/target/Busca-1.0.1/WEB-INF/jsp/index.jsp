<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <spring:url value="/resources/css/bootstrap.min.css" var="bootstrapCss" />          
        <link href="${bootstrapCss}" rel="stylesheet" />        
        <title>Welcome to Spring Web MVC project</title>
    </head>

    <body>
        <div class="main">
            <div class="container">
                <div class="row">
                    <div class="col-md-12">
                        <div class="table-responsive table-centered">
                            <form class="form-inline" action="#" method="POST">
                                <div class="form-group">
                                    <input onkeyup="load()" class="form-control" type="text" name="id" id="id" placeholder="ID" required="true">                                                               
                                </div>
                            </form>                            
                            <div id="tbl">
                            <table class="table table-hover">
                                <tr class="info">
                                    <th>ID</th>
                                    <th>Nombre</th>
                                    <th>Telefono</th>
                                    <th>Dirección</th>
                                </tr>
                                <c:forEach var="c" items="${contactos}">
                                <tr class="active">
                                    <td>${c.identificacion}</td>
                                    <td>${c.nombre}</td>
                                    <td>${c.telefono}</td>
                                    <td>${c.direccion}</td>                                    
                                </tr>
                                </c:forEach>
                            </table>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <spring:url value="/resources/js/jquery.min.js" var="coreJs" />
        <spring:url value="/resources/js/bootstrap.min.js" var="bootstrapJs" />
        <spring:url value="/resources/js/f.js" var="f" />
       
        <script src="${coreJs}"></script>
        <script src="${bootstrapJs}"></script>
        <script src="${f}"></script>
        
    </body>
</html>
