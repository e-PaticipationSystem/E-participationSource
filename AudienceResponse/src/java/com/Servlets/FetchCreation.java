/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author EDU
 */
public class FetchCreation extends HttpServlet {

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
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet FetchCreation</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet FetchCreation at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
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
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
        out.println("<div class=\"col-lg-4\" id=\"left\" >");
        out.println("<label>Enter title</label><label style=\"color:red\">*</label>");
        out.println("<input type=\"text\" id=\"Title\" onblur=\"AddTitle()\" /></br>");
        out.println("<input type=\"button\" onclick=\"FetchFormCreater()\" value=\"Proceed>>\" />");
        out.println("</div>");
        
        }
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
         //String title=request.getParameter("title");
        out.println("<div class=\"col-lg-4\" id=\"left\">");
       // out.println("<h5>Enter title</h5>");
        
        //out.println("<input type=\"text\" id=\"titleR\" onblur=\"AddTitle()\" />");
        out.println("Write your Question below");
        out.println("<textarea rows=\"6\" cols=\"45\" id=\"titleText\" onkeyup=\"addForm() \"></textarea><br/>");
        
         out.println("<h5>Type of Question</h5>");
         out.println("<select id=\"type\" onchange=\"CheckType() \"><option>-Choose Type-</option><option>One Word</option><option>Open Ended</option></select><br/>");
         out.println("<div id=\"radio\">");
         out.println("<label id=\"y\"></label>");
         out.println("</div>");
         out.println("<label id=\"read\"></label></br>");
         out.println("<label id=\"reader\"></label></br>");
         out.println("<input value=\"Next Question\" type=\"button\" onclick=\"duplicateDiv(); copyDiv2(); \">");
           
         out.println("</div>");
        }
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
