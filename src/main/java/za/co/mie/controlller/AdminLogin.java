/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package za.co.mie.controlller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import za.co.mie.daoImp.CustomerDaoImp;
import za.co.mie.db.listener.DBManager;
import za.co.mie.model.User;
import za.co.mie.serviceImp.CustomerServiceImp;

@WebServlet(name = "AdminLogin", urlPatterns = {"/AdminLogin"})
public class AdminLogin extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
        DBManager dbm = (DBManager) request.getServletContext().getAttribute("dbman");
        Connection con = dbm.getConnection();
        CustomerDaoImp dao = new  CustomerDaoImp(con);
         response.setContentType("text/html"); 
        try(PrintWriter out = response.getWriter()){
         String username = request.getParameter("username");
         String password = request.getParameter("password");
          CustomerServiceImp imp = new CustomerServiceImp(new CustomerDaoImp(con));
        if(imp.adminLogin(username, password)){
                  HttpSession session = request.getSession(true);
                  RequestDispatcher regd = request.getRequestDispatcher("AdminLogin.jsp");
                  regd.forward(request, response);
         }else{
             RequestDispatcher regd = request.getRequestDispatcher("AddPatient");
             regd.forward(request, response);
         }
        }
        
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
