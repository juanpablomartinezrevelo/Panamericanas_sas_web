<%-- 
    Document   : panel
    Created on : 5/11/2024, 10:35:53 p. m.
    Author     : 123456789
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Panamericanas SAS</title>
    </head>
    <body>
       <%
            if(session.getAttribute("usuario")== null){
                response.sendRedirect("index.html");
                return;
            }
            %>
        <h1>Pagina Principal</h1>
        <p>Selecciona un formulario para continuar:</p>

        <!-- Botón 1: Redirige al formulario1.jsp -->
        <form action="formularioRegistroProducto.jsp" method="get">
            <button type="submit">Registro del producto</button>
        </form>
        <br>

        <!-- Botón 2: Redirige al formulario2.jsp -->
        <form action="formularioRegistroMaterial.jsp" method="get">
            <button type="submit">Registro del material</button>
        </form>
        <br>

        <!-- Botón 3: Redirige al formulario3.jsp -->
        <form action="formularioRegistroProveedor.jsp" method="get">
            <button type="submit">Registro del proveedor</button>
        </form>
        <br>
        
        <!-- Botón 4: Redirige al formulario4.jsp -->
        <form action="FormularioEmpleado.jsp" method="get">
            <button type="submit">Crear cuenta</button>
        </form>
        </body>
    </body>
</html>
