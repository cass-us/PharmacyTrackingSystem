/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package za.co.mie.controlller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import za.co.mie.daoImp.CustomerDaoImp;
import za.co.mie.db.listener.DBManager;
import za.co.mie.model.Prescription;
import za.co.mie.serviceImp.CustomerServiceImp;

/**
 *
 * @author STUDIO 18
 */
@WebServlet(name = "PrescriptionHistory", urlPatterns = {"/PrescriptionHistory"})
public class PrescriptionHistory extends HttpServlet {

   
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
      
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
       
        DBManager dbm = (DBManager) request.getServletContext().getAttribute("dbman");
        Connection con = dbm.getConnection();
        
         CustomerServiceImp imp = new CustomerServiceImp(new CustomerDaoImp(con));
         try(PrintWriter out = response.getWriter()){
            int x = Integer.parseInt(request.getParameter("id"));
            List<Prescription> preList = new ArrayList<>();
            preList = imp.customerPrescriptions(x);
            out.print(x);
            request.setAttribute("preList", preList);
           RequestDispatcher rd = request.getRequestDispatcher("PrescriptionHistory.jsp");
           rd.forward(request, response);
         }
    }

   //  CustomerServiceImp
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
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
