/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;





@Entity
public class Empleado implements Serializable {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int id;
    private String nombre;
    private String apellido;
    private int cedula;
    private String clave;
    private String confimarcionClave;
    private String cargo;
    private int usuario;

    public Empleado() {
    }

    public Empleado(int id, String nombre, String apellido, int cedula, String clave, String confimarcionClave, String cargo, int usuario) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
        this.clave = clave;
        this.confimarcionClave = confimarcionClave;
        this.cargo = cargo;
        this.usuario = usuario;
    }

    
    
    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getCedula() {
        return cedula;
    }

    public String getClave() {
        return clave;
    }

    public String getConfimarcionClave() {
        return confimarcionClave;
    }

    public String getCargo() {
        return cargo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public void setConfimarcionClave(String confimarcionClave) {
        this.confimarcionClave = confimarcionClave;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public int getIdempleado() {
        return id;
    }

    public void setIdempleado(int idEmpleado) {
        this.id = idEmpleado;
    }

    public int getUsuario() {
        return usuario;
    }

    public void setUsuario(int usuario) {
        this.usuario = usuario;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    
    
}
