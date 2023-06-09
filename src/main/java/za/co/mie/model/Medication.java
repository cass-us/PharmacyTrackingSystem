package za.co.mie.model;

import java.util.List;
import java.util.Objects;

public class Medication {
    private String medicationName;
    private int unitMedicationPrescribed;
    private int medQuantity;
    private String commonEffects ;
    private Form form;
    private Unit unit;
    private Generic gen;
    public Medication() {
    }
   public Medication(String medicationName ,String commonEffects){
       this.medicationName = medicationName;
       this.commonEffects = commonEffects;
       
   }
   public Medication(String medicationName ,  String commonEffects ,Form form, Unit unit) {
        this.medicationName = medicationName;
        this.unitMedicationPrescribed = unitMedicationPrescribed;
        this.commonEffects = commonEffects;
        this.form = form;
        this.unit = unit;
        this.gen = gen;
    }

   
    public String getMedicationName() {
        return medicationName;
    }

    public void setMedicationName(String medicationName) {
        this.medicationName = medicationName;
    }

   
    public int getUnitMedicationPrescribed() {
        return unitMedicationPrescribed;
    }

    public void setUnitMedicationPrescribed(int unitMedicationPrescribed) {
        this.unitMedicationPrescribed = unitMedicationPrescribed;
    }

    public int getMedQuantity() {
        return medQuantity;
    }

    public void setMedQuantity(int medQuantity) {
        this.medQuantity = medQuantity;
    }

    public String getCommonEffects() {
        return commonEffects;
    }

    public void setCommonEffects(String commonEffects) {
        this.commonEffects = commonEffects;
    }

    public Form getForm() {
        return form;
    }

    public void setForm(Form form) {
        this.form = form;
    }

    public Unit getUnit() {
        return unit;
    }

    public void setUnit(Unit unit) {
        this.unit = unit;
    }

    public Generic getGen() {
        return gen;
    }

    public void setGen(Generic gen) {
        this.gen = gen;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 31 * hash + Objects.hashCode(this.medicationName);
        hash = 31 * hash + this.unitMedicationPrescribed;
        hash = 31 * hash + this.medQuantity;
        hash = 31 * hash + Objects.hashCode(this.commonEffects);
        hash = 31 * hash + Objects.hashCode(this.form);
        hash = 31 * hash + Objects.hashCode(this.unit);
        hash = 31 * hash + Objects.hashCode(this.gen);
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
        final Medication other = (Medication) obj;
        if (this.unitMedicationPrescribed != other.unitMedicationPrescribed) {
            return false;
        }
        if (this.medQuantity != other.medQuantity) {
            return false;
        }
        if (!Objects.equals(this.medicationName, other.medicationName)) {
            return false;
        }
        if (!Objects.equals(this.commonEffects, other.commonEffects)) {
            return false;
        }
        if (!Objects.equals(this.form, other.form)) {
            return false;
        }
        if (!Objects.equals(this.unit, other.unit)) {
            return false;
        }
        if (!Objects.equals(this.gen, other.gen)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Medication{" + "medicationName=" + medicationName + ", unitMedicationPrescribed=" + unitMedicationPrescribed + ", medQuantity=" + medQuantity + ", commonEffects=" + commonEffects + ", form=" + form + ", unit=" + unit + ", gen=" + gen + '}';
    }
    

}
