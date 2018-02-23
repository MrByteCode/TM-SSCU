<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
<link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/estilos.css" type="text/css" />
<link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/shCore.css" type="text/css" />
<link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/shThemeDefault.css" type="text/css" />
<script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/shCore.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/shBrushXml.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/shBrushSql.js"></script>
	<title>Portal Docente Spring</title>
<script type="text/javascript">
     SyntaxHighlighter.all()
</script>
</head>

<body >
<%@include file="../cabecera.jsp" %>
<%@include file="../menuLateral.jsp" %>
<div class="cuerpo" >

<p><b >Autentificaci�n contra base de datos.</b></p>

<p >Como la
autentificaci�n en memoria no recomendable si tenemos muchos usuarios ya que
nos complica mucho la gesti�n, vamos a adaptar la aplicaci�n para que se
autentifique contra una base de datos MySql. Spring security dispone de una
configuraci�n en la que no hace falta declarar ninguna funci�n especial ni
consulta SQL ya que la propia configuraci�n interna de spring security se
encarga de hacerlo, para ello spring security propone un tipo de tablas base
para trabajar con ellas con lo que la aplicaci�n sabe su estructura y realiza
todo el trabajo por nosotros, este es el esquema propuesto por spring security:
</p>

<p><img width=567 height=147
src="${pageContext.request.contextPath}/resources/img/image00001.gif"
alt=tablas.gif ></p>

<p>
<pre class="brush: sql">
CREATE DATABASE IF NOT EXISTS PD;
USE PD;
CREATE TABLE IF NOT EXISTS USERS (
  USERNAME varchar(45) NOT NULL,
  PASSWORD varchar(45) DEFAULT NULL,
  ENABLED enum('true','false') DEFAULT 'true',
  PRIMARY KEY (USERNAME)
) ENGINE=InnoDB;
CREATE TABLE IF NOT EXISTS AUTHORITIES (
  USERNAME varchar(45) NOT NULL,
  AUTHORITY varchar(45) DEFAULT NULL,
  PRIMARY KEY (USERNAME),
  FOREIGN KEY (USERNAME) REFERENCES USERS (USERNAME) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB;
INSERT INTO USERS (USERNAME, PASSWORD, ENABLED) VALUES ('alumn', 'alumno', 'true');
INSERT INTO USERS (USERNAME, PASSWORD, ENABLED) VALUES ('prof', 'profesor', 'true');
INSERT INTO AUTHORITIES (USERNAME, AUTHORITY) VALUES ('alumn', 'alumno');
INSERT INTO AUTHORITIES (USERNAME, AUTHORITY) VALUES ('prof', 'profesor');
</pre>
</p>
<p>
Ejecutamos el script en nuestro MySql  y ya tenemos creada nuestra base de datos para la autentificaci�n.
</p>
<p>
Ahora debemos incluir en el proyecto el driver para poder conectarnos a la base de datos,
vamos a hacer como hasta ahora le vamos a indicar a Maven la dependencia que
tiene que incluir en el proyecto y el mismo ara el resto del  trabajo.
</p>

<p >Ahora
lo incluimos en el archivo porm.xml y guardamos el proyecto y comprobamos que
se ha incluido en el proyecto.</p>

<p ><img width=489 height=450
src="${pageContext.request.contextPath}/resources/img/image00003.jpg"
alt="Sin t�tulo18.png" ></p>

<p >Comprobaos
que est� en el proyecto.</p>

<p ><img width=231 height=353
src="${pageContext.request.contextPath}/resources/img/image00005.jpg"
alt="Sin t�tulo19.png" ></p>

<p >Ahora
debemos modificar nuestro archivo seguridad.xml para que la autentificaci�n se
haga por base de datos, no ser� necesario modificar el mapeo de la url�s y solamente tendremos que eliminar la
parte correspondiente a los usuarios y password que ahora se encuentran en la
base de datos, despu�s de esto deberemos declarar un dataSource para realizar
la conexi�n a la base de datos.</p>

<p >Primero
que todo debemos declarar nuestro
AuthenticationManager definiendo el nombre de nuestro dataSource </p>

<p>
<pre class="brush: xml">	
<authentication-manager alias="authenticationManager">
 <authentication-provider>
  <jdbc-user-service data-source-ref="seguridadDataSource" />
  </authentication-provider>
  </authentication-manager>
</pre>
</p>



<p >Ahora
debemos declarar nuestro bean para
nuestro dataSource, indicando la clase que va utilizar.</p>

<p>
<pre class="brush: xml">	
<beans:bean id="userService" class="org.springframework.security.core.userdetails.jdbc.JdbcDaoImpl">
  <beans:property name="dataSource" ref="seguridadDataSource" />
  </beans:bean>
</pre>
</p>



<p>Ahora
ya solo nos queda declarar nuestro dataSourceal que hemos llamado seguridadDataSource con las opciones de
configuraci�n correcta, es decir la clase que utilizara, la url, el driver, el
usuario para conectarnos a la base de datos y el password.</p>

<p>
<pre class="brush: xml">	
<beans:bean id="seguridadDataSource" class="org.springframework.jdbc.datasource.DriverManagerDataSource">
  <beans:property name="driverClassName" value="com.mysql.jdbc.Driver" />
  <beans:property name="url" value="jdbc:mysql://localhost:3306/pd" />
  <beans: property name="username" value="root" />
  <beans: property name="password" value="root" />
  </beans:bean>
</pre>

</p>



<p>Despu�s de todo esto el archivo
quedar�a as�.</p>



<p ><img width=567 height=388
src="${pageContext.request.contextPath}/resources/img/image00007.jpg"
alt="Sin t�tulo20.png" ></p>



<p >Ahora
publicamos la aplicaci�n y comprobamos que funciona correctamente y ya tenemos
nuestra autentificaci�n contra base de datos.</p>

<p ><img width=567 height=302
src="${pageContext.request.contextPath}/resources/img/image00009.jpg"
></p>

<p >Entramos como alumno.</p>

<p ><img width=567 height=302
src="${pageContext.request.contextPath}/resources/img/image000011.jpg"
></p>



</div>

</body>

</html>