

<div align="center" class=cuerpo>

<p class=MsoNormal style='text-align:justify'><span style='font-size:9.0pt;
line-height:115%'>Para empezar a comprender que es Java EE primero tenemos que
comprender que es Java. Java es lenguaje de programaci�n de alto nivel y
orientado a objetos e independiente del hardware <span
style='mso-spacerun:yes'>�</span>en la que se ejecuta. Esto ultimo se consigue
gracias a la maquina virtual de Java, para que una aplicaci�n java funcione
tenemos que tener instalado la JMV (Java virtual machine) y el JRE( Java Runime
enviorment Kit ) necesario para crear aplicaciones Java. Al compilar el c�digo
Java no se genera c�digo maquina como se hace normalmente sino un bytecode,
esto es asi ya que el c�digo maquina depende del ordenador en que se ejecute,
por eso se genera el bytecode y despu�s la maquina virtual de java es la
encargada de transformar este bytecode en el c�digo maquina correspondiente
para ccada ordenador en el que se ejecute para lograr la total independencia
del hardware.<o:p></o:p></span></p>

<p class=MsoNormal style='margin-left:70.8pt;text-align:justify;text-indent:
35.4pt'>
<img width=339 height=120
src="${pageContext.request.contextPath}/resources/img/image001.png" 
alt=jvm2 v:shapes="Imagen_x0020_1"><![endif]></span><span style='font-size:
9.0pt;line-height:115%'><o:p></o:p></span></p>

<p class=MsoNormal style='text-align:justify'><span style='font-size:9.0pt;
line-height:115%'>Las diferentes versiones de Java existentes son:<o:p></o:p></span></p>

<p class=MsoNormal style='margin-left:36.0pt;text-align:justify;text-indent:
-18.0pt;mso-list:l2 level1 lfo1'><![if !supportLists]><span style='font-size:
9.0pt;line-height:115%;mso-bidi-font-family:Calibri'><span style='mso-list:
Ignore'>1.<span style='font:7.0pt "Times New Roman"'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
</span></span></span><![endif]><span style='font-size:9.0pt;line-height:115%'>Java
EE: aplicaciones distribuidas multicapa sobre web.<o:p></o:p></span></p>

<p class=MsoNormal style='margin-left:36.0pt;text-align:justify;text-indent:
-18.0pt;mso-list:l2 level1 lfo1'><![if !supportLists]><span style='font-size:
9.0pt;line-height:115%;mso-bidi-font-family:Calibri'><span style='mso-list:
Ignore'>2.<span style='font:7.0pt "Times New Roman"'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
</span></span></span><![endif]><span style='font-size:9.0pt;line-height:115%'>Java
SE: aplicaciones de escritorio y applets.<o:p></o:p></span></p>

<p class=MsoNormal style='margin-left:36.0pt;text-align:justify;text-indent:
-18.0pt;mso-list:l2 level1 lfo1'><![if !supportLists]><span style='font-size:
9.0pt;line-height:115%;mso-bidi-font-family:Calibri'><span style='mso-list:
Ignore'>3.<span style='font:7.0pt "Times New Roman"'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
</span></span></span><![endif]><span style='font-size:9.0pt;line-height:115%'>Java
ME: aplicaciones para dispositivos m�viles (versi�n simplificada de SE y Apis
especificas).<o:p></o:p></span></p>

<p class=MsoNormal style='margin-left:36.0pt;text-align:justify;text-indent:
-18.0pt;mso-list:l2 level1 lfo1'><![if !supportLists]><span style='font-size:
9.0pt;line-height:115%;mso-bidi-font-family:Calibri'><span style='mso-list:
Ignore'>4.<span style='font:7.0pt "Times New Roman"'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
</span></span></span><![endif]><span style='font-size:9.0pt;line-height:115%'>Java
FX.<o:p></o:p></span></p>

<p class=MsoNormal style='margin-left:35.4pt;text-align:justify;text-indent:
35.4pt'><span style='font-size:9.0pt;line-height:115%;mso-fareast-language:
ES;mso-no-proof:yes'><!--[if gte vml 1]><v:shape id="Imagen_x0020_2" o:spid="_x0000_i1026"
 type="#_x0000_t75" alt="javaee5_SDK_rev3" style='width:226.5pt;height:93pt;
 visibility:visible;mso-wrap-style:square'>
 <v:imagedata src="Para%20empezar%20a%20comprender%20que%20es%20Java%20EE%20primero%20tenemos%20que%20comprender%20que%20es%20Java_archivos/image003.png"
  o:title="javaee5_SDK_rev3"/>
</v:shape><![endif]--><![if !vml]><img width=302 height=124
src="${pageContext.request.contextPath}/resources/img/image003.png"
alt="javaee5_SDK_rev3" v:shapes="Imagen_x0020_2"><![endif]></span><span
style='font-size:9.0pt;line-height:115%'><o:p></o:p></span></p>

<p class=MsoNormal style='text-align:justify'><span style='font-size:9.0pt;
line-height:115%'><o:p>&nbsp;</o:p></span></p>

<p class=MsoNormal style='text-align:justify'><span style='font-size:9.0pt;
line-height:115%'>Java EE (Enterprise edition) es una especificaci�n <span
style='mso-spacerun:yes'>�</span>Java para el desarrollo de aplicaciones
empresariales, Java EE especifica una serie <span
style='mso-spacerun:yes'>�</span>Api�s tales como JDBC, RMI, e-mail, JMS,
servicios web, XML, � <span style='mso-spacerun:yes'>�</span>que todos los
programas deben cumplir es decir un est�ndar que todos los fabricantes deben
cumplir, esto hace que las aplicaciones sean portables e independientes de la
plataforma. Java EE se apoya sobre la versi�n Java SE (Standard edition) que
provee la plataforma de ejecuci�n (java virtual machine y Apis b�sicas) y de
compilaci�n. Java EE adem�s ofrece una serie de especificaciones �nicas para
Java EE y sus componentes como <a
href="http://es.wikipedia.org/wiki/Enterprise_JavaBeans"
title="Enterprise JavaBeans"><span style='color:windowtext;text-decoration:
none;text-underline:none'>Enterprise JavaBeans</span></a>, <a
href="http://es.wikipedia.org/wiki/Servlet" title=Servlet><span
style='color:windowtext;text-decoration:none;text-underline:none'>servlets</span></a>,
<a href="http://es.wikipedia.org/wiki/Portlet" title=Portlet><span
style='color:windowtext;text-decoration:none;text-underline:none'>portlets</span></a>,
<a href="http://es.wikipedia.org/wiki/JavaServer_Pages" title="JavaServer Pages"><span
style='color:windowtext;text-decoration:none;text-underline:none'>JavaServer
Pages</span></a>,<span style='mso-spacerun:yes'>�� </span>.. . Esto permite a
los desarrolladores crear aplicaciones portables y escalables a la vez que
integrables con tecnolog�as anteriores adem�s esto permite que el servidor de
aplicaciones pueda manejar transacciones, seguridad, concurrencia y la gesti�n
de los componentes desplegados. <span style='mso-spacerun:yes'>�</span><o:p></o:p></span></p>

<p class=MsoNormal style='text-align:justify'><span style='font-size:9.0pt;
line-height:115%'>La arquitectura JEE implica un modelo de aplicaciones
distribuidas en diversas capas o niveles (tier). La capa cliente admite
diversas tipos de clientes (HTML, Applet, aplicaciones Java, etc.). la capa
intermedia (middle tier) contiene subcapas (el contenedor web y el contenedor
EJB). La tercera capa dentro de esta visi�n sint�tica es la de de aplicaciones
'backend' como ERP, EIS, bases de datos, etc. <span
style='mso-spacerun:yes'>�</span>El contenedor, no es m�s que un entorno de
ejecuci�n estandarizado que ofrece unos servicios por medio de componentes. Los
componentes externos al contenedor tienen una forma est�ndar de acceder a los servicios
de dicho contenedor, con independencia del fabricante<o:p></o:p></span></p>

<p class=MsoNormal style='text-align:justify'><span style='font-size:9.0pt;
line-height:115%'>Por lo general las aplicaciones formadas por capas:
presentaci�n, negocio o l�gica y persistencia, esta divisi�n hace que se puedan
asignar experto en cada una de las capas y que se pueden mejorar la utilizaci�n
de recursos pero esta divisi�n tambi�n tiene sus inconvenientes y dificultades
tales como que la integraci�n de niveles de forma eficiente es bastante costosa
y complicada, requiere de un gran n�mero de transacciones que se han de supervisar
y de m�todos de seguridad para su correcto funcionamiento sin poner en peligro
los datos.<o:p></o:p></span></p>

<p class=MsoNormal style='margin-left:70.8pt;text-align:justify;text-indent:
35.4pt'><span style='font-size:9.0pt;line-height:115%;mso-fareast-language:
ES;mso-no-proof:yes'><!--[if gte vml 1]><v:shape id="Imagen_x0020_3" o:spid="_x0000_i1025"
 type="#_x0000_t75" alt="image002" style='width:261pt;height:189.75pt;
 visibility:visible;mso-wrap-style:square'>
 <v:imagedata src="Para%20empezar%20a%20comprender%20que%20es%20Java%20EE%20primero%20tenemos%20que%20comprender%20que%20es%20Java_archivos/image005.jpg"
  o:title="image002"/>
</v:shape><![endif]--><![if !vml]><img border=0 width=348 height=253
src="${pageContext.request.contextPath}/resources/img/image005.jpg"
alt=image002 v:shapes="Imagen_x0020_3"><![endif]></span><span style='font-size:
9.0pt;line-height:115%'><o:p></o:p></span></p>

<p class=MsoNormal style='text-align:justify'><span style='font-size:9.0pt;
line-height:115%'>Los contenedores de Java EE brindan dos tipos de servicios
EJB y web.<o:p></o:p></span></p>

<p class=MsoNormal style='text-align:justify'><u><span style='font-size:9.0pt;
line-height:115%'>Contenedores Web.<o:p></o:p></span></u></p>

<p class=MsoNormal style='text-align:justify'><span style='font-size:9.0pt;
line-height:115%'>Los contenedores web son unos entornos que encapsulan los
protocolos HTTP y TCP/IP es decir nos liberan de la tarea de creaci�n de
sockets y serverSockets as� como la de realizar la conexi�n con el navegador,
pueden contener tanto Servlets como p�ginas web din�micas.<o:p></o:p></span></p>

<p class=MsoNormal style='text-align:justify'><span style='font-size:9.0pt;
line-height:115%'>Los Servlets son b�sicamente c�digo Java que puede tener c�digo
HTML incrustado aunque es desaconsejable esta pr�ctica por diferentes razones:<o:p></o:p></span></p>

<p class=MsoNormal style='margin-left:36.0pt;text-align:justify;text-indent:
-18.0pt;mso-list:l3 level1 lfo2'><![if !supportLists]><span style='font-size:
9.0pt;line-height:115%;font-family:Symbol;mso-fareast-font-family:Symbol;
mso-bidi-font-family:Symbol'><span style='mso-list:Ignore'>�<span
style='font:7.0pt "Times New Roman"'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
</span></span></span><![endif]><span style='font-size:9.0pt;line-height:115%'>El
HTML es mas f�cil de manejar en un entorno Web i no en uno Java.<o:p></o:p></span></p>

<p class=MsoNormal style='margin-left:36.0pt;text-align:justify;text-indent:
-18.0pt;mso-list:l3 level1 lfo2'><![if !supportLists]><span style='font-size:
9.0pt;line-height:115%;font-family:Symbol;mso-fareast-font-family:Symbol;
mso-bidi-font-family:Symbol'><span style='mso-list:Ignore'>�<span
style='font:7.0pt "Times New Roman"'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
</span></span></span><![endif]><span style='font-size:9.0pt;line-height:115%'>Programar
web no es lo mismo que programar Java, por lo que se aconseja dejar cada tarea
a desarrolladores expertos en cada campo.<o:p></o:p></span></p>

<p class=MsoNormal style='text-align:justify'><span style='font-size:9.0pt;
line-height:115%'>Los Servlets pueden acceder a una gran variedad de API�s de
Java y tiene la ventaja de que una vez invocados se quedan en memoria por lo
que las siguientes invocaciones solo es necesario instanciarlos mejorando
significativamente el tiempo de respuesta.<o:p></o:p></span></p>

<p class=MsoNormal style='text-align:justify'><span style='font-size:9.0pt;
line-height:115%'>Los JSP ( Java Server Pages) son equivalentes a las ASP de
Microsoft, son una paginas web con un grupo de etiquetas ampliado y pueden
contener c�digo Java incrustado, aunque esto debemos evitarlo.<o:p></o:p></span></p>

<p class=MsoNormal style='text-align:justify'><span style='font-size:9.0pt;
line-height:115%'>Los JavaBeans siguen el concepto de encapsulaci�n por lo que
se accede a sus propiedades privadas a trav�s de sus m�todos p�blicos. Son
llamados por los Servlets y los JSP para:<o:p></o:p></span></p>

<p class=MsoNormal style='margin-left:36.0pt;text-align:justify;text-indent:
-18.0pt;mso-list:l0 level1 lfo3'><![if !supportLists]><span style='font-size:
9.0pt;line-height:115%;font-family:Symbol;mso-fareast-font-family:Symbol;
mso-bidi-font-family:Symbol'><span style='mso-list:Ignore'>�<span
style='font:7.0pt "Times New Roman"'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
</span></span></span><![endif]><span style='font-size:9.0pt;line-height:115%'>Contener
informaci�n en memoria<o:p></o:p></span></p>

<p class=MsoNormal style='margin-left:36.0pt;text-align:justify;text-indent:
-18.0pt;mso-list:l0 level1 lfo3'><![if !supportLists]><span style='font-size:
9.0pt;line-height:115%;font-family:Symbol;mso-fareast-font-family:Symbol;
mso-bidi-font-family:Symbol'><span style='mso-list:Ignore'>�<span
style='font:7.0pt "Times New Roman"'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
</span></span></span><![endif]><span style='font-size:9.0pt;line-height:115%'>Ejecutar
l�gica de negocio<o:p></o:p></span></p>

<p class=MsoNormal style='margin-left:36.0pt;text-align:justify;text-indent:
-18.0pt;mso-list:l0 level1 lfo3'><![if !supportLists]><span style='font-size:
9.0pt;line-height:115%;font-family:Symbol;mso-fareast-font-family:Symbol;
mso-bidi-font-family:Symbol'><span style='mso-list:Ignore'>�<span
style='font:7.0pt "Times New Roman"'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
</span></span></span><![endif]><span style='font-size:9.0pt;line-height:115%'>Conexi�n
a bases de datos.<o:p></o:p></span></p>

<p class=MsoNormal><span style='font-size:9.0pt;line-height:115%'><o:p>&nbsp;</o:p></span></p>

<p class=MsoNormal style='margin-top:18.0pt'><span style='font-size:9.0pt;
line-height:115%'><o:p>&nbsp;</o:p></span></p>

<p class=MsoNormal style='mso-margin-bottom-alt:auto;text-align:justify'><span
style='font-size:9.0pt;line-height:115%'><o:p>&nbsp;</o:p></span></p>

<p class=MsoNormal style='text-align:justify'><u><span style='font-size:9.0pt;
line-height:115%'>Contenedores EJB. <o:p></o:p></span></u></p>

<p class=MsoNormal style='text-align:justify'><span style='font-size:9.0pt;
line-height:115%'>Los contenedores EJB son un entorno en el que se ejecutan los
EJB ( Enterprisse JavaBeans) no confundir con los JavaBeans pues los EJB pueden
ser activados por si solos y los JavaBeans deben estar integrados en otros
componentes. Son un programa que se ejecuta en el servidor y contiene todas las
clases y objetos necesarios para el funcionamiento de los enterprisse beans.<o:p></o:p></span></p>

<p class=MsoNormal style='text-align:justify'><span style='font-size:9.0pt;
line-height:115%'>La ventajas que ofrece el contenedor EJB son:<o:p></o:p></span></p>

<p class=MsoNormal style='margin-left:36.0pt;text-align:justify;text-indent:
-18.0pt;mso-list:l1 level1 lfo4'><![if !supportLists]><span style='font-size:
9.0pt;line-height:115%;font-family:Symbol;mso-fareast-font-family:Symbol;
mso-bidi-font-family:Symbol'><span style='mso-list:Ignore'>�<span
style='font:7.0pt "Times New Roman"'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
</span></span></span><![endif]><span style='font-size:9.0pt;line-height:115%'>Manejo
de transacciones.<o:p></o:p></span></p>

<p class=MsoNormal style='margin-left:36.0pt;text-align:justify;text-indent:
-18.0pt;mso-list:l1 level1 lfo4'><![if !supportLists]><span style='font-size:
9.0pt;line-height:115%;font-family:Symbol;mso-fareast-font-family:Symbol;
mso-bidi-font-family:Symbol'><span style='mso-list:Ignore'>�<span
style='font:7.0pt "Times New Roman"'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
</span></span></span><![endif]><span style='font-size:9.0pt;line-height:115%'>Seguridad
y comprobaci�n de los m�todos de acceso.<o:p></o:p></span></p>

<p class=MsoNormal style='margin-left:36.0pt;text-align:justify;text-indent:
-18.0pt;mso-list:l1 level1 lfo4'><![if !supportLists]><span style='font-size:
9.0pt;line-height:115%;font-family:Symbol;mso-fareast-font-family:Symbol;
mso-bidi-font-family:Symbol'><span style='mso-list:Ignore'>�<span
style='font:7.0pt "Times New Roman"'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
</span></span></span><![endif]><span style='font-size:9.0pt;line-height:115%'>Concurrencia,
llamada a un mismo recurso desde m�ltiples clientes.<o:p></o:p></span></p>

<p class=MsoNormal style='margin-left:36.0pt;text-align:justify;text-indent:
-18.0pt;mso-list:l1 level1 lfo4'><![if !supportLists]><span style='font-size:
9.0pt;line-height:115%;font-family:Symbol;mso-fareast-font-family:Symbol;
mso-bidi-font-family:Symbol'><span style='mso-list:Ignore'>�<span
style='font:7.0pt "Times New Roman"'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
</span></span></span><![endif]><span style='font-size:9.0pt;line-height:115%'>Servicios
de red.<o:p></o:p></span></p>

<p class=MsoNormal style='margin-left:36.0pt;text-align:justify;text-indent:
-18.0pt;mso-list:l1 level1 lfo4'><![if !supportLists]><span style='font-size:
9.0pt;line-height:115%;font-family:Symbol;mso-fareast-font-family:Symbol;
mso-bidi-font-family:Symbol'><span style='mso-list:Ignore'>�<span
style='font:7.0pt "Times New Roman"'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
</span></span></span><![endif]><span style='font-size:9.0pt;line-height:115%'>Gesti�n
de recursos: gesti�n de m�ltiples recursos.<o:p></o:p></span></p>

<p class=MsoNormal style='margin-left:36.0pt;text-align:justify;text-indent:
-18.0pt;mso-list:l1 level1 lfo4'><![if !supportLists]><span style='font-size:
9.0pt;line-height:115%;font-family:Symbol;mso-fareast-font-family:Symbol;
mso-bidi-font-family:Symbol'><span style='mso-list:Ignore'>�<span
style='font:7.0pt "Times New Roman"'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
</span></span></span><![endif]><span style='font-size:9.0pt;line-height:115%'>Persistencia:
sincronizaci�n entre los datos de la aplicaci�n y los de las tablas de los base
de datos.<o:p></o:p></span></p>

<p class=MsoNormal style='margin-left:36.0pt;text-align:justify;text-indent:
-18.0pt;mso-list:l1 level1 lfo4'><![if !supportLists]><span style='font-size:
9.0pt;line-height:115%;font-family:Symbol;mso-fareast-font-family:Symbol;
mso-bidi-font-family:Symbol'><span style='mso-list:Ignore'>�<span
style='font:7.0pt "Times New Roman"'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
</span></span></span><![endif]><span style='font-size:9.0pt;line-height:115%'>Gesti�n
de mensajes: Escalabilidad: posibilidad de constituir cl�ster de servidores de
aplicaciones con m�ltiples hosts para poder dar respuesta a aumentos repentinos
de carga de la aplicaci�n con s�lo a�adir hosts adicionales.<o:p></o:p></span></p>

<p class=MsoNormal style='margin-left:36.0pt;text-align:justify;text-indent:
-18.0pt;mso-list:l1 level1 lfo4'><![if !supportLists]><span style='font-size:
9.0pt;line-height:115%;font-family:Symbol;mso-fareast-font-family:Symbol;
mso-bidi-font-family:Symbol'><span style='mso-list:Ignore'>�<span
style='font:7.0pt "Times New Roman"'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
</span></span></span><![endif]><span style='font-size:9.0pt;line-height:115%'>Adaptaci�n
en tiempo de despliegue: posibilidad de modificaci�n de las caracter�sticas en
el momento de despliegue del bean.<o:p></o:p></span></p>

<p class=MsoNormal style='margin-left:70.8pt;text-align:justify;text-indent:
35.4pt'><span style='font-size:9.0pt;line-height:115%'><o:p>&nbsp;</o:p></span></p>

<p class=MsoNormal><o:p>&nbsp;</o:p></p>

</div>


