<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
            <a href="<c:url value="/home.htm" />"> Ir a Home</a>
            <h1>Recuperacion de parametros</h1>            
            <table class="table table-bordered      ">
                <thead>
                <th>ID</th>
                <th>NOMBRE</th>
                </thead>
                <tbody>
                    <tr>
                        <td>1</td>
                        <td>Adrian</td>
                    </tr>
                </tbody>
            </table>
            <hr>
            <div class="thumbnail">
                <img src="<c:url value="/resources/images/carro.jpeg"/>"/>
            </div>
        </div>
    </body>
</html>
