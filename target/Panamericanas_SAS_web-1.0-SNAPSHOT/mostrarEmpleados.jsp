
<%@page import="java.util.List"%>
<%@page import="logica.Empleado"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Mostrar Empleados</title>
    </head>
    <body>
        <h1>Lista de Empleados registrados</h1>
        
        <%
            List<Empleado> listaEmpleados = (List) request.getSession().getAttribute("listaEmpleados");
                int cont  = 1;
                for(Empleado emp : listaEmpleados){   
        %>
        
        <p><b>Empleado N°<%=cont%></b></p>
        <p><b>Id: <%=emp.getId()%></b></p>
        <p>Nombre: <%=emp.getNombre()%></p>
        <p>Apellido: <%=emp.getApellido()%></p>
        <p>Cedula: <%=emp.getCedula()%></p>
        <p>Usuario: <%=emp.getUsuario()%> 
        <p>contraseña: <%=emp.getClave()%></p>
        <p>confimar contraseña: <%=emp.getConfimarcionClave()%></p>
        <p>Cargo: <%=emp.getCargo()%></p>
        <p>--------------------------------------------------------</p>
        <%cont = cont+1;%>
        
        <% } %>
    </body>
</html>
