<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
<link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/estilos.css" type="text/css" />
<link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/shCore.css" type="text/css" />
<link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/shThemeDefault.css" type="text/css" />
<script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/shCore.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/shBrushXml.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/shBrushJava.js"></script>
	<title>Portal Docente Spring</title>
<script type="text/javascript">
     SyntaxHighlighter.all()
</script>
</head>
<body>
<%@include file="cabecera.jsp" %>
<%@include file="menuLateral.jsp" %>
<div class="cuerpo">
<p>Ahora que hemos a&ntilde;adido un enlace vamos a ver como tenemos que crear la pagina para que el servidor nos permite accedeer a
dicha p&aacute;gina. Lo primero que tenemos que hacer es copiar la pagina web que queramos en la carpeta views, que se encuentra dentro del proyecto
  src>>main>>webapp>>WEB-INF>>views</p>

  <p>Despues de dejar el archivo en esta carpeta, muy importante que sea .jsp para que la aplicacion nos la sirva sin tener problemas. Ahora tenemos que crear el contolador para la p&aacute;gina, para esto abriremos el archivo
   <b>adminController.java</b> que se encuentra dentro de la carpeta.
   ahora debemos a&ntilde;adir al final del archivo la siguiente linea:


   </p>
   <p>
   <pre class="brush: java">
   @RequestMapping(value = "/nombreEnlace", method=RequestMethod.GET)
   </pre>
    </p>
    <p>
    Con esto estamos creando un contolador para que atienda la petici&oacute;n de nuestra p&aacute;gina, como se ve el controlador solo
    atendera peticiones del tipo GET es decir enlaces, el parametro nombreEnlace se refiere al nombre que le hemos dado a nuestro enlace
     y debe de ir precedido de /.
    Ahora tenemos que crearnos una funci&oacute;n que devuelva en String, que sera el nombre de nuestra p&aacute;gina, la funcion se puede quedar asi:


	</p>
	<p>
	<pre class="brush: java">
		@RequestMapping(value = "/nombreEnlace", method=RequestMethod.GET)
	public String nobreFuncion()
	{
	return "nombrePagina";
	}
</pre>

	</p>
	<p>
	Para velo mas claro supongamos que nuestro enlace se llama prueba y nuestra pagina PrubaPag, la funci&oacute;n quedaria asi:
	</p>
	<p>
	<pre class="brush: java">
			@RequestMapping(value = "/prueba", method=RequestMethod.GET)
	public String nobreFuncion()
	{
	return "PrubaPag";
	}
</pre>
	</p>

	<br>
	<a href="/portalDocenteSpring/home">Home</a>
	</div>
</body>
</html>