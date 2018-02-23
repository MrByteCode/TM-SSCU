<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta name="viewport" content="width=device-width, initial-scale=1" content="charset=UTF-8">
        <title>Create</title>
        <link rel="stylesheet" href="<c:url value="/src/css/bootstrap.min.css"/>" type="text/css"/>
        <link rel="stylesheet" href="<c:url value="/src/css/bootstrap-dialog.min.css"/>" type="text/css"/>
        <link rel="stylesheet" href="<c:url value="/src/css/style.css"/>" type="text/css"/>
        <link rel="stylesheet" href="<c:url value="src/css/fontawesome.min.css"/>"/> 
        <script defer src="https://use.fontawesome.com/releases/v5.0.4/js/all.js"></script>        
        <!--
        <script src="https://rawgit.com/enyo/dropzone/master/dist/dropzone.js"></script>
        <link rel="stylesheet" href="https://rawgit.com/enyo/dropzone/master/dist/dropzone.css">
        -->
        
        
        <script src="src/js/dropzone.js"></script>            
        <script src="src/js/app.js"></script>        
        <script src="src/js/jquery/jquery-2.1.1.js"></script>        
        <script src="src/js/bootstrap-3.1.1/js/bootstrap.js"></script>        
        <script src="src/js/bootstrap-dialog/js/bootstrap-dialog.min.js"></script>        
        
        <!--
        <script defer src="https://use.fontawesome.com/releases/v5.0.4/js/all.js"></script>                
        <link href="/src/css/dropzone.css" type="text/css" rel="stylesheet" />
        <script src="/src/js/myuploadfunction.js"></script>                
        <script src="/src/js/jquery.1.9.1.min.js"></script>
        <script src="/src/js/vendor/jquery.ui.widget.js"></script>
        <script src="/src/js/jquery.iframe-transport.js"></script>
        <script src="/src/js/jquery.fileupload.js"></script>               
        -->
    <script type="text/javascript" >

        function f1 (file, response) {
            if (this.files.length==0){
                alert("Por favor poner un archivo");
            }
            if (this.files.length > 1)
                this.removeFile(this.files[0]);
            //Do others tasks...
        }        
        //form validation that recalls the page showing with supplied inputs.    
    function f2(){
this.on("addedfile", function(file) {
   /* Valid only in the dropzone . If a repetitive document shows ALERT and the previous item will disappear.(Sorry my English). */
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
    function deleteFile(){
        Dropzone.forElement("div#myDrop").removeAllFiles(true);
    }

    
    init: function X()  {
    this.on("success", function(file, response) {
        console.log("corrio por aqui");
        file.serverId = response.id;
        $(file.previewTemplate).find('.dz-custom-download').attr("href", window.appBaseUrl+"file/download/" + file.serverId); // window.appBaseUrl is my custom global variable
        $(file.previewTemplate).find('.dz-custom-delete').off().on("click", function(e) {
            e.preventDefault();
            myDropzone.emit("removedfile", file);
        });
    });
    }
    function xx(){
        myDropzone.on("success", function(file, response) {
            $(file.previewElement).find('[data-dz-name]').html(response.title);
        });
    }        
    
  Dropzone.options.myDropzone = {
    init: function() {
      this.on("addedfile", function(file) {

        // Create the remove button
        var removeButton = Dropzone.createElement("<button>Remove file</button>");
        

        // Capture the Dropzone instance as closure.
        var _this = this;

        // Listen to the click event
        removeButton.addEventListener("click", function(e) {
          // Make sure the button click doesn't submit the form:
          e.preventDefault();
          e.stopPropagation();

          // Remove the file preview.
          _this.removeFile(file);
          // If you want to the delete the file on the server as well,
          // you can do the AJAX request here.
        });

        // Add the button to the file preview element.
        file.previewElement.appendChild(removeButton);
      });
    }
  }
    </script>        
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
                    <form:form method="POST" commandName="usuario" enctype='multipart/form-data' class="dropzone">                    
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
                        <!--
                        <div class="upload_box">
                            <div class="upload_main">
                                <div class="upload_choose">
                                    <span id="fileDragArea" class="upload_drag_area">Please drag files to upload</span>
                                    <input id="fileImage" size="30" name="fileselects[]" multiple="multiple"  type="file">
                                </div>
                                <div id="preview" class="upload_preview"></div>
                            </div>

                            <div id="uploadInf" class="upload_inf"></div>
                        </div>
                        -->
                        <div class="dz-default dz-message file-dropzone text-center well col-sm-12" id="myDrop">
                            <span class="fa glyphicon-upload"></span> <span>
                                   To attach files, drag and drop here</span><br>
                            <span>OR</span><br>
                            <span>Just Click</span>
                            <span data-dz-name></span>
                        </div>
                         <!-- this is were the previews should be shown. -->
                         <div class="dropzone-previews" ></div>                        
                        <button id="upload-button" class="btn btn-primary" >
                             <span class="glyphicon glyphicon-upload"></span> Upload
                        </button>
                        <a class="btn btn-primary pull-right" onclick="f2()" id="delete"> 
                            <span
                                class="glyphicon glyphicon-eye-open">                                        
                            </span> View All Uploads
                            
                        </a>                        
                        <!--
                        <div style="width:500px;padding:20px">
                            <input id="fileupload" type="file" name="files[]" data-url="/upload" multiple>
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
                        -->
                        <hr/>
                        <input type="submit" value="Enviar" class="btn btn-danger"/>
                    </form:form>
                </div>
            </div>
        </div>            
    </body>
</html>