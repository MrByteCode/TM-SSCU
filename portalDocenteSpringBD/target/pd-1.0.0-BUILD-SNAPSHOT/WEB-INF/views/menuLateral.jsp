<%@page import="upv.pfc.pd.LeerEscribirFichero"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
    <div class="div_lateral">
    
<sec:authorize access="isAuthenticated()">
    <table >
    <tr>
    <td><b>Gestión de usuarios</b></td>
    </tr>
    <tr>
    <td>
    <ul class="enlaces_lateral">
    <li type="disc"><a href="/portalDocenteSpringBD/alta">Alta usuario</a></li>
    </ul>
    </td>
    </tr>
    </table>
</sec:authorize>
  
  
 <sec:authorize access="isAuthenticated()">
    
    <table >
    <tr>
    <td><b>Documentación</b></td>
    </tr>
    <tr>
    <td>
    <ul class="enlaces_lateral">
    <li type="disc"><a href="/portalDocenteSpringBD/documentacion/java">Java</a></li>
    </ul>
    </td>
    </tr>
    </table>
    </sec:authorize>
    <br>
<sec:authorize access="isAuthenticated()">
        <table>
    <tr>
    <td><b>Tutorial</b></td>
    </tr>
    <tr>
    <td>
     <ul class="enlaces_lateral">
    <li type="disc"><a href="/portalDocenteSpringBD/tutorial/MVCP">Proyecto mvc</a></li>
    <li type="disc"><a href="/portalDocenteSpringBD/tutorial/AuMem">Autentificación en memoria</a></li>
    <li type="disc"><a href="/portalDocenteSpringBD/tutorial/AuCBd">Autentificación en base de datos</a></li>
    <li type="disc"><a href="/portalDocenteSpringBD/tutorial/AuBdHiber">Autentificación con hibernate</a></li>
    </ul>
    </td>
    </tr>
    </table>
    </sec:authorize>
     <sec:authorize access="!isAuthenticated()">
    <div class="div_login">
    <form name="f"  action="<%=request.getContextPath()%>/j_spring_security_check"  method='post' >

      <table   >
        <tr ><td style="width:30px;" ><font style="font-size:12px;">User:</font></td><td ><input type='text' name='j_username' style="width:110px; height:20px" value='<c:if test="${not empty param.login_error}"><c:out value="${SPRING_SECURITY_LAST_USERNAME}"/></c:if>'/></td></tr>
        <tr ><td style="width:30px;" ><font style="font-size:12px;">Password:</font></td><td ><input type='password' name='j_password' style="width:110px; height:20px"></td></tr>
        

        <tr><td colspan='1'><input name="submit" type="submit" value="Enviar"></td>
        <td colspan='1'><input name="reset" type="reset" value="Reset"></td></tr>
        
      </table>
      
    </form>
      
    </div>
   <div>

   </div>
     </sec:authorize>
         <sec:authorize access="hasRole('alumno')">
    <table>
    <tr>
    <td><b>Menu alumno</b></td>
    </tr>
    <tr>
    <td>
     <ul class="enlaces_lateral">
    <li type="disc"><a href="/portalDocenteSpringBD/subirArchivo">Subir archivo</a></li>
   
    </ul>
    </td>
    </tr>
    </table>
    </sec:authorize>
     <sec:authorize access="hasRole('profesor')">
    <table>
    <tr>
    <td><b>Menu Profesor</b></td>
    </tr>
    <tr>
    <td>
  <%! String hi="C:\\Pfc/enlacesBD/enlacesBD.txt";%>
   <% LeerEscribirFichero h=new LeerEscribirFichero();
   h.comprobar();
   String enlaces=h.leer(hi);
  
   %>

    <%=enlaces %>
    </ul>
    </td>
    </tr>
    </table>
    </sec:authorize>
    <sec:authorize access="isAuthenticated()">
    <p><a href="<%=request.getContextPath()%>/j_spring_security_logout">Logout</a></p>
    </sec:authorize>
   </div>
   
