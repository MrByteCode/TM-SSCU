<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset=UTF-8">
        <title>Ejemplo de Vista Spring</title>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.3/css/bootstrap.min.css"/>
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.3/js/bootstrap.min.js"></script>
    </head>
    <body>
        <div class="content">
            <h1>Formulario</h1>
            <form:form>
                <p>
                    <form:label path="nombre">Nombre</form:label>
                    <form:input path="nombre"/>
                </p>
                <p>
                    <form:label path="correo">Correo</form:label>
                    <form:input path="correo"/>
                </p>                
                <p>
                    <form:label path="edad">Edad</form:label>
                    <form:input path="edad"/>
                </p>
                <br>
                <form:button>Enviar</form:button>
            </form:form>
        </div>
    </body>
</html>
