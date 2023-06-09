
package za.co.mie.serviceInterface;
import java.util.List;
import za.co.mie.model.Prescription;
import za.co.mie.model.User;

public interface CustomerServiceInterface {
    public List<User> getAllCustomers();
    public boolean addUser(User user);
    public User getCustomer(int customerID);
    public List<Prescription> customerPrescriptions(int customerID);
     public boolean adminLogin(String name , String password);
}
