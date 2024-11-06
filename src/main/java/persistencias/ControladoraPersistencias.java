/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persistencias;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import logica.Empleado;
import persistencias.exceptions.NonexistentEntityException;

public class ControladoraPersistencias {
  EmpleadoJpaController empleJpa = new EmpleadoJpaController();
  
  //operacion CREATE
  public void crearEmpleado(Empleado empleado){
      empleJpa.create(empleado);
  }
  
  public List<Empleado> traerEmpleados(){
      return empleJpa.findEmpleadoEntities();
  }

    public void borrarEmpleado(int id_eliminar) {
      try {
          empleJpa.destroy(id_eliminar);
      } catch (NonexistentEntityException ex) {
          Logger.getLogger(ControladoraPersistencias.class.getName()).log(Level.SEVERE, null, ex);
      }
    }

    public Empleado TraerEmpleado(int id_editar) {
        return empleJpa.findEmpleado(id_editar);
    }

    public void editarEmpleado(Empleado empleado) {
      
      try {
          empleJpa.edit(empleado);
      } catch (Exception ex) {
          Logger.getLogger(ControladoraPersistencias.class.getName()).log(Level.SEVERE, null, ex);
      }
    }
}
