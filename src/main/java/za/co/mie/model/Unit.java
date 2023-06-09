
package za.co.mie.model;

import java.util.Objects;

public class Unit {
    private String unitName;

    public Unit(String unitName) {
        this.unitName = unitName;
    }

    public Unit() {
    }

    public String getUnitName() {
        return unitName;
    }

    public void setUnitName(String unitName) {
        this.unitName = unitName;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 29 * hash + Objects.hashCode(this.unitName);
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
        final Unit other = (Unit) obj;
        if (!Objects.equals(this.unitName, other.unitName)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Unit{" + "unitName=" + unitName + '}';
    }
    
}
