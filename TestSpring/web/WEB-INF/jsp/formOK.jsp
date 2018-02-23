<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.3/css/bootstrap.min.css"/>
    </head>
    <body>
        <div class="container">
            <div class="row">                
                <form:form method="POST" commandName="personaOK">
                    <form:errors path="*" element="div" cssClass="alert alert-danger"></form:errors>
                    <h1> Ingrese los datos</h1>
                    <p>                        
                        <form:label path="nombre">Nombre</form:label>
                        <form:input path="nombre" cssClass="form-control"/>
                        <form:errors path="nombre"></form:errors>
                    </p>
                    <p>                        
                        <form:label path="correo">Correo</form:label>
                        <form:input path="correo" cssClass="form-control"/>
                    </p>
                    <p>                        
                        <form:label path="pais">Pais</form:label>
                        <form:select path="pais" cssClass="form-control">
                            <form:option value="0">Selecciones..</form:option>
                            <form:options items="${paisLista}"></form:options>
                        </form:select>                        
                    </p>
                    <hr>
                    <input type="submit" value="Enviar" class="form-control"/>
                </form:form>
            </div>            
        </div>
    </body>
</html>
