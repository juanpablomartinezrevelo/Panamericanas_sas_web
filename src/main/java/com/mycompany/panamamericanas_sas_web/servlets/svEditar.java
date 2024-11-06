/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.mycompany.panamamericanas_sas_web.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import logica.Controladora;
import logica.Empleado;

/**
 *
 * @author 123456789
 */
@WebServlet(name = "svEditar", urlPatterns = {"/svEditar"})
public class svEditar extends HttpServlet {
Controladora control = new Controladora();
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        
        int id_editar = Integer.parseInt(request.getParameter("id_empleadoEdit"));
        Empleado empleado = control.TraerEmpleado(id_editar);
        
        HttpSession misesion = request.getSession();
        misesion.setAttribute("empleadoEditar", empleado);
        
        response.sendRedirect("editar.jsp");
        
    }

   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String nombre = request.getParameter("nombre");
        String apellido = request.getParameter("apellido");
        String cedulaStr = request.getParameter("cedula");
        String clave = request.getParameter("clave");
        String confirmacionClave = request.getParameter("claveConfirmacion");
        String cargo = request.getParameter("cargo");
        int cedula = Integer.parseInt(cedulaStr);
        
        Empleado empleado = (Empleado)request.getSession().getAttribute("empleadoEditar");
        empleado.setNombre(nombre);
        empleado.setApellido(apellido);
        empleado.setCedula(cedula);
        empleado.setClave(clave);
        empleado.setConfimarcionClave(confirmacionClave);
        empleado.setCargo(cargo);
        empleado.setUsuario(cedula);
        
        control.editarEmpleado(empleado);
        
        response.sendRedirect("FormularioEmpleado.jsp");
        
    }

  
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
