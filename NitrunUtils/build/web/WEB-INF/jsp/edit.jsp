<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Edit Usuario</title>
        <link rel="stylesheet" href="<c:url value="/src/css/bootstrap.min.css"/>" type="text/css"/>
        <link rel="stylesheet" href="<c:url value="/src/css/fontawesome.min.css"/>"/>
        <!--
        <script defer src="https://use.fontawesome.com/releases/v5.0.4/js/all.js"></script>
        -->
        <link rel="stylesheet" href="<c:url value="/src/css/style.css"/>" type="text/css"/>
        <link rel="stylesheet" href="<c:url value="src/css/fontawesome.min.css"/>"/>        
        <script src="src/js/dropzone.js"></script>            
        <script src="src/js/app.js"></script>        
        <script src="src/js/jquery/jquery-2.1.1.js"></script>        
        <script src="src/js/bootstrap-3.1.1/js/bootstrap.js"></script>        
        <script src="src/js/bootstrap-dialog/js/bootstrap-dialog.min.js"></script>                
    </head>
    <body>
        <div class="container">
            <ol class="breadcrumb">
                <li><a href="<c:url value="/home.htm"/>"> Listado</a></li>
                <li class="active">Editar</li>
            </ol>
            <div class="panel panel-primary">
                <div class="panel-heading">Edite el Usuario</div>
                <div class="panel-body">
                    <form:form method="POST" commandName="usuario">                        
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
                        <!--
                        <div class="dropzone-previews"></div>                        
                        -->
                        </div>
                             <table class="table table-hover table-condensed">
                                <thead>
                                    <tr>
                                        <th width="5%">S.N</th>
                                        <th width="40%">File Name</th>
                                        <th width="20%">File Type</th>
                                        <th width="15%">File Size</th>
                                        <th width="10%">Actions</th>
                                    </tr>
                                </thead>
                                <tbody>
                                    <c:forEach items="${fileList}" var="fileMeta" varStatus="loopCounter">
                                        <tr>
                                            <td><c:out value="${loopCounter.count}" /></td>
                                            <td><c:out value="${dataFile.name}" /></td>
                                            <td><c:out value="${dataFile.type}" /></td>
                                            <td>
                                                <c:out value="${dataFile.size}"/></td>
                                            <td>
                                                <a class="btn btn-primary" href="${pageContext.request.contextPath}/get/${dataFile.id}">
                                                <span class="glyphicon glyphicon-download"></span> Download
                                                </a>
                                            </td>
                                        </tr>
                                    </c:forEach>
                                </tbody>
                            </table>
                        </div>                            
                        <input type="submit" value="Actualizar" class="btn btn-danger"/>
                    </form:form>
                </div>
            </div>
        </div>            
    </body>
</html>