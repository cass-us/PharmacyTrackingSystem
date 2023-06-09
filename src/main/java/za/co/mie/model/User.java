
package za.co.mie.model;

import java.util.Date;
import java.util.Objects;

public class User {
    private String userName;
    private String  telephone_number;
    private  String birthDate; 
    private String medicalAid;
    private String medicalAidContactNumbers;
    private String username;
    private int id;
    private String password;
    public User() {
    }
  // new customer or for registering
    public User(String username , String password) {
        this.username = username;
        this.password = password;
    }
     public User( int id,String customerName, String telephone, String birthDate, String medicalAid, String medicalNumber) {
         this.id = id;
         this.userName = customerName;
        this.telephone_number = telephone;
        this.birthDate = birthDate;
        this.medicalAid = medicalAid;
        this.medicalAidContactNumbers= medicalNumber;
        
    }
    public User(String customerName, String telephone, String birthDate, String medicalAid, String medicalNumber) {
        this.userName = customerName;
        this.telephone_number = telephone;
        this.birthDate = birthDate;
        this.medicalAid = medicalAid;
        this.medicalAidContactNumbers= medicalNumber;
        
    }
    public void setId(int id){
        this.id = id;
    }
     // for logging in
   public int  getId(){
       return id;
   }
   
    public String getUserName() {
        return userName;
    }

    public void setPassword(String password){
        this.password = password;
    }
    public String getPassword(){
        return password;
    }
    public void setUserName(String customerName) {
        this.userName = customerName;
    }

    public String getTelephone() {
        return telephone_number;
    }

    public void setTelephone(String telephone) {
        this.telephone_number = telephone;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

   
    public String getMedicalAid() {
        return medicalAid;
    }

    public void setMedicalAid(String medicalAid) {
        this.medicalAid = medicalAid;
    }

    public String getMedicalAidContactNumbers() {
        return medicalAidContactNumbers;
    }

    public void setMedicalAidContactNumbers(String medicalAidContactNumbers) {
        this.medicalAidContactNumbers = medicalAidContactNumbers;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 89 * hash + Objects.hashCode(this.userName);
        hash = 89 * hash + Objects.hashCode(this.telephone_number);
        hash = 89 * hash + Objects.hashCode(this.birthDate);
        hash = 89 * hash + Objects.hashCode(this.medicalAid);
        hash = 89 * hash + Objects.hashCode(this.medicalAidContactNumbers);
        hash = 89 * hash + Objects.hashCode(this.username);
        hash = 89 * hash + this.id;
        hash = 89 * hash + Objects.hashCode(this.password);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final User other = (User) obj;
        if (this.id != other.id) {
            return false;
        }
        if (!Objects.equals(this.userName, other.userName)) {
            return false;
        }
        if (!Objects.equals(this.telephone_number, other.telephone_number)) {
            return false;
        }
        if (!Objects.equals(this.birthDate, other.birthDate)) {
            return false;
        }
        if (!Objects.equals(this.medicalAid, other.medicalAid)) {
            return false;
        }
        if (!Objects.equals(this.medicalAidContactNumbers, other.medicalAidContactNumbers)) {
            return false;
        }
        if (!Objects.equals(this.username, other.username)) {
            return false;
        }
        if (!Objects.equals(this.password, other.password)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "User{" + "userName=" + userName + ", telephone_number=" + telephone_number + ", birthDate=" + birthDate + ", medicalAid=" + medicalAid + ", medicalAidContactNumbers=" + medicalAidContactNumbers + ", username=" + username + ", id=" + id + ", password=" + password + '}';
    }

   
}
