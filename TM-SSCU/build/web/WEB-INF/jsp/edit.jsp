<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Edit Usuario</title>
        <spring:url value="/src/img/favicon.ico" var="ico" />                  
        <link href="${ico}" rel="shortcut icon"/>
        <spring:url value="/src/css/bootstrap.min.css" var="bootstrapCss" />          
        <link href="${bootstrapCss}" rel="stylesheet" />                  
        <script defer src="https://use.fontawesome.com/releases/v5.0.4/js/all.js"></script>        
        <script src="https://rawgit.com/enyo/dropzone/master/dist/dropzone.js"></script>       
        <link rel="stylesheet" href="https://rawgit.com/enyo/dropzone/master/dist/dropzone.css">        
        <spring:url value="src/js/jquery/jquery-2.1.1.js" var="jQuery" />
        <script type="text/javascript" src="${jQuery}"></script>        
        <!--
        <link rel="stylesheet" href="<c:url value="/src/css/style.css"/>" type="text/css"/>
        <link rel="stylesheet" href="<c:url value="src/css/fontawesome.min.css"/>"/>        
        <script src="src/js/dropzone.js"></script>            
        <script src="src/js/app.js"></script>        
        <script src="src/js/jquery/jquery-2.1.1.js"></script>        
        <script src="src/js/bootstrap-3.1.1/js/bootstrap.js"></script>        
        <script src="src/js/bootstrap-dialog/js/bootstrap-dialog.min.js"></script>                
        -->
        <script type="text/javascript">
            //In order to able button
            $(document).on('change', '#txt', function() {
                console.log("test");
                $("#update").prop("disabled", false);
            });
            
            /*
            $(function() {
                var myDropzone = new Dropzone(".dropzone");
                myDropzone.on("success", function() {
                    alert('Uploaded!');
                });
            });*/
            Dropzone.options.myAwesomeDropzone = {
                init: function() {
                    console.log("test");
                    this.on("addedfile", function(file) { alert("Added file."); });
                } 
            };           
            
            $('#myDrop').on('success', function() {
                var args = Array.prototype.slice.call(arguments);
                console.log(args);
            });            
            //Dropzone.options.dropzoneForm.processQueue()
        </script>        
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
                        <div class="container">
                            <ol class="breadcrumb">
                                <li><a href="<c:url value="/home.htm"/>"> Listado</a></li>
                                <li class="active">Editar</li>
                            </ol>
                            <div class="panel panel-primary">
                                <div class="panel-heading">Edite el Usuario</div>
                                <div class="panel-body">
                                <form:form method="POST" commandName="usuario" >                        
                                <form:errors path="*" element="div" cssClass="alert alert-danger"></form:errors>
                                    <fieldset id="fieldAdd">
                                        <div class="form-group"> 
                                            <label for="inputName" class="control-label col-xs-3" style="text-align: right">Nombre</label> 
                                            <div class="col-xs-9">                                                     
                                                <form:input id="txt" path="nombre" cssClass="form-control" cssStyle="width:300px;" size="50" />
                                            </div> 
                                        </div>
                                        <div class="form-group"> 
                                            <label for="inputEmail" class="control-label col-xs-3" style="text-align: right">Correo</label> 
                                            <div class="col-xs-9">                                                     
                                                <form:input id="txt" path="correo" cssClass="form-control" cssStyle="width:300px;" size="50" />
                                            </div> 
                                        </div>
                                        <div class="form-group"> 
                                            <label for="inputPhone" class="control-label col-xs-3" style="text-align: right">Telefono</label> 
                                            <div class="col-xs-9">                                                     
                                                <form:input id="txt" path="telefono" cssClass="form-control" cssStyle="width:300px;" size="15" />
                                            </div> 
                                        </div>                                                

                                        <div class="file-dropzone" id="myDrop">

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
                                            <tbody class="table table-bordered table-striped table-hover table-sm table-responsive-md" style="width:auto;" cellspacing="0" width="100%">
                                                <c:forEach items="${usuario.fileMetaList}" var="fileMeta" varStatus="loopCounter">
                                                    <tr>
                                                        <td><c:out value="${loopCounter.count}${fileMeta.idFile}" /></td>
                                                        
                                                        <td><c:out value="${fileMeta.fileName}" /></td>
                                                        <td><c:out value="${fileMeta.fileType}" /></td>
                                                        <td>
                                                            <c:out value="${fileMeta.fileSize}"/></td>
                                                        <td>
                                                            <a class="btn btn-primary" href="<c:out value="document.htm?idUsuario=${usuario.idUsuario}&idFile=${fileMeta.idFile}"/>">
                                                            <span class="glyphicon glyphicon-download"></span> Download
                                                            </a>
                                                        </td>
                                                    </tr>
                                                </c:forEach>
                                            </tbody>
                                        </table>
                                        <input type="submit" disabled="disable" value="Actualizar" id="update" class="btn btn-danger"/>
                                    </fieldset>
                                </div>                                                                        
                                </form:form>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>        
    </body>
</html>