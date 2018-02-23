<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
<link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/estilos.css" type="text/css" />
<link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/shCore.css" type="text/css" />
<link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/shThemeDefault.css" type="text/css" />
<script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/shCore.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/shBrushXml.js"></script>
	<title>Portal Docente Spring</title>
<script type="text/javascript">
     SyntaxHighlighter.all()
</script>
</head>

<body >
<%@include file="../cabecera.jsp" %>
<%@include file="../menuLateral.jsp" %>
<div class="cuerpo" >

<p class=MsoNormal><b >A�adir
autentificaci�n en memoria con Spring security.</b></p>

<p >&nbsp;</p>

<p >Vamos a
continuar con el proyecto portalDocenteSpring ahora que ya tenemos creado el
proyecto b�sico vamos a a�adirle seguridad para controlar los acceso a sus
recursos, para ello es necesario a�adirle el modulo Spring security a nuestro
proyecto. Como hemos explicado anteriormente la forma m�s f�cil de hacer esto
es mediante Maven, es decir incluyendo las librer�as en el archivo porm.xml
como dependencias para que se las descargue y las a�ada al proyecto.
Las dependencias incluir en el archivo son:</p>
<p>
<pre class="brush: xml">	
	<!-- Spring security -->
		 <dependency>
  				<groupId>org.springframework.security</groupId>
 			 	<artifactId>spring-security-config</artifactId>
 			 	<version>3.1.0.RELEASE</version>
 		 </dependency>
		 <dependency>
  				<groupId>org.springframework.security</groupId>
  				<artifactId>spring-security-web</artifactId>
  				<version>3.1.0.RELEASE</version>
  		</dependency>
		<dependency>
			  <groupId>org.springframework.security</groupId>
			  <artifactId>spring-security-taglibs</artifactId>
			  <version>3.1.0.RELEASE</version>
  		</dependency>

</pre>
</p>

<p >A�adimos
las dependencias al proyecto.</p>

<p> <img width=288 height=377
src="${pageContext.request.contextPath}/resources/img/image002.jpg"
alt="Sin t�tulo8.png" ></p>

<p >Y
guardamos el proyecto, autom�ticamente Maven se bajar los archivos y los
a�adir� a nuestro proyecto.</p>

<p ><img width=346 height=571
src="${pageContext.request.contextPath}/resources/img/image004.jpg"
alt="Sin t�tulo9.png"></p>

<p >Ahora
ya podemos empezar a crear nuestra configuraci�n para la aplicaci�n. Lo primero
que vamos a hacer es crear una p�gina de inicio personalizada y un men� lateral
para navegar por la aplicaci�n. Esto no tiene ning�n secreto ya que es HTML
b�sico , ponemos nuestras p�ginas web dentro de la carpeta views, el men�
lateral lo vamos a incluir con la funci�n include en el jsp asi que no es necesario que lleve las
etiquetas &lt;HTML&gt;&lt;head&gt; y &lt;body&gt; para que no est�n duplicadas en el archivo.
Tambi�n vamos a crearnos en la carpeta resources tres carpetas Img, css y js que
corresponder�n a las im�genes, estilos y archivos javascript de nuestra pagina
web, y lo hacemos en esa carpeta por que como hemos mencionado antes tenemos configurada la
aplicaci�n para que nos deje acceder solamente a esta carpeta. </p>

<p >Al
igual que con menu lateral para no tener que picar cada vez el c�digo del men�
y de la cabecera , vamos a dividir los archivos en 3 partes cabecera, men�
lateral y cuerpo y lo �nico que cambiara en todos los archivos ser� el archivo
del cuerpo. </p>

<p >&nbsp;</p>

<p><img width=567 height=273
src="${pageContext.request.contextPath}/resources/img/image006.jpg"
alt="Sin t�tulo10.png" ></p>

<p >&nbsp;</p>

<p >La
funci�n ${pageContext.request.contextPath} que vemos en la imagen al incluir
los archivos de estilos en necesaria para que nos devuelva la ruta para llegar
hasta la carpeta resources, por lo que en toda la inclusi�n de recursos que se
encuentren en dicha carpeta tendremos que utilizar esta funci�n. Ahora
publicamos la aplicaci�n en el servidor.</p>

<p ><img width=567 height=302
src="${pageContext.request.contextPath}/resources/img/image008.jpg"
alt="Sin t�tulo11.png" ></p>

<p >&nbsp;</p>

<p >Bien
ahora que ya hemos personalizado un poco nuestras p�ginas, podemos crear dentro
de nuestra carpeta views otra carpeta llamada documentaci�n donde podemos crear
archivos jsp con informaci�n sobre temas como por ejemplo Java, MVC, etc..</p>

<p>Ahora
vamos a dotar de seguridad el acceso a las p�ginas que hemos creado, para
empezar tenemos que a�adir dos filtros a nuestro archivo web.xml
que son estos dos:</p>

<p>
<pre class="brush: xml"> 
<filter>
	  <filter-name>springSecurityFilterChain</filter-name>
	  <filter-class>org.springframework.web.filter.DelegatingFilterProxy</filter-class>
  	</filter>
	<filter-mapping>
	  <filter-name>springSecurityFilterChain</filter-name>
	  <url-pattern>/*</url-pattern>
  	</filter-mapping>
  	</pre>
</p>



<p >Con lo
que nuestro archivo web.xml quedara de la siguiente forma.</p>

<p ><img width=567 height=479
src="${pageContext.request.contextPath}/resources/img/image010.jpg"
alt="Sin t�tulo12.png" ></p>

<p >Ahora
debemos a�adir todo lo referente a la configuraci�n de los filtros, para esto
vamos a crearnos un nuevo archivo llamado seguridad.xml en la carpeta spring , debemos incluir su
ubicaci�n en el archivo web.xml.</p>

<p ><img width=360 height=102
src="${pageContext.request.contextPath}/resources/img/image012.jpg"
alt="Sin t�tulo13.png"></p>

<p ><img width=182 height=246
src="${pageContext.request.contextPath}/resources/img/image014.jpg"
alt="Sin t�tulo14.png"></p>

<p >Ahora
puede que el servidor nos est� dando un fallo, esto es porque el archivo
seguridad.xml aun no tiene definido los DTD y los esquemas propios de un
archivo de configuraci�n de Spring, debemos abrir el archivo e incluir en el
este c�digo.</p>

<p>
<pre class="brush: xml">
<?xml version="1.0" encoding="UTF-8"?>
<beans:beans xmlns="http://www.springframework.org/schema/security"
  xmlns:beans="http://www.springframework.org/schema/beans"
  xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
  xsi:schemaLocation="http://www.springframework.org/schema/beans
           http://www.springframework.org/schema/beans/spring-beans-3.1.xsd
           http://www.springframework.org/schema/security
           http://www.springframework.org/schema/security/spring-security-3.1.xsd">


           </beans:beans>
</pre>
</p>


<p >Ahora
que ya tenemos definido el schema del archivo vamos a incluir la configuraci�n
de seguridad para esto debemos incluir los siguientes tags.</p>

<p>
<pre class="brush: xml">
<http auto-config="true" use-expressions="true">
  <intercept-url pattern="/**" access="hasRole('alumno')" />
  </http>
</pre>
</p>


<p >Este
tag especifica las url que se van a filtar vamos a ver las distintas
propiedades:</p>
<ul>
<li type="disc" >&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
Auto-config=�true� esto nos configura autom�ticamente la pagina de
login y el logout.</li>

<li type="disc">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
Use-expressions= esto hablita el uso de las funciones como hasRole()
que devuelven true o false .</li>

<li type="disc">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
Pattern= especifica el recurso al que se quiere mapear.</li>

<li type="disc" >&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
Acces= especifica los roles que tendr�n permisos</li>
</ul>
<p >Ahora
vamos a a�adir algunos usuarios para entrar a nuestra aplicaci�n.</p>

<p>
<pre class="brush: xml">
      <authentication-manager>
        <authentication-provider>
             <user-service>
                <user name="alumn" password="alumno" authorities="alumno" />
             </user-service>
        </authentication-provider>
    </authentication-manager>

</pre>
</p>



<p >Ahora
hemos creado un usuario alumn con el password alumno y con el rol de alumno
para poder entrar en la aplicaci�n, ahora publicamos la aplicaci�n y nos
denegara el acceso mostr�ndonos la pagina de login que tiene spring security
por defecto.</p>

<p><img width=567 height=401
src="${pageContext.request.contextPath}/resources/img/image016.jpg"
alt="Sin t�tulo15.png"></p>

<p ><img width=567 height=302
src="${pageContext.request.contextPath}/resources/img/image018.jpg"></p>

<p >Esta es
una configuraci�n muy b�sica y muy restrictiva como mas ejemplo vamos a a�adir
un rol mas el de profesor y vamos a hacer que el acceso a la p�gina de inicio sea an�nimo, </p>
<p>
pero que el acceso a
los dem�s recursos necesiten autentificaci�n, al tener m�s de dos roles podemos
hacer que dependiendo del rol de nuestro usuario aparezca un men� o otro .</p>

<p >El
archivo seguridad.xml debe quedar asi:</p>

<p ><img width=567 height=488
src="${pageContext.request.contextPath}/resources/img/image020.jpg"
alt="Sin t�tulo16.png" ></p>

<p >Veras
que hemos creado m�s secciones y adem�s hemos definido el home como nuestra p�gina
de login y hemos configurado el logout para que podemos cerrar la sesi�n y nos envi�
a la p�gina de inicio.</p>

<p >Como es
de suponer hemos creado en la carpeta views las carpetas alumno, profesor, documentaci�n y tutorial y
en ellas pondremos las paginas correspondientes a cada una de ellas.</p>

<p >Ahora
vamos a explicar como se mostraran los diferentes men�s en el men� lateral para ello vamos a utilizar
el tag &lt;sec:authorize&gt; .</p>

<p >Por
ejemplo.</p>

<p>
<pre class="brush: xml">
  &lt;sec:authorize access="hasRole('alumno')"&gt;
    <table>
    <tr>
    <td><b>Menu alumno</b></td>
    </tr>
    <tr>
    <td>
     <ul class="enlaces_lateral">
    <li type="disc"><a href="/portalDocenteSpring/alumno/listar">Listar archivos</a></li>
    <li type="disc"><a href="/portalDocenteSpring/tutorial/mvcTutorial">Subir archivo</a></li>
    </ul>
    </td>
    </tr>
    </table>
   &lt;/sec:authorize&gt;
</pre>
</p>



<p >Esto
comprueba si el usuario tiene permisos de alumno si es as� devuelve true y si
no devuelve false y no pinta el men�.</p>

<p >Aparte
de todo esto tambi�n debemos hacer los controladores para que nos devuelvan las
vistas, como siempre los controladores ir�n en la carpeta src/main /java 
<p>y
dentro del paquete upv.pfc.pd, ah� vamos a crear un controlador llamado
adminController.java para todas estas paginas del tutorial.</p>
</p>
<p><img width=231 height=127
src="${pageContext.request.contextPath}/resources/img/image022.jpg"
alt="Sin t�tulo17.png" ></p>

<p >Haremos lo mismo con todas las dem�s p�ginas. </p>

<p >Ahora
ya podemos publicar la aplicaci�n y veremos que dependiendo del rol con el que
entremos tendremos un men� u otro.</p>

<p><img width=567 height=302
src="${pageContext.request.contextPath}/resources/img/image024.jpg" ></p>

</div>

</body>

</html>