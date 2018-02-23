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
primera vez que lo utilizamos, nos pedir� permisos para descargar todas las
dependencias necesarias autom�ticamente, ahora le damos a Next y nos pedir� un
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
alt="Sin t�tulo.png" ></p>

<p></p>&nbsp;</p>

<p>El proyecto esta creado con Maven, con lo que nos ahorramos
el trabajo ce crear nosotros la estructura del proyecto,ahora vamos a explicar donde se ubican los
archivos m�s importantes.</p>

<p >El archivo porm.xml es el archivo que utiliza Maven para la
configuraci�n del proyecto.</p>

<p><img width=415 height=319
src="${pageContext.request.contextPath}/resources/img/image0000012.jpg"
alt="Sin t�tulo1.png" ><</p>

<p >Como podemos ver en el archivo ah� una etiquetas llamadas
dependencias, estas son muy importantes porque son la librer�as que vamos a
utilizar en el proyecto , cada vez que queramos incluir una librer�a nueva en
el proyecto vamos a a�adir una etiqueta de dependencia en el archivo porm.xml y
Maven autom�ticamente se bajara la librer�a correspondiente y la incluir� en el
proyecto, es importante hacerlo de esta manera porque si incluimos la librer�a
en el proyecto de otra forma al compilar Maven no encontrara la dependencia y
el proyecto no funcionara correctamente .</p>

<p >La etiqueta tiene
esta forma:</p>

<p>
<pre class="brush: xml">
<dependency>
			<groupId> identifica normalmente a un proyecto </groupId>
			<artifactId>  nombre concreto del jar </artifactId>
			<version> n�mero de versi�n que queremos </version>
		</dependency>
</pre>
</p>


<p >Ahora vamos a ver el archivo web.xml que es el que tiene
nuestra configuraci�n.</p>

<p><img width=567 height=369
src="${pageContext.request.contextPath}/resources/img/image0000014.jpg"
alt="Sin t�tulo3.png" ></p>

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



<p class=MsoNormal>Esta etiqueta nos indica donde est�n nuestros archivos de
configuraci�n para la aplicaci�n.</p>
<p>
<pre class="brush: xml">
<listener>
		<listener-class>org.springframework.web.context.ContextLoaderListener</listener-class>
	</listener>
</pre>
</p>



<p >Aqu� se declara un listener
que es el que cargara el cotexto de la aplicaci�n.</p>

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
que ser� el primer o en ser cargado al inicializar la aplicaci�n.</p>

<p>
<pre class="brush: xml">
	<servlet-mapping>
		<servlet-name>appServlet</servlet-name>
		<url-pattern>/</url-pattern>
	</servlet-mapping>
</pre>
</p>



<p>Por �ltimo en esta
etiqueta se indica que clase de peticiones va a aceptar , en este caso le
estamos diciendo que acepte cualquier petici�n que le entre.</p>

<p >Ahora vamos a explicar el archivo de configuraci�n� Servlet-context.xml.</p>



<p><img width=619 height=329
src="${pageContext.request.contextPath}/resources/img/image0000016.jpg"></p>

<p>Vamos a explicar en primer lugar la etiqueta resources:</p>
<p>
<pre class="brush: xml">
<resources mapping="/resources/**" location="/resources/" />
</pre>
</p>


<p >Esta etiqueta es la que define donde estar�n ubicados nuestros recursos, como hemos
mencionado anteriormente los vamos a poner en la carpeta resources, al poner
esta definici�n estamos diciendo que la aplicaci�n tiene permiso para acceder a
los archivos que est�n dentro. Con la opci�n <span style='font-size:10.0pt;
line-height:115%;font-family:Consolas;color:#7F007F'>mapping</span><span
style='font-size:10.0pt;line-height:115%;font-family:Consolas;color:black'>=</span><i><span
style='font-size:10.0pt;line-height:115%;font-family:Consolas;color:#2A00FF'>&quot;/resources/**&quot;
</span></i>le estamos diciendo que nos de acceso a todos los recursos dentro de
esta carpeta y con<span style='mso-spacerun:yes'>� </span><span
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




<p >Aqu� le estamos
indicando a la aplicaci�n donde est�n todas las vistas que terminan en .jsp
(archivos jsp) esto es importante porque nos ahorramos tener que poner la ruta completa en el
controlador.</p>

<p>Ahora nos queda la ultima etiqueta:</p>

<p>
<pre class="brush: xml">
<context:component-scan base-package="upv.pfc.pd" />
</pre>
</p>





<p>Esta etiqueta le dice a
la aplicaci�n que busque en al paquete upv.pfc.pd los controladores para las
p�ginas, esto nos ahorra tener que declararlos cada vez y poder definir los
controladores m�s f�cilmente mediante anotaciones.</p>



<p >Por ultimo vamos ver el controlador, como hemos definido en
el Servlet.Context.xml los controladores
est�n ubicados en<span style='mso-spacerun:yes'>
</span>JavaResources&gt;&gt;src7main/java&gt;&gt; upv.pfc.pd y dentro de este
paquete nos encontramos en HomeController, vamos a ver lo b�sico de un controlador.</p>

<p>
<img width=567 height=397
src="${pageContext.request.contextPath}/resources/img/image0000018.jpg" alt="Sin t�tulo5.png" ></p>

<p class=MsoNormal style='margin-bottom:0cm;margin-bottom:.0001pt;line-height:
normal;mso-layout-grid-align:none;text-autospace:none'>Lo m�s importante es la
anotaci�n <span style='font-size:10.0pt;font-family:Consolas;color:#646464;
background:blue;mso-highlight:blue'>@</span><span style='font-size:10.0pt;
font-family:Consolas;color:black;background:silver;mso-highlight:silver'>Controller</span><span
style='font-size:10.0pt;font-family:Consolas;color:black'>, </span>esto indica
que es un controlador y cuando la aplicaci�n escanee el paquete lo encontrara.
Despu�s tenemos<span style='font-size:10.0pt;font-family:Consolas;color:black'>
la </span>anotaci�n <span style='font-size:10.0pt;font-family:Consolas;
color:#646464'>@RequestMapping</span><span style='font-size:10.0pt;font-family:
Consolas;color:black'>(value = </span><span style='font-size:10.0pt;font-family:
Consolas;color:#2A00FF'>&quot;/&quot;</span><span style='font-size:10.0pt;
font-family:Consolas;color:black'>, method = RequestMethod.</span><i><span
style='font-size:10.0pt;font-family:Consolas;color:#0000C0'>GET</span></i><span
style='font-size:10.0pt;font-family:Consolas;color:black'>) </span>esta anotaci�n
captura la petici�n que es igual al valor de value y se realiza por el m�todo
Get ,<span style='mso-spacerun:yes'>� </span>al ser la petici�n ra�z se est�
indicando que esta ser� la p�gina de inicio de la aplicaci�n.</p>

<p >Tenemos una funci�n
llamada home que nos devolver� un String , este String ser� el nombre de la
pagina que queremos servir pero sin la extensi�n ni la ruta ya que la hemos
configurado anteriormente en el Servlet-Context , por lo que solamente
devolvemos home y nos devolver� el archivo home.jsp que est� dentro de la
carpeta views.</p>

<p >Esta funci�n en concreto
se le pasa como argumento un modelo esto es necesario para pasar par�metros, se
define una variable con la hora actual y se le a�ade al modelo con el nombre
serverTime, este nombre es por el que accederos a ese par�metro desde la vista,
es decir desde el archivo home.jsp.</p>



<p><img width=464 height=228
src="${pageContext.request.contextPath}/resources/img/image0000020.jpg"
alt="Sin t�tulo6.png"></p>

<p class=MsoNormal style='margin-bottom:0cm;margin-bottom:.0001pt;line-height:
normal;mso-layout-grid-align:none;text-autospace:none'><span style='font-size:
10.0pt;font-family:Consolas'><span style='mso-spacerun:yes'>
</span>Home.jsp<o:p></o:p></span></p>


<p >Como vemos estamos
accediendo a la variable que tiene la fecha por medio de <span
style='font-size:10.0pt;font-family:Consolas;color:black'><span
style='mso-spacerun:yes'>�</span>${serverTime}.<o:p></o:p></span></p>

<p class=MsoNormal style='margin-bottom:0cm;margin-bottom:.0001pt;line-height:
normal;mso-layout-grid-align:none;text-autospace:none'><span style='font-size:
10.0pt;font-family:Consolas;color:black'><o:p>&nbsp;</o:p></span></p>

<p class=MsoNormal style='margin-bottom:0cm;margin-bottom:.0001pt;line-height:
normal;mso-layout-grid-align:none;text-autospace:none'>Ahora queda arrancar el
servidor y a�adir la aplicaci�n.</p>

<p]><img width=567 height=148
src="${pageContext.request.contextPath}/resources/img/image0000022.jpg"
alt="Sin t�tulo7.png"></p>

<p class=MsoNormal style='margin-bottom:0cm;margin-bottom:.0001pt;line-height:
normal;mso-layout-grid-align:none;text-autospace:none'><span style='mso-tab-count:
4'>�������������������������������������������������������������� </span>Arrancamos
glassfish.</p>



<p >A�adimos la aplicaci�n
al servidor y presionamos Finish.</p>

<p c><img width=525 height=543
src="${pageContext.request.contextPath}/resources/img/image0000024.jpg"
v:shapes="Imagen_x0020_26"></p>



<p >Ahora<span
style='mso-spacerun:yes'>� </span>ya podemos acceder a la aplicaci�n por medio
de la direcci�n <a href="http://localhost:8080/portalDocenteSpring">http://localhost:8080/portalDocenteSpring</a></p>



<p><img border=0 width=567 height=302
src="${pageContext.request.contextPath}/resources/img/image0000026.jpg"
></p>



</div>

</body>

</html>