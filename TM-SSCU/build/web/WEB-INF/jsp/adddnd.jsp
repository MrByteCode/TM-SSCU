<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Create</title>
        <link rel="stylesheet" href="<c:url value="/src/css/bootstrap.min.css"/>" type="text/css"/>
        <link rel="stylesheet" href="<c:url value="/src/css/fontawesome.min.css"/>"/>
        <script defer src="https://use.fontawesome.com/releases/v5.0.4/js/all.js"></script> 
        <link href="/src/css/dropzone.css" type="text/css" rel="stylesheet" />
        <script src="/src/js/myuploadfunction.js"></script>        
        <script src="/src/js/jquery.1.9.1.min.js"></script>
        <script src="/src/js/vendor/jquery.ui.widget.js"></script>
        <script src="/src/js/jquery.iframe-transport.js"></script>
        <script src="/src/js/jquery.fileupload.js"></script>        
    </head>
    <body>
        <div class="container">
            <ol class="breadcrumb">
                <li><a href="<c:url value="/home.htm"/>"> Listado</a></li>
                <li class="active">Agregar</li>
            </ol>
            <div class="panel panel-primary">
                <div class="panel-heading">Agregar Usuario</div>
                <div class="panel-body">                    
                    <form:form method="POST" commandName="usuario" enctype='multipart/form-data'>
                    <!--<h1>Completa el formulario:</h1>-->
                    <form:errors path="*" element="div" cssClass="alert alert-danger"></form:errors>
                    <div style="width:500px;padding:20px">
                        <input id="fileupload" type="file" name="files[]" data-url="upload" multiple>
                        <div id="dropzone">Drop files here</div>
                        <div id="progress">
                            <div style="width: 0%;"></div>
                        </div>
                        <table id="uploaded-files">
                            <tr>
                                <th>File Name</th>
                                <th>File Size</th>
                                <th>File Type</th>
                                <th>Download</th>
                            </tr>
                        </table>
                    </div>                                                   
                    <hr/>
                    <input type="submit" value="Enviar" class="btn btn-danger"/>
                    </form:form>
                </div>
            </div>
        </div>            
    </body>
</html>