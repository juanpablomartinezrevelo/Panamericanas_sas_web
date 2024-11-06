/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

import java.util.List;
import persistencias.ControladoraPersistencias;


public class Controladora {

    ControladoraPersistencias controlPersis = new ControladoraPersistencias();
    
    
    public void crearEmpleado (Empleado empleado){
        controlPersis.crearEmpleado(empleado);
    }
    
    public List<Empleado> traerEmpleados(){
        return controlPersis.traerEmpleados();
    }

    public void borrarEmpleado(int id_eliminar) {
        controlPersis.borrarEmpleado(id_eliminar);
    }

    public Empleado TraerEmpleado(int id_editar) {
        return controlPersis.TraerEmpleado(id_editar);
    }

    public void editarEmpleado(Empleado empleado) {
        
        controlPersis.editarEmpleado(empleado);
        
    }

    
}
