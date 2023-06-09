
package za.co.mie.model;

import java.util.Objects;

public class Physician {
    private String name;
    private String telephone;
   
    public Physician(String name, String telephone) {
        this.name = name;
        this.telephone = telephone;
    }

    
    public String getName() {
        return name;
    }

    public Physician() {
    }

   
    public void setName(String name) {
        this.name = name;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 23 * hash + Objects.hashCode(this.name);
        hash = 23 * hash + Objects.hashCode(this.telephone);
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
        final Physician other = (Physician) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.telephone, other.telephone)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Physician{" + "name=" + name + ", telephone=" + telephone + '}';
    }
    
    
}
