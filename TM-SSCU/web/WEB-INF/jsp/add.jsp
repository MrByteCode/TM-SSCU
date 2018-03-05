<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <!--
        <meta name="viewport" content="width=device-width, initial-scale=1" content="charset=UTF-8">
        -->
        <meta charset="UTF-8">
        <title>Create</title>
        <spring:url value="/src/img/favicon.ico" var="ico" />                  
        <link href="${ico}" rel="shortcut icon"/>
        <spring:url value="/src/css/bootstrap.min.css" var="bootstrapCss" />          
        <link href="${bootstrapCss}" rel="stylesheet" />        
        <spring:url value="src/js/jquery/jquery-2.1.1.js" var="jQuery" />
        <script type="text/javascript" src="${jQuery}"></script>                 
        <!---
        <spring:url value="src/js/dropzone.js" var="jDZ" />
        <script type="text/javascript" src="${jDZ}"></script>                 
        <spring:url value="src/js/app.js" var="app" />        
        <script type="text/javascript" src="${app}"></script>         
        -->        
        
        <script src="https://rawgit.com/enyo/dropzone/master/dist/dropzone.js"></script>
        <link rel="stylesheet" href="https://rawgit.com/enyo/dropzone/master/dist/dropzone.css">       
        
        <!-- correcta
        <script src="src/js/dropzone.js"></script>            
        <script src="src/js/app.js"></script>        
        <script src="src/js/jquery/jquery-2.1.1.js"></script>        
        <script src="src/js/bootstrap-3.1.1/js/bootstrap.js"></script>        
        <script src="src/js/bootstrap-dialog/js/bootstrap-dialog.min.js"></script>        
        -->
        <!--
        <link href="/src/css/dropzone.css" type="text/css" rel="stylesheet" />
        <script src="/src/js/myuploadfunction.js"></script>                
        <script src="/src/js/jquery.1.9.1.min.js"></script>
        <script src="/src/js/vendor/jquery.ui.widget.js"></script>
        <script src="/src/js/jquery.iframe-transport.js"></script>
        <script src="/src/js/jquery.fileupload.js"></script>               
        -->
    <script type="text/javascript" >
Dropzone.options.myAwesomeDropzone = {
  init: function() {
    this.on("addedfile", function(file) { alert("Added file."); });
  }
};
//Dropzone.autoDiscover = false;
// or disable for specific dropzone:
// Dropzone.options.myDropzone = false;
/*
$(function() {
  // Now that the DOM is fully loaded, create the dropzone, and setup the
  // event listeners
  var myDropzone = new Dropzone("#mydrop");
  myDropzone.on("addedfile", function(file) {
    // Maybe display some more file information on your page
  });
});
    */
/*
Dropzone.options.myAwesomeDropzone = {
  paramName: "file", // The name that will be used to transfer the file
  maxFilesize: 2, // MB
  accept: function(file, done) {
    if (file.name === "justinbieber.jpg") {
      done("Naha, you don't.");
      console.log("yes");
    }
    else { done(); }
  }
};      
        
        function f1 (file, response) {
            if (this.files.length===0){
                alert("Por favor poner un archivo");
            }
            if (this.files.length > 1)
                this.removeFile(this.files[0]);
        }
        //form validation that recalls the page showing with supplied inputs.  
    
    function f2(){
        this.on("addedfile", function(file) {
           // Valid only in the dropzone . If a repetitive document shows ALERT and the previous item will disappear.(Sorry my English).
           if (this.files.length) {
             var i, len, pre;
             for (i = 0, len = this.files.length; i < len - 1; i++) {
               if (this.files[i].name === file.name && this.files[i].size === file.size && this.files[i].lastModifiedDate.toString() === file.lastModifiedDate.toString()) {
                 alert("Doc: " + file.name + " is already registered.");
                 return (pre = file.previewElement) !== null ? pre.parentNode.removeChild(file.previewElement) : void 0;
               }
             }
           }
         });
    }
    */
    function deleteFile(){
        Dropzone.forElement("div#myDrop").removeAllFiles(true);
    }
    
Dropzone.options.myDropzone = {

  // Prevents Dropzone from uploading dropped files immediately
  autoProcessQueue: false,
  
  acceptedFiles: 'image/*',

  init: function() {
    var submitButton = document.querySelector("#delete");
    myDropzone = this;

    submitButton.addEventListener("click", function() {
      myDropzone.processQueue(); // Tell Dropzone to process all queued files.
      
    });

    // You might want to show the submit button only when 
    // files are dropped here:
    this.on("addedfile", function(file) {
      console.log(file.name);
    });

  }
};    
    /*
    Dropzone.options.myDropzone = {
        // Prevents Dropzone from uploading dropped files immediately
        //autoProcessQueue: false,
        
        acceptedFiles: "image/*"               
        init: function() {
            this.on("addedfile", function(file) {
                console.log(file.name);
            });
            console.log("d");
            this.on("selectedfiles", function(listFiles) {
                cont_files = listFiles.length;
                console.log(cont_files);
            });

            this.on("drop", function(event) {
                console.log(myDropzone.files);            
            });
        }
    }
    */

/*
var myDropzone = new Dropzone('div#myDrop',{
    acceptedFiles: "image/*"
    init: function(){
        this.on("success", function(file, data) {
            });
        } 
    });
*/
    
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
                    <ol class="breadcrumb">
                        <li><a href="<c:url value="/home.htm"/>"> Listado</a></li>
                        <li class="active">Agregar</li>
                    </ol>
                    <div class="panel panel-primary">
                        <div class="panel-heading">Agregar Usuario</div>
                        <div class="panel-body">
                            <div class="row">
                                <div class="col-lg-12">
                                    <form:form method="POST" commandName="usuario" enctype='multipart/form-data' class="dropzone">
                                    <form:errors path="*" element="div" cssClass="alert alert-danger"></form:errors>
                                        <fieldset id="fieldAdd">
                                            <div class="form-group"> 
                                                <label for="inputName" class="control-label col-xs-3" style="text-align: right">Nombre</label> 
                                                <div class="col-xs-9">                                                     
                                                    <form:input path="nombre" cssClass="form-control" cssStyle="width:300px;" size="50" />
                                                </div> 
                                            </div>
                                            <div class="form-group"> 
                                                <label for="inputEmail" class="control-label col-xs-3" style="text-align: right">Correo</label> 
                                                <div class="col-xs-9">                                                     
                                                    <form:input path="correo" cssClass="form-control" cssStyle="width:300px;" size="50" />
                                                </div> 
                                            </div>
                                            <div class="form-group"> 
                                                <label for="inputPhone" class="control-label col-xs-3" style="text-align: right">Telefono</label> 
                                                <div class="col-xs-9">                                                     
                                                    <form:input path="telefono" cssClass="form-control" cssStyle="width:300px;" size="15" />
                                                </div> 
                                            </div>                                                
                                            <div class="dz-default dz-message file-dropzone text-center well col-sm-12" id="myDrop">
                                                <span class="glyphicon glyphicon-upload"></span> <span>
                                                       To attach files, drag and drop here</span><br>
                                                <span>OR</span><br>
                                                <span>Just Click</span>
                                            </div>
                                             <!-- this is were the previews should be shown. -->
                                            <div class="dropzone-previews" ></div>                        
                                            <button id="upload-button" class="btn btn-primary" >
                                                 <span class="glyphicon glyphicon-upload"></span> Upload
                                            </button>
                                            <a class="btn btn-primary pull-right" id="delete"> <span
                                                class="glyphicon glyphicon-eye-open"></span> View All Uploads
                                            </a>                        
                                            <hr/>
                                            <input type="submit" value="Enviar" class="btn btn-danger"/>
                                        </fieldset> 
                                    </form:form>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </body>
</html>