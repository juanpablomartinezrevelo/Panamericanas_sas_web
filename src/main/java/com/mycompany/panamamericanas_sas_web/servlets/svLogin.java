/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.mycompany.panamamericanas_sas_web.servlets;

import java.sql.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author 123456789
 */
@WebServlet(name = "svLogin", urlPatterns = {"/svLogin"})
public class svLogin extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
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
        
        
    }

   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String usuarioStr = request.getParameter("USUARIO");
        String clave = request.getParameter("CLAVE");
        
        int usuario = Integer.parseInt(usuarioStr);
        
        

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(svLogin.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        String usuarioroot = "root";
        String password = "";
        String url = "jdbc:mysql://localhost:3306/panamericanas_sas_db";
        
        Connection conexion;
        Statement statement;
        ResultSet rs;
      
        try {
            conexion = DriverManager.getConnection(url,usuarioroot,password);
            statement = conexion.createStatement();
            rs = statement.executeQuery("SELECT * FROM `empleado` WHERE `USUARIO` = '" + usuario + "' AND `CLAVE` = '" + clave + "'");
            
            if(rs.next()){
                request.getSession().setAttribute("usuario", usuario);
                response.sendRedirect("panel.jsp");
            }else{
                response.sendRedirect("index.html");
            }
        } catch (SQLException ex) {
            Logger.getLogger(svLogin.class.getName()).log(Level.SEVERE, null, ex);
        }
        
       
    }

   
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
