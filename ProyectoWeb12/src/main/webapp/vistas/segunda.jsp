<%@ include file="/vistas/cabecera.jsp" %>

<html>
  <head>
  <title>SegundaEjemploWeb</title>
  </head>
  <body>
    <h1>EJEMPLO APLICACI�N WEB</h1>
    <p>SEGUNDA (dentro de vistas)</p>
      
    
     <c:forEach items="${miAlumno.listaAlumnos}" var="alum">
      <c:out value="${alum.nombre}"/> 
      <i><c:out value="${alum.apellidos}"/></i>
      <br><br>
    </c:forEach>
    
   <a href="<c:url value="Formulario"/>">formulario</a>
  </body>
</html>