<%@ include file="/vistas/cabecera.jsp" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>

<title>Insert title here</title>
</head>
<body>

 <form:form method="POST" 
          action="guardarAlumno" modelAttribute="alumnoModelo">
             <table>
                <tr>
                    <td><form:label path="nombre">nombre</form:label></td>
                    <td><form:input path="nombre"/></td>
                </tr>
                <tr>
                    <td><form:label path="apellidos">apellidos</form:label></td>
                    <td><form:input path="apellidos"/></td>
                </tr>
                <tr>
                    <td><input type="submit" value="Guardar"/></td>
                </tr>
            </table>
        </form:form>

</body>
</html>