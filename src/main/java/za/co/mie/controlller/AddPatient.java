/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package za.co.mie.controlller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import za.co.mie.daoImp.CustomerDaoImp;
import za.co.mie.daoImp.MedicationDaoImp;
import za.co.mie.db.listener.DBManager;
import za.co.mie.model.Form;
import za.co.mie.model.Generic;
import za.co.mie.model.Medication;
import za.co.mie.model.Unit;
import za.co.mie.model.User;
import za.co.mie.serviceImp.CustomerServiceImp;

/**
 *
 * @author STUDIO 18
 */
@WebServlet(name = "AddPatient", urlPatterns = {"/AddPatient"})
public class AddPatient extends HttpServlet {

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
       DBManager dbm = (DBManager) request.getServletContext().getAttribute("dbman");
        Connection con = dbm.getConnection();
        CustomerDaoImp dao = new  CustomerDaoImp(con);
         response.setContentType("text/html"); 
        try(PrintWriter out = response.getWriter()){
         String username = request.getParameter("user_name");
         String tel = request.getParameter("telephone_number");
         String birth = request.getParameter("date_of_birth");
         String medAid = request.getParameter("medical_aid");
         String med = request.getParameter("medical_number");
          CustomerServiceImp imp = new CustomerServiceImp(new CustomerDaoImp(con));
          if(imp.addUser(new User(username,tel,birth,medAid,med))){
              out.println("user has been added!");
          }
          else{
             out.println("Error in adding user>>>>");
         }
          
          
          dbm = (DBManager) request.getServletContext().getAttribute("dbman");
         Connection con2 = dbm.getConnection();
         MedicationDaoImp medDao = new MedicationDaoImp(con2);
         String formName = request.getParameter("form");
         String unitName = request.getParameter("unit");
         String gen = request.getParameter("gen");
         if(medDao.addGeneric(new Generic(gen))){
              out.println("added generic");
         }
         if(medDao.addForm(new Form(formName))){
               out.println("form!");
         }
         if(medDao.addUnit(new Unit(unitName))){
               out.println("unit");
         }
//      
      String name = request.getParameter("medicationName");
      String side = request.getParameter("sideEffect");
       if(medDao.addMedication(new Medication(name,side))){    // medDao.addForm(new Form(formName)),medDao.addUnit(new Unit(unitName)))){
              out.println("medication has been added!");
      }
     
    }
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
        
//         DBManager dbm = (DBManager) request.getServletContext().getAttribute("dbman");
//        Connection con = dbm.getConnection();
//        CustomerDaoImp dao = new  CustomerDaoImp(con);
//         response.setContentType("text/html"); 
//        try(PrintWriter out = response.getWriter()){
//         String username = request.getParameter("user_name");
//         String tel = request.getParameter("telephone_number");
//         
//        String birth =  request.getParameter("date_of_birth");
//         String medAid = request.getParameter("medical_aid");
//         String med = request.getParameter("medical_number");
//          CustomerServiceImp imp = new CustomerServiceImp(new CustomerDaoImp(con));
//          imp.addUser(new User(username,tel,birth,medAid,med));
//        }
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
