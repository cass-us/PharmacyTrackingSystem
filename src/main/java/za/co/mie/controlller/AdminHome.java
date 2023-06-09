/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package za.co.mie.controlller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author STUDIO 18
 */
@WebServlet(name = "AdminHome", urlPatterns = {"/AdminHome"})
public class AdminHome extends HttpServlet {
 protected void processRequest(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {
//      RequestDispatcher req = request.getRequestDispatcher("AdminLogin");
//         String username = req.toString();
      HttpSession session = request.getSession(true);
     String username = (String)session.getAttribute("username").toString();
      
        try (PrintWriter out = response.getWriter()) {
         out.println("<!DOCTYPE html>");
         out.println("<html>");
         out.println("<head>");
         out.println("<body>");
         out.print("hello");
          out.println("Welcome! "+username );
         out.println("</body>");
         out.println("</html>");
        
        }
 
  }
   
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
      HttpSession session = request.getSession(true);
     String username = (String)session.getAttribute("username").toString();
      
        try (PrintWriter out = response.getWriter()) {
         out.println("<!DOCTYPE html>");
         out.println("<html>");
         out.println("<head>");
         out.println("<body>");
         out.print("hello");
          out.println("Welcome! "+username );
         out.println("</body>");
         out.println("</html>");
        
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
         HttpSession session = request.getSession(true);
     String username = (String)session.getAttribute("username").toString();
      
        try (PrintWriter out = response.getWriter()) {
         out.println("<!DOCTYPE html>");
         out.println("<html>");
         out.println("<head>");
         out.println("<body>");
         out.print("hello");
          out.println("Welcome! "+username );
         out.println("</body>");
         out.println("</html>");
        
        }
        
         
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
