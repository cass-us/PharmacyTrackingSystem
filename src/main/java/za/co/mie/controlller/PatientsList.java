
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
import za.co.mie.model.User;


@WebServlet(name = "PatientsList", urlPatterns = {"/PatientsList"})
public class PatientsList extends HttpServlet {

   
   
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
      
        
           }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
      
    }
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
        
         DBManager dbm = (DBManager) request.getServletContext().getAttribute("dbman");
        Connection con = dbm.getConnection();
        CustomerDaoImp dao = new  CustomerDaoImp(con);
         try (PrintWriter out = response.getWriter()) {
           List<User> userList = new ArrayList<>();
                 userList = dao.getAllCustomers();
            
             request.setAttribute("userList", userList);
           //  response.sendRedirect("PatientsList.jsp");
              RequestDispatcher rd = request.getRequestDispatcher("PatientsList.jsp");
              rd.forward(request, response); 
             
         }
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
