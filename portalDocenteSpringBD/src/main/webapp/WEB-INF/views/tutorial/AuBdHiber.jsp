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
<%@include file="../cabecera.jsp" %>
<%@include file="../menuLateral.jsp" %>
<div class="cuerpo">

<p><b>Autentificación con base de datos con
hibernate.</b></p>

<p >Ahora
que ya tenemos configurada nuestro portal para que trabaje con base de datos
vamos aponer otra capa mas en nuestra aplicación configurándola apara usar
hibernate anotaciones, esto nos libraría de trabajar con archivos de mapeo y
aprovecharnos de las facilidades que tiene implementado el framework Spring
para su utilización con ORM en este caso hibernate.</p>

<p>En
primer lugar hibernate necesita muchas dependencias y algunas de estas solo
trabajan con ciertas versiones de librerías para que funcione correctamente por
este motivo vamos a cambiar casi todas las dependencias de las librerías que
hay en Maven y las vamos a sustituir por estas versiones que son las que funcionan
con hibernate 3.</p>
<p>
<pre class="brush: xml">
<dependency>
  		<groupId>junit</groupId>
  		<artifactId>junit</artifactId>
  		<version>4.8.1</version>
  		<type>jar</type>
  		<scope>compile</scope>
  	</dependency>
  	<dependency>
    	<groupId>org.springframework</groupId>
    	<artifactId>spring-web</artifactId>
    	<version>3.0.5.RELEASE</version>
    	<type>jar</type>
    	<scope>compile</scope>
    </dependency>
    <dependency>
    	<groupId>org.springframework</groupId>
    	<artifactId>spring-core</artifactId>
    	<version>3.0.5.RELEASE</version>
    	<type>jar</type>
    	<scope>compile</scope>
    	<exclusions>
    		<exclusion>
    			<artifactId>commons-logging</artifactId>
    			<groupId>commons-logging</groupId>
    		</exclusion>
    	</exclusions>
    </dependency>
    <dependency>
    	<groupId>log4j</groupId>
    	<artifactId>log4j</artifactId>
    	<version>1.2.14</version>
    	<type>jar</type>
    	<scope>compile</scope>
    </dependency>
    <dependency>
    	<groupId>org.springframework</groupId>
    	<artifactId>spring-tx</artifactId>
    	<version>3.0.5.RELEASE</version>
    	<type>jar</type>
    	<scope>compile</scope>
    </dependency>
    <dependency>
    	<groupId>jstl</groupId>
    	<artifactId>jstl</artifactId>
    	<version>1.1.2</version>
    	<type>jar</type>
    	<scope>compile</scope>
    </dependency>
    <dependency>
    	<groupId>taglibs</groupId>
    	<artifactId>standard</artifactId>
    	<version>1.1.2</version>
    	<type>jar</type>
    	<scope>compile</scope>
    </dependency>
    <dependency>
    	<groupId>org.springframework</groupId>
    	<artifactId>spring-webmvc</artifactId>
    	<version>3.0.5.RELEASE</version>
    	<type>jar</type>
    	<scope>compile</scope>
    </dependency>
    <dependency>
    	<groupId>org.springframework</groupId>
    	<artifactId>spring-aop</artifactId>
    	<version>3.0.5.RELEASE</version>
    	<type>jar</type>
    	<scope>compile</scope>
    </dependency>
    <dependency>
    	<groupId>commons-digester</groupId>
    	<artifactId>commons-digester</artifactId>
    	<version>2.1</version>
    	<type>jar</type>
    	<scope>compile</scope>
    </dependency>
    <dependency>
    	<groupId>commons-collections</groupId>
    	<artifactId>commons-collections</artifactId>
    	<version>3.2.1</version>
    	<type>jar</type>
    	<scope>compile</scope>
    </dependency>
    <dependency>
    	<groupId>org.hibernate</groupId>
    	<artifactId>hibernate-core</artifactId>
    	<version>3.3.2.GA</version>
    	<type>jar</type>
    	<scope>compile</scope>
    </dependency>
    <dependency>
    	<groupId>javax.persistence</groupId>
    	<artifactId>persistence-api</artifactId>
    	<version>1.0</version>
    	<type>jar</type>
    	<scope>compile</scope>
    </dependency>
    <dependency>
    	<groupId>c3p0</groupId>
    	<artifactId>c3p0</artifactId>
    	<version>0.9.1.2</version>
    	<type>jar</type>
    	<scope>compile</scope>
    </dependency>
    <dependency>
    	<groupId>org.springframework</groupId>
    	<artifactId>spring-orm</artifactId>
    	<version>3.0.5.RELEASE</version>
    	<type>jar</type>
    	<scope>compile</scope>
    </dependency>
    <dependency>
    	<groupId>org.slf4j</groupId>
    	<artifactId>slf4j-api</artifactId>
    	<version>1.6.1</version>
    	<type>jar</type>
    	<scope>compile</scope>
    </dependency>
    <dependency>
    	<groupId>org.slf4j</groupId>
    	<artifactId>slf4j-log4j12</artifactId>
    	<version>1.6.1</version>
    	<type>jar</type>
    	<scope>compile</scope>
    </dependency>
    <dependency>
    	<groupId>cglib</groupId>
    	<artifactId>cglib-nodep</artifactId>
    	<version>2.2</version>
    	<type>jar</type>
    	<scope>compile</scope>
    </dependency>
    <dependency>
    	<groupId>org.hibernate</groupId>
    	<artifactId>hibernate-annotations</artifactId>
    	<version>3.4.0.GA</version>
    	<type>jar</type>
    	<scope>compile</scope>
    </dependency>
    <dependency>
    	<groupId>jboss</groupId>
    	<artifactId>javassist</artifactId>
    	<version>3.7.ga</version>
    	<type>jar</type>
    	<scope>compile</scope>
    </dependency>
    <dependency>
    	<groupId>mysql</groupId>
    	<artifactId>mysql-connector-java</artifactId>
    	<version>5.1.14</version>
    	<type>jar</type>
    	<scope>compile</scope>
    </dependency>
    	<!-- Servlet -->
		<dependency>
			<groupId>javax.servlet</groupId>
			<artifactId>servlet-api</artifactId>
			<version>2.5</version>
			<scope>provided</scope>
		</dependency>
		<dependency>
			<groupId>javax.servlet.jsp</groupId>
			<artifactId>jsp-api</artifactId>
			<version>2.1</version>
			<scope>provided</scope>
		</dependency>
		<dependency>
			<groupId>javax.servlet</groupId>
			<artifactId>jstl</artifactId>
			<version>1.2</version>
		</dependency>
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



<p >Ahora
guardamos el proyecto y Maven ara el trabajo por nosotros. Ahora que ya tenemos
todas las librerías en nuestro proyecto vamos a empezar por cambiar todo
nuestro archivo seguridad.xml por este contenido.</p>

<p>
<pre class="brush: xml">


<beans xmlns="http://www.springframework.org/schema/beans"
    xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
    xmlns:sec="http://www.springframework.org/schema/security"
    xmlns:aop="http://www.springframework.org/schema/aop"
    xmlns:jdbc="http://www.springframework.org/schema/jdbc"
    xmlns:tx="http://www.springframework.org/schema/tx"
    xsi:schemaLocation="http://www.springframework.org/schema/beans http://www.springframework.org/schema/beans/spring-beans-3.1.xsd
        http://www.springframework.org/schema/aop http://www.springframework.org/schema/aop/spring-aop-3.1.xsd
        http://www.springframework.org/schema/jdbc http://www.springframework.org/schema/jdbc/spring-jdbc-3.1.xsd
        http://www.springframework.org/schema/tx http://www.springframework.org/schema/tx/spring-tx-3.1.xsd
        http://www.springframework.org/schema/security http://www.springframework.org/schema/security/spring-security-3.1.xsd">
    <!-- ========================= DATASOURCE ======================== -->
    bean id="dataSource" class="org.springframework.jdbc.datasource.DriverManagerDataSource">
        <property name="driverClassName" value="com.mysql.jdbc.Driver" />
        <property name="url" value="jdbc:mysql://localhost:3306/pd" />
        <property name="username" value="root" />
        <property name="password" value="root" />
    </bean>
    <!-- ========================== HIBERNATE ============================ -->
    <bean id="sessionFactory" class="org.springframework.orm.hibernate3.annotation.AnnotationSessionFactoryBean">
        <property name="dataSource" ref="dataSource" />
        <property name="annotatedClasses">
            <list>
                <value>upv.pfc.pd.User</value>
                <value> upv.pfc.pd.Authority</value>
            </list>
        </property>
        <property name="annotatedPackages">
        <list>
            <value> upv.pfc.pd </value>
        </list>
        </property>
        <property name="hibernateProperties">
            <value>
                hibernate.dialect=org.hibernate.dialect.MySQLDialect
                hibernate.show_sql=true
                hibernate.hbm2ddl.auto=update
            </value>
        </property>
   
 </pre>
 <pre class="brush: xml">
    </bean>
    <bean id="transactionManager" class="org.springframework.orm.hibernate3.HibernateTransactionManager">
        <property name="sessionFactory" ref="sessionFactory" />
    </bean>
    <tx:annotation-driven transaction-manager="transactionManager" />
    <bean id="hibernateTemplate" class="org.springframework.orm.hibernate3.HibernateTemplate">
        <property name="sessionFactory" ref="sessionFactory" />
    </bean>
    <!-- ========================= BEANS ======================== -->
    <bean id="userDao" class=" upv.pfc.pd.UserDaoImpl">
        <property name="hibernateTemplate" ref="hibernateTemplate" />
    </bean>
    <bean id="userService" class=" upv.pfc.pd.UserServiceImpl">
        <property name="userDao" ref="userDao" />
    </bean>
    <!-- ========================= URL ======================== -->
      <http pattern="/" security="none"/>
    <http  auto-config="true" use-expressions="true">
       
	 sec:intercept-url pattern="/alumno/**" access="hasRole('alumno')"/>
	     sec:intercept-url pattern="/profesor/**" access="hasRole('profesor')"/>
		 sec:intercept-url pattern="/tutorial/**" access="isAuthenticated()"/>
		 sec:intercept-url pattern="/documentacion/**" access="isAuthenticated()" />
		 sec:intercept-url pattern="/**" access="permitAll" />
         sec:form-login login-page="/home" />
         sec:logout logout-success-url="/" delete-cookies="JSESSIONID"/>

    /sec:http>

    sec:authentication-manager>
        sec:authentication-provider user-service-ref="userUserDetailsService"/>
    /sec:authentication-manager>

    <bean id="userUserDetailsService"
class=" upv.pfc.pd.UserUserDetailsService">
        <constructor-arg ref="userService"/>
    </bean>
</beans>

</pre>
</p>






<p >Ahora
vamos a proceder a explicar cada uno de los apartados del archivo.</p>

<p >Lo
primero de todo necesitamos más definiciones de esquemas que anteriormente, el
dataSource sigue siendo el mismo ya que seguimos utilizando la misma base de
datos y las mismas tablas lo que ahora el dataSource lo hemos llamado
dataSource.</p>

<p >Ahora
vamos a definir nuestro sessionFactory que será el encargado de decirle al
sistema donde se encuentran todos los ficheros necesarios para hibernate, el
dialecto que vamos a utilizar, en este caso el de MySql 5, y también es el
encargado de asociar los DAO para su correcto funcionamiento, aquí también le
decimos que cargue los datos de conexión del dataSource. </p>

<p >Después
en annotatedClasses le decimos los archivos de las clases definidos mediante
anotaciones, en annotatedPackage le indicaos el paquete donde se encuentran las
clases y los archivos y en  las
propiedades de hibernate le indicamos el dialecto de la base de datos además le
decimos que nos muestre por consola las consultas que realice y que modifique
la base de datos solamente cuando haya cambios.</p>

<p>Después
declaramos el transactionManager que es el encargado del manejo de las
transacciones y también declaramos a continuación el HibernateTemplate que se
encarga de guardar, borrar, listar y obtener los objetos de la base de datos.
También se encarga de las excepciones ahorrándonos así mucho trabajo y a
continuación solo nos quedara declarar los beans que vamos a utilizar el
userDao y el userService.</p>



<p >Ahora
que tenemos el archivo se seguridad.xml ya configurado vamos a proceder a
implementar las clases y los DAO para hibernate, para saber con mas precison
que significan las anotaciones podemos visitar la documentación de hibernate en
<a
href="http://docs.jboss.org/hibernate/annotations/3.5/reference/en/html_single/">http://docs.jboss.org/hibernate/annotations/3.5/reference/en/html_single/
 <</a>Aquí vamos a dar por sentado
unos conocimientos básicos de estas.</p>

<p>Todas
las clases y los DAO iran en src/main/java dentro del paquete upv.pfc.pd,
comencemos por definir nuestras clases que implementan las tablas de nuestras
bases de datos, es decir User y Authority.</p>

<p ><b >User.java</b></p>
<p>
<pre class="brush: java">
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.persistence.*;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.GrantedAuthorityImpl;
import org.springframework.security.core.userdetails.UserDetails;
/**
 * The persistent class for the USERS database table.
 *
 */
@Entity
@Table(name="USERS")
public class User implements Serializable, UserDetails {
    private static final long serialVersionUID = 1L;
    //Original props
    @Id
    @Column(name="USERNAME")
    private String username;
    @Column(name="ENABLED")
    private String enabled;
    @Column(name="PASSWORD")
    private String password;
    //bi-directional one-to-one association to Authority
    @OneToOne
    @JoinColumn(name="USERNAME")
    private Authority authority;
    // Getters & Setters for original props
    public String getUsername() {
        return this.username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getEnabled() {
        return this.enabled;
    }
    public void setEnabled(String enabled) {
        this.enabled = enabled;
    }
    public String getPassword() {
        return this.password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    //Getters and setters for relation property
    public Authority getAuthority() {
        return this.authority;
    }
    public void setAuthority(Authority authority) {
        this.authority = authority;
    }
    //Spring Security props
    private transient Collection<GrantedAuthority> authorities;
    //UserDetails methods
    @Transient
    public Collection<GrantedAuthority> getAuthorities() {  return authorities;}
    @Transient
    public boolean isAccountNonExpired() { return true;}
    @Transient
    public boolean isAccountNonLocked() { return true; }
    @Transient
    public boolean isCredentialsNonExpired() {return true; }
    @Transient
    public boolean isEnabled() {
        return getEnabled().equals("true");
    }
    @Transient
    public void setUserAuthorities(List<String> authorities) {
        List<GrantedAuthority> listOfAuthorities = new ArrayList<GrantedAuthority>();
        for (String role : authorities) {
            listOfAuthorities.add(new GrantedAuthorityImpl(role));
        }
        this.authorities = (Collection<GrantedAuthority>) listOfAuthorities;
    }
    //Constructors
    public User() {
    }
}
</pre>
</p>


<p><b >Authority.java</b></p>

<p>
<pre class="brush: java">
import java.io.Serializable;
import javax.persistence.*;
/**
 * The persistent class for the AUTHORITIES database table.
 *
 */
@Entity
@Table(name="AUTHORITIES")
public class Authority implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Column(name="USERNAME")
    private String username;
    @Column(name="AUTHORITY")
    private String authority;
    @OneToOne(mappedBy="authority")
    private User user;
    public Authority() {
    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getAuthority() {
        return this.authority;
    }
    public void setAuthority(String authority) {
        this.authority = authority;
    }
    public User getUser() {
        return this.user;
    }
    public void setUser(User user) {
        this.user = user;
    }
}

</pre>
</p>



<p>Ahora
ya tenemos las clases implementadas vamos a implementar los DAO.</p>

<p ><b >UserDao.java</b></p>

<p>
<pre class="brush: java">
import java.util.List;
public interface UserDao {
    public User getUserByUserName(String userName);
    List<String> getAuthoritiesByUserName(String userName);
}

</pre>
</p>









<p ><b >UserService.java</b></p>

<p>
<pre class="brush: java">
import java.util.List;
public interface UserService {
    User getUserByUserName(String userName);
    List<String> getAuthoritiesByUserName(String userName);
}
</pre>
</p>












<p><b >UserDaoImpl.java</b></p>

<p>
<pre class="brush: java">
import java.util.ArrayList;
import java.util.List;

import org.springframework.orm.hibernate3.HibernateTemplate;
public class UserDaoImpl implements UserDao {
    HibernateTemplate hibernateTemplate;
    private String queryString = "from User where username = ?";
    public void setHibernateTemplate(HibernateTemplate arg0) {
        hibernateTemplate = arg0;
    }
    public HibernateTemplate getHibernateTemplate() {
        return hibernateTemplate;
    }

    public User getUserByUserName(String userName) {
        return (User) hibernateTemplate.find(queryString, userName).get(0);
    }

    public List<String> getAuthoritiesByUserName(String userName) {
        User u = (User) hibernateTemplate.find(queryString, userName).get(0);
        Authority a = u.getAuthority();
        String auth = a.getAuthority();
        List<String> l = new ArrayList<String>();
        l.add(auth);
        return l;
    }
}

</pre>
</p>


<p ><b >UserServiceImpl.java</b></p>

<p>
<pre class="brush: java">
import java.util.List;
public class UserServiceImpl implements UserService {
    UserDao userDao;

    public User getUserByUserName(String userName) {
        return userDao.getUserByUserName(userName);
    }

    public List<String> getAuthoritiesByUserName(String userName) {
        return userDao.getAuthoritiesByUserName(userName);
    }
    public UserDao getUserDao() {
        return userDao;
    }
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }
}

</pre>
</p>



<p ><b>UserUserDetailsService.java</b></p>

<p>
<pre class="brush: java">
import java.util.List;
import org.springframework.dao.DataAccessException;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
public class UserUserDetailsService implements UserDetailsService {
    private UserService userService;
    public UserUserDetailsService(UserService userService) {
        this.userService = userService;
    }
    public UserDetails loadUserByUsername(String userName)
            throws UsernameNotFoundException, DataAccessException {
        User user;
        try {
            user = userService.getUserByUserName(userName);
        } catch (Exception e) {
            throw new UsernameNotFoundException(
                    "getUserByUserName returned null.");
        }
        List<String> authorities = userService
                .getAuthoritiesByUserName(userName);
        user.setUserAuthorities(authorities);
        return (UserDetails) user;
    }
}
</pre>
</p>



<p >Ahora
que ya tenemos implementadas las clases podemos publicar la aplicación y ver su
correcto funcionamiento.</p>

<p><img border=0 width=567 height=302
src="${pageContext.request.contextPath}/resources/img/image0002.jpg"
></p>
<p>
<img border=0 width=567 height=302
src="${pageContext.request.contextPath}/resources/img/image0004.jpg"
></p>

</div>

</body>

</html>