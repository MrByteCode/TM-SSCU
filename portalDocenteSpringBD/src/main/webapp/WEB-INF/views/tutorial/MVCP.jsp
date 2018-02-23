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
     SyntaxHighlighter.all();
</script>
</head>

<body >
<%@include file="../cabecera.jsp" %>
<%@include file="../menuLateral.jsp" %>
<div class="cuerpo" >

<p ><b >Como crear un proyecto MVC con
SpringToolSuite</b></p>

<p ><span>Lo
primero que debemos haceres crear un proyecto
tipo Spring Template Projecty dentro de
este tipo de proyecto Spring MVC Project.</span></p>

<p><img width=386 height=367
src="${pageContext.request.contextPath}/resources/img/image000002.jpg"></span></p>

<p >File&gt;&gt;New&gt;&gt;Spring
Template Project&gt;&gt;MVCProject</p>

<p>
<img width=373 height=381
src="${pageContext.request.contextPath}/resources/img/image000004.jpg"
v:shapes="Imagen_x0020_4"></p>

<p >Al elegir cualquier tipo de proyecto de la lista si es la
primera vez que lo utilizamos, nos pedirá permisos para descargar todas las
dependencias necesarias automáticamente, ahora le damos a Next y nos pedirá un
nombre de proyecto y un nombre de paquete que debe ir separado por 2 puntos.</p>

<p ><img width=371 height=379
src="${pageContext.request.contextPath}/resources/img/image000006.jpg"
></p>

<p >&nbsp;</p>

<p >Hemos nombrado al proyecto portalDocenteSpring y al paquete
le llamaremos upv.pfc.pd, introducimos los datos y finalizamos para que nos
creee el proyecto. </p>

<p><img width=362 height=370
src="${pageContext.request.contextPath}/resources/img/image000008.jpg"
v:shapes="Imagen_x0020_10"></p>

<p>&nbsp;</p>

<p >Una vez creado el proyecto vamos a ver la estructura del proyecto.</p>

<p]><img width=345 height=595
src="${pageContext.request.contextPath}/resources/img/image0000010.jpg"
alt="Sin título.png" ></p>

<p></p>&nbsp;</p>

<p>El proyecto esta creado con Maven, con lo que nos ahorramos
el trabajo ce crear nosotros la estructura del proyecto,ahora vamos a explicar donde se ubican los
archivos más importantes.</p>

<p >El archivo porm.xml es el archivo que utiliza Maven para la
configuración del proyecto.</p>

<p><img width=415 height=319
src="${pageContext.request.contextPath}/resources/img/image0000012.jpg"
alt="Sin título1.png" ><</p>

<p >Como podemos ver en el archivo ahí una etiquetas llamadas
dependencias, estas son muy importantes porque son la librerías que vamos a
utilizar en el proyecto , cada vez que queramos incluir una librería nueva en
el proyecto vamos a añadir una etiqueta de dependencia en el archivo porm.xml y
Maven automáticamente se bajara la librería correspondiente y la incluirá en el
proyecto, es importante hacerlo de esta manera porque si incluimos la librería
en el proyecto de otra forma al compilar Maven no encontrara la dependencia y
el proyecto no funcionara correctamente .</p>

<p >La etiqueta tiene
esta forma:</p>

<p>
<pre class="brush: xml">
<dependency>
			<groupId> identifica normalmente a un proyecto </groupId>
			<artifactId>  nombre concreto del jar </artifactId>
			<version> número de versión que queremos </version>
		</dependency>
</pre>
</p>


<p >Ahora vamos a ver el archivo web.xml que es el que tiene
nuestra configuración.</p>

<p><img width=567 height=369
src="${pageContext.request.contextPath}/resources/img/image0000014.jpg"
alt="Sin título3.png" ></p>

<p >En este archivo vemos varias etiquetas , vamos a explicar
para que sirve cada una:</p>
<p>
<pre class="brush: xml">
<context-param>
		<param-name>contextConfigLocation</param-name>
		<param-value>/WEB-INF/spring/root-context.xml</param-value>
	</context-param>
</pre>
</p>



<p class=MsoNormal>Esta etiqueta nos indica donde están nuestros archivos de
configuración para la aplicación.</p>
<p>
<pre class="brush: xml">
<listener>
		<listener-class>org.springframework.web.context.ContextLoaderListener</listener-class>
	</listener>
</pre>
</p>



<p >Aquí se declara un listener
que es el que cargara el cotexto de la aplicación.</p>

<p>
<pre class="brush: xml">
	<servlet>
		<servlet-name>appServlet</servlet-name>
		<servlet-class>org.springframework.web.servlet.DispatcherServlet</servlet-class>
		<init-param>
			<param-name>contextConfigLocation</param-name>
			<param-value>/WEB-INF/spring/appServlet/servlet-context.xml</param-value>
		</init-param>
		<load-on-startup>1</load-on-startup>
	</servlet>
</pre>
</p>



<p >En esta etiqueta se declara el controlador y se le indica
que será el primer o en ser cargado al inicializar la aplicación.</p>

<p>
<pre class="brush: xml">
	<servlet-mapping>
		<servlet-name>appServlet</servlet-name>
		<url-pattern>/</url-pattern>
	</servlet-mapping>
</pre>
</p>



<p>Por último en esta
etiqueta se indica que clase de peticiones va a aceptar , en este caso le
estamos diciendo que acepte cualquier petición que le entre.</p>

<p >Ahora vamos a explicar el archivo de configuración  Servlet-context.xml.</p>



<p><img width=619 height=329
src="${pageContext.request.contextPath}/resources/img/image0000016.jpg"></p>

<p>Vamos a explicar en primer lugar la etiqueta resources:</p>
<p>
<pre class="brush: xml">
<resources mapping="/resources/**" location="/resources/" />
</pre>
</p>


<p >Esta etiqueta es la que define donde estarán ubicados nuestros recursos, como hemos
mencionado anteriormente los vamos a poner en la carpeta resources, al poner
esta definición estamos diciendo que la aplicación tiene permiso para acceder a
los archivos que están dentro. Con la opción <span style='font-size:10.0pt;
line-height:115%;font-family:Consolas;color:#7F007F'>mapping</span><span
style='font-size:10.0pt;line-height:115%;font-family:Consolas;color:black'>=</span><i><span
style='font-size:10.0pt;line-height:115%;font-family:Consolas;color:#2A00FF'>&quot;/resources/**&quot;
</span></i>le estamos diciendo que nos de acceso a todos los recursos dentro de
esta carpeta y con<span style='mso-spacerun:yes'>  </span><span
style='font-size:10.0pt;line-height:115%;font-family:Consolas;color:#7F007F'>location</span><span
style='font-size:10.0pt;line-height:115%;font-family:Consolas;color:black'>=</span><i><span
style='font-size:10.0pt;line-height:115%;font-family:Consolas;color:#2A00FF'>&quot;/resources/&quot;
</span></i>le estamos diciendo donde se encuentra la carpeta.</p>

<p>&nbsp;</p>

<p>
<pre class="brush: xml">
<beans:bean class="org.springframework.web.servlet.view.InternalResourceViewResolver">
		<beans:property name="prefix" value="/WEB-INF/views/" />
		<beans:property name="suffix" value=".jsp" />
</beans:bean>
</pre>
</p>




<p >Aquí le estamos
indicando a la aplicación donde están todas las vistas que terminan en .jsp
(archivos jsp) esto es importante porque nos ahorramos tener que poner la ruta completa en el
controlador.</p>

<p>Ahora nos queda la ultima etiqueta:</p>

<p>
<pre class="brush: xml">
<context:component-scan base-package="upv.pfc.pd" />
</pre>
</p>





<p>Esta etiqueta le dice a
la aplicación que busque en al paquete upv.pfc.pd los controladores para las
páginas, esto nos ahorra tener que declararlos cada vez y poder definir los
controladores más fácilmente mediante anotaciones.</p>



<p >Por ultimo vamos ver el controlador, como hemos definido en
el Servlet.Context.xml los controladores
están ubicados en<span style='mso-spacerun:yes'>
</span>JavaResources&gt;&gt;src7main/java&gt;&gt; upv.pfc.pd y dentro de este
paquete nos encontramos en HomeController, vamos a ver lo básico de un controlador.</p>

<p>
<img width=567 height=397
src="${pageContext.request.contextPath}/resources/img/image0000018.jpg" alt="Sin título5.png" ></p>

<p class=MsoNormal style='margin-bottom:0cm;margin-bottom:.0001pt;line-height:
normal;mso-layout-grid-align:none;text-autospace:none'>Lo más importante es la
anotación <span style='font-size:10.0pt;font-family:Consolas;color:#646464;
background:blue;mso-highlight:blue'>@</span><span style='font-size:10.0pt;
font-family:Consolas;color:black;background:silver;mso-highlight:silver'>Controller</span><span
style='font-size:10.0pt;font-family:Consolas;color:black'>, </span>esto indica
que es un controlador y cuando la aplicación escanee el paquete lo encontrara.
Después tenemos<span style='font-size:10.0pt;font-family:Consolas;color:black'>
la </span>anotación <span style='font-size:10.0pt;font-family:Consolas;
color:#646464'>@RequestMapping</span><span style='font-size:10.0pt;font-family:
Consolas;color:black'>(value = </span><span style='font-size:10.0pt;font-family:
Consolas;color:#2A00FF'>&quot;/&quot;</span><span style='font-size:10.0pt;
font-family:Consolas;color:black'>, method = RequestMethod.</span><i><span
style='font-size:10.0pt;font-family:Consolas;color:#0000C0'>GET</span></i><span
style='font-size:10.0pt;font-family:Consolas;color:black'>) </span>esta anotación
captura la petición que es igual al valor de value y se realiza por el método
Get ,<span style='mso-spacerun:yes'>  </span>al ser la petición raíz se está
indicando que esta será la página de inicio de la aplicación.</p>

<p >Tenemos una función
llamada home que nos devolverá un String , este String será el nombre de la
pagina que queremos servir pero sin la extensión ni la ruta ya que la hemos
configurado anteriormente en el Servlet-Context , por lo que solamente
devolvemos home y nos devolverá el archivo home.jsp que está dentro de la
carpeta views.</p>

<p >Esta función en concreto
se le pasa como argumento un modelo esto es necesario para pasar parámetros, se
define una variable con la hora actual y se le añade al modelo con el nombre
serverTime, este nombre es por el que accederos a ese parámetro desde la vista,
es decir desde el archivo home.jsp.</p>



<p><img width=464 height=228
src="${pageContext.request.contextPath}/resources/img/image0000020.jpg"
alt="Sin título6.png"></p>

<p class=MsoNormal style='margin-bottom:0cm;margin-bottom:.0001pt;line-height:
normal;mso-layout-grid-align:none;text-autospace:none'><span style='font-size:
10.0pt;font-family:Consolas'><span style='mso-spacerun:yes'>
</span>Home.jsp<o:p></o:p></span></p>


<p >Como vemos estamos
accediendo a la variable que tiene la fecha por medio de <span
style='font-size:10.0pt;font-family:Consolas;color:black'><span
style='mso-spacerun:yes'> </span>${serverTime}.<o:p></o:p></span></p>

<p class=MsoNormal style='margin-bottom:0cm;margin-bottom:.0001pt;line-height:
normal;mso-layout-grid-align:none;text-autospace:none'><span style='font-size:
10.0pt;font-family:Consolas;color:black'><o:p>&nbsp;</o:p></span></p>

<p class=MsoNormal style='margin-bottom:0cm;margin-bottom:.0001pt;line-height:
normal;mso-layout-grid-align:none;text-autospace:none'>Ahora queda arrancar el
servidor y añadir la aplicación.</p>

<p]><img width=567 height=148
src="${pageContext.request.contextPath}/resources/img/image0000022.jpg"
alt="Sin título7.png"></p>

<p class=MsoNormal style='margin-bottom:0cm;margin-bottom:.0001pt;line-height:
normal;mso-layout-grid-align:none;text-autospace:none'><span style='mso-tab-count:
4'>                                                               </span>Arrancamos
glassfish.</p>



<p >Añadimos la aplicación
al servidor y presionamos Finish.</p>

<p c><img width=525 height=543
src="${pageContext.request.contextPath}/resources/img/image0000024.jpg"
v:shapes="Imagen_x0020_26"></p>



<p >Ahora<span
style='mso-spacerun:yes'>  </span>ya podemos acceder a la aplicación por medio
de la dirección <a href="http://localhost:8080/portalDocenteSpring">http://localhost:8080/portalDocenteSpring</a></p>



<p><img border=0 width=567 height=302
src="${pageContext.request.contextPath}/resources/img/image0000026.jpg"
></p>



</div>

</body>

</html>