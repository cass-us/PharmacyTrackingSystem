
package za.co.mie.serviceImp;

import java.util.List;
import za.co.mie.daoImp.CustomerDaoImp;
import za.co.mie.model.Prescription;
import za.co.mie.model.User;
import za.co.mie.serviceInterface.CustomerServiceInterface;

public class CustomerServiceImp implements CustomerServiceInterface{
     private CustomerDaoImp daoImp;
     private User user = null;
    
    public  CustomerServiceImp(CustomerDaoImp daoImp){
    this.daoImp = daoImp;
    }
     public  CustomerServiceImp(){}
     @Override
    public List<User> getAllCustomers() {
        return daoImp==null ? null : daoImp.getAllCustomers();
    }

    @Override
    public boolean addUser(User user) {
       return daoImp==null ? false : daoImp.addUser(user);
    }

    @Override
    public User getCustomer(int customerID) {
       return daoImp==null ? null : daoImp.getCustomer(customerID);
    }
    @Override
    public List<Prescription> customerPrescriptions(int customerID){
        return daoImp==null ? null : daoImp.customerPrescriptions(customerID);
    }

     @Override
   public boolean adminLogin(String name , String password){
       return daoImp.adminLogin(name,password);
   }
    
}
