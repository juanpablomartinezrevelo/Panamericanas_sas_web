<%-- 
    Document   : FormularioEmpleado
    Created on : 3/11/2024, 1:04:15 a. m.
    Author     : 123456789
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Crear Usuario</title>
    </head>
    <body>
       <h3>Crear Cuenta</h3>
       <form action="svUsuarios" method="POST">
            <p><label>Nombre: </label><input type="text" name="nombre" placeholder="Nombre"></p>
            <br>
            <p><label>Apellido: </label><input type="text" name="apellido" placeholder="Apellido"></p>
            <br>
            <p><label>Cedula: </label><input type="number" name="cedula" placeholder="Cedula"></p>
            <br>
            <p><label>contraseña: </label><input type="password" name="clave" placeholder="Contraseña" ></p>
            <br>
            <p><label>confimar contraseña: </label><input type="password" name="claveConfirmacion" placeholder="Confirmar contraseña"></p>
            <br>
            <label for ="Gerente">Gerente</label>
            <input type="checkbox" id="opcion1" name="cargo" value="Gerente">
            <br>
            <label for ="Almacenista">Almacenista</label>
            <input type="checkbox" id="opcion2" name="cargo" value="Almacenista">
            <br>
            <button type="submit">Registrar</button>
        </form>
       
        <h3>ver lista de usarios</h3>
        <p>para ver los datos de los Empleados cargados haga click en el siguiente botón</p>
        <form action="svUsuarios" method="GET">
        <button type="submit">Mostrar Empleados</button>   
        </form>
        
        <h3>Eliminar Empleado</h3>
        <p>Ingrese el Id del Empleado que quiere eliminar</p>
        <form action="svEliminar" method="POST">
        <p><label>Id: </label><input type="number" name="id_empleado" placeholder="Id del Empleado"></p>
        <button type="submit">Eliminar Empleado</button>
        </form>
        
        <h3>Editar Empleado</h3>
        <p>Ingrese el Id del Empleado que quiere editar</p>
        <form action="svEditar" method="GET">
        <p><label>Id: </label><input type="number" name="id_empleadoEdit" placeholder="Id del Empleado"></p>
        <button type="submit">Editar Empleado</button>
        </form>
    </body>
</html>
