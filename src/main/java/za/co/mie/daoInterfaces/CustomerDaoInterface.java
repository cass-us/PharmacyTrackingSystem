package za.co.mie.daoInterfaces;

import java.util.List;
import za.co.mie.model.Prescription;
import za.co.mie.model.User;

public interface CustomerDaoInterface {
    public List<User> getAllCustomers();
    public boolean addUser(User user);
    public User getCustomer(int customerID);
    public boolean AddPrescription(Prescription pre);
    public int getUser(String tel);
    public List<Prescription> customerPrescriptions(int customerID);
     public boolean adminLogin(String name , String password);
   
}
