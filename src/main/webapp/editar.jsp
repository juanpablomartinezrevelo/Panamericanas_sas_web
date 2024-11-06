<%-- 
    Document   : editar
    Created on : 5/11/2024, 2:05:41 a. m.
    Author     : 123456789
--%>

<%@page import="logica.Empleado"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Editar Usuario</title>
    </head>
    <body>
        <% Empleado empleado = (Empleado)request.getSession().getAttribute("empleadoEditar");%>
        <form action="svEditar" method="POST">
            <p><label>Nombre: </label><input type="text" name="nombre" value="<%=empleado.getNombre() %>"></p>
            <br>
            <p><label>Apellido: </label><input type="text" name="apellido" value="<%=empleado.getApellido()%>"></p>
            <br>
            <p><label>Cedula: </label><input type="number" name="cedula" value="<%=empleado.getCedula()%>"></p>
            <br>
            <p><label>contraseña: </label><input type="password" name="clave" value="<%=empleado.getClave()%>"></p>
            <br>
            <p><label>confimar contraseña: </label><input type="password" name="claveConfirmacion" value="<%=empleado.getConfimarcionClave()%>"></p>
            <br>
            <label for ="Gerente">Gerente</label>
            <input type="checkbox" id="opcion1" name="cargo" value="<%=empleado.getCargo() %>">
            <br>
            <label for ="Almacenista">Almacenista</label>
            <input type="checkbox" id="opcion2" name="cargo" value="<%=empleado.getCargo() %>">
            <br>
            <button type="submit">Guardar</button>
        </form>
    </body>
</html>
