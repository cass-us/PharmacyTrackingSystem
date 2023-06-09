package za.co.mie.daoImp;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import za.co.mie.daoInterfaces.MedicationDaoInterface;
import za.co.mie.model.Form;
import za.co.mie.model.Generic;
import za.co.mie.model.Medication;
import za.co.mie.model.User;
import za.co.mie.model.Unit;

public class MedicationDaoImp implements MedicationDaoInterface {
    
     private PreparedStatement pss  = null;
     private ResultSet rpss = null;
     private Connection con = null;
    
     public MedicationDaoImp(Connection con){
         this.con = con;
     }
     

    @Override
    public List<Medication> getAllMedicationRecord() {
    //Medication(String medicationName ,  String commonEffects ,List<Generic> gen ,List<Form> form, Unit unit)  
    //Medication(String medicationName ,  String commonEffects ,List<Generic> gen ,List<Form> form, Unit unit)
        List<Medication> medicationList = new ArrayList<>();
//        List<Generic> genList = new ArrayList<>();
//        List<Form> formList = new ArrayList<>();
//        Unit unit = new Unit();
         try{
         pss = con.prepareStatement("SELECT med_name,commonSideEffect FROM medication");
          rpss= pss.executeQuery();
//         int medicationID = rpss.getInt("medicationID");
//         int unitID = rp.getInt("unitID");
//         int formID = rps.getInt("formID");
//         pss = con.prepareStatement("SELECT gen_name ,medicationID from generic WHERE medicationID=?");
//         pss.setInt(3, medicationID);
//         ps = con.prepareStatement("SELECT formName FROM form  WHERE formID=?");
//         ps.setInt(1, formID);
//         p = con.prepareStatement("SELECT nameOfUnit, unitID  FROM unit  WHERE unitID=?");
//         p.setInt(2,unitID);
//         rpst= pst.executeQuery();
//         rp= ps.executeQuery();
//         rpss= pss.executeQuery();
//         r = p.executeQuery();
         while(rpss.next()){
//         genList.add(new Generic(rpss.getString("gen_name")));
//        formList.add(new Form(rp.getString("formName")));
//          unit = new Unit(r.getString("nameOfUnit"));
         medicationList.add(new Medication(rpss.getString("med_name"),rpss.getString("commonSideEffect")));
         }
           
       }catch(SQLException e){
           System.out.println(e.getMessage());     }
        
        return medicationList;
    }
     @Override
    public List<Medication> patientRecord(int patientID){
        
        
       return null;
    }

    @Override
    public boolean addMedication(Medication med) {
     boolean retVal = false;
         
            try {
                pss = con.prepareStatement("INSERT INTO medication(med_name,commonSideEffect) values(?,?)");

                pss.setString(1, med.getMedicationName());
                pss.setString(2, med.getCommonEffects());
               
              retVal=  pss.execute();
               
              
            } catch (SQLException e) {
                System.out.println( e.getMessage());}
//             finally {
//                if (pss != null) {
//                    try {
//                        pss.close();
//                        con.close();
//                    } catch (SQLException e) {
//                        System.out.println("problem with closing: " + e.getMessage());
//                    } finally {
//                        pss = null;
//                    }
//                }
//            }
        
       return retVal;
}

    @Override
    public boolean addUnit(Unit unit) {
        boolean retVal = false;
         
            try {
                pss = con.prepareStatement("INSERT INTO unit(nameOfUnit) values(?)");

                pss.setString(1,unit.getUnitName());
             
              retVal =  pss.executeUpdate() > 0;
               
              
            } catch (SQLException e) {
                System.out.println( e.getMessage());}
//             finally {
//                if (pss != null) {
//                    try {
//                        pss.close();
//                        con.close();
//                    } catch (SQLException e) {
//                        System.out.println("problem with closing: " + e.getMessage());
//                    } finally {
//                        pss = null;
//                    }
//                }
//            }
        
       return retVal;
}

    

    @Override
    public boolean addForm(Form form) {
       boolean retVal = false;
         
            try {
                pss = con.prepareStatement("INSERT INTO form(formName) values(?)");

                pss.setString(1,form.getName());
             
              retVal =  pss.executeUpdate() > 0;
               
              
            } catch (SQLException e) {
                System.out.println( e.getMessage());}
//             finally {
//                if (pss != null) {
//                    try {
//                        pss.close();
//                        con.close();
//                    } catch (SQLException e) {
//                        System.out.println("problem with closing: " + e.getMessage());
//                    } finally {
//                        pss = null;
//                    }
//                }
//            }
        
       return retVal;
}

    @Override
    public boolean addGeneric(Generic gen) {
      boolean retVal = false;
         
            try {
                pss = con.prepareStatement("INSERT INTO generic(gen_name) values(?)");

                pss.setString(1,gen.getGenName());
             
              retVal =  pss.executeUpdate() > 0;
               
              
            } catch (SQLException e) {
                System.out.println( e.getMessage());}
//             finally {
//                if (pss != null) {
//                    try {
//                        pss.close();
//                        con.close();
//                    } catch (SQLException e) {
//                        System.out.println("problem with closing: " + e.getMessage());
//                    } finally {
//                        pss = null;
//                    }
//                }
//            }
        
       return retVal;
    }
    }
    
