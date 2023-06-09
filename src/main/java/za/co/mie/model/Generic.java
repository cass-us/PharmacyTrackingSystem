
package za.co.mie.model;

import java.util.Objects;

public class Generic {
    private String genName;

    public Generic(String genName) {
        this.genName = genName;
    }

    public Generic() {
    }

    
    public String getGenName() {
        return genName;
    }

    public void setGenName(String genName) {
        this.genName = genName;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 37 * hash + Objects.hashCode(this.genName);
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
        final Generic other = (Generic) obj;
        if (!Objects.equals(this.genName, other.genName)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Generic{" + "genName=" + genName + '}';
    }
    
   
}
