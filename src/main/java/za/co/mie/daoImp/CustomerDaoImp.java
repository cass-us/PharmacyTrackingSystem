
package za.co.mie.daoImp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import za.co.mie.daoInterfaces.CustomerDaoInterface;
import za.co.mie.model.Prescription;
import za.co.mie.model.User;


public class CustomerDaoImp implements CustomerDaoInterface{
   private Connection con  = null;
   private PreparedStatement pst = null;
   
   private ResultSet rs ;
   public CustomerDaoImp(Connection con){
       this.con = con;
   } 
 
public boolean addUser(User user){
    boolean retVal = false;
         
            try {
                pst = con.prepareStatement("INSERT INTO user(user_name,telephone_number,date_of_birth,medical_aid,medical_number) values(?,?,?,?,?)");

                pst.setString(1, user.getUserName());
                pst.setString(2, user.getTelephone());
                pst.setString(3, user.getBirthDate());
                pst.setString(4,user.getMedicalAid());
                pst.setString(5,user.getMedicalAidContactNumbers());
               
              retVal =  pst.executeUpdate() > 0;
               
              
            } catch (SQLException e) {
                System.out.println( e.getMessage());}
//             finally {
//                if (pst != null) {
//                    try {
//                        pst.close();
//                        con.close();
//                    } catch (SQLException e) {
//                        System.out.println("problem with closing: " + e.getMessage());
//                    } finally {
//                        pst = null;
//                    }
//                }
   //         }
        
       return retVal;
}
    public CustomerDaoImp() {
    }
   
    @Override
    public List<User> getAllCustomers() {
        List<User> customerList = new ArrayList<>();
       try {
         pst = con.prepareStatement("SELECT customerID,user_name , telephone_number , date_of_birth , medical_aid,medical_number FROM user WHERE userRole=? ");
         pst.setString(1,"patient");
          rs = pst.executeQuery();
          while(rs.next()){
           User user = new User(rs.getInt("customerID"),rs.getString("user_name"),rs.getString("telephone_number"),rs.getString("date_of_birth"),rs.getString("medical_aid"),rs.getString("medical_number"));
           customerList.add(user);
           }
       } catch (SQLException e) {
           System.out.println(e.getMessage());
       }

       return  customerList;
    }

    @Override
    public User getCustomer(int customerID) {
        User user = new User();
       try {
         pst = con.prepareStatement("SELECT  customerID, user_name,customerID,telephone_number,date_of_birth,medical_aid ,medical_number FROM user WHERE customerID = ?");
         pst.setInt(1, customerID);
         rs = pst.executeQuery();
         while(rs.next()){
           user = new User(rs.getInt("customerID"),rs.getString("user_name"),rs.getString("telephone_number"),rs.getString("date_of_birth"),rs.getString("medical_aid"),rs.getString("medical_number"));
           }
       }catch(SQLException e){
           System.out.println(e.getMessage());     }
finally {
                if (pst != null) {
                    try {
                        pst.close();
                        con.close();
                    } catch (SQLException e) {
                        System.out.println("problem with closing: " + e.getMessage());
                    } finally {
                        pst = null;
                    }
                }
       }
       return user;
    }
    @Override
    public List<Prescription> customerPrescriptions(int customerID) {
         ArrayList<Prescription> prescriptionList = null;
          try {
         pst = con.prepareStatement("SELECT expDate ,numberOfUnits, numberofRefills, customerID FROM prescriptionhistory WHERE customerID = ?");
         pst.setInt(1, customerID);
        
          while(rs.next()){
               prescriptionList.add(new Prescription(rs.getString("expDate"),rs.getInt("numberofRefills"),rs.getInt("numberOfUnits"),rs.getString("dateIssued")));
         }
           }catch(SQLException e){
               System.out.println(e.getMessage());
          }finally {
                if (pst != null) {
                    try {
                        pst.close();
                        con.close();
                    } catch (SQLException e) {
                        System.out.println("problem with closing: " + e.getMessage());
                    } finally {
                        pst = null;
                    }
                }
       }
                   
        return prescriptionList;
    }

   public boolean adminLogin(String name , String password){
      // User user = new User();
         try {
         pst = con.prepareStatement("SELECT user_name , password ,userRole FROM user  WHERE userRole=? ");
         pst.setString(1,"admin");
        
         rs = pst.executeQuery();
          while(rs.next()){
               if(name.trim().equalsIgnoreCase(rs.getString("user_name").trim())&& password.trim().equals(rs.getString("password").trim())){
                   return true;
               }
           }
       } catch (SQLException e) {
           System.out.println(e.getMessage());
       }
     return  false;   
    } 

    @Override
    public boolean AddPrescription(Prescription pre) {
      
        try{
           pst = con.prepareStatement("INSER INTO prescriptionhistory(uniquePrescriptionID,dateIssued) values(?,?)");
           pst.setString(1,pre.getExpDate());
           pst.setString(1,pre.getDateIssued());
            
        }catch(SQLException sql){}
        
        
        return false;
    }

    @Override
    public int getUser(String tel) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
