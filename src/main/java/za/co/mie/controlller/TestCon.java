
package za.co.mie.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import za.co.mie.daoImp.CustomerDaoImp;
import za.co.mie.daoImp.MedicationDaoImp;

import za.co.mie.db.listener.DBManager;
import za.co.mie.model.User;
import za.co.mie.serviceImp.CustomerServiceImp;


@WebServlet(name = "TestCon", urlPatterns = {"/TestCon"})
public class TestCon extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, SQLException {
        PrintWriter out = response.getWriter();
        DBManager dbm = (DBManager) request.getServletContext().getAttribute("dbman");
     
        Connection con = dbm.getConnection();
       MedicationDaoImp med = new MedicationDaoImp(con);
       med.getAllMedicationRecord();
//        CustomerDaoImp cst = new  CustomerDaoImp(con);
//        CustomerServiceImp service = new CustomerServiceImp(cst);
//        System.out.println(cst.getCustomer(2)); 
        //getAllCustomers();
       // cst = new  CustomerDaoImp(con);
//       cst.getAllCustomers();
       // System.out.println(service.getAllCustomers());
        response.setContentType("text/html;charset=UTF-8");
           // PrintWriter out = response.getWriter();
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet TestServlet</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet TestServlet at " +request.getContextPath()+ "</h1>");
            out.println(med.getAllMedicationRecord());
            out.println("</body>");
            out.println("</html>");
        
        
       
     
    }

   
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            
            processRequest(request, response);
        } catch (SQLException ex) {
            Logger.getLogger(TestCon.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            
            processRequest(request, response);
        } catch (SQLException ex) {
            Logger.getLogger(TestCon.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
