package za.co.mie.model;
import java.util.Date;
import java.util.Objects;

public class Prescription {
   private String expDate; 
   private int numOfAthorizedRefills;
   private int unitsPerPriscription;
   private Medication medication;
   private Physician physician;
   private String dateIssued;
 public Prescription(String expDate, int numOfAthorizedRefills, int unitsPerPriscription,String dateIssued){
     this.expDate = expDate;
      this.numOfAthorizedRefills = numOfAthorizedRefills;
      this.unitsPerPriscription = unitsPerPriscription;
      this.dateIssued =dateIssued;
 }
    public Prescription(String expDate, int numOfAthorizedRefills, int unitsPerPriscription , Medication medication, Physician physician) {
        this.expDate = expDate;
        this.numOfAthorizedRefills = numOfAthorizedRefills;
        this.unitsPerPriscription = unitsPerPriscription;
        this.medication = medication;
        this.physician = physician;
    }

    public Prescription() {
    }
    public void setMedication(Medication medication){
        this.medication = medication;
    }
    public Medication getMedication(){
       return medication;
    }
    public String getExpDate() {
        return expDate;
    }
 public void setPhysician(Physician phyisician){
       this.physician = physician;
    }
    public Physician getPhysician(){
       return physician;
      }
 
    /**
     * @param expDate the expDate to set
     */
    public void setExpDate(String expDate) {
        this.expDate = expDate;
    }

    /**
     * @return the numOfAthorizedRefills
     */
    public int getNumOfAthorizedRefills() {
        return numOfAthorizedRefills;
    }

    /**
     * @param numOfAthorizedRefills the numOfAthorizedRefills to set
     */
    public void setNumOfAthorizedRefills(int numOfAthorizedRefills) {
        this.numOfAthorizedRefills = numOfAthorizedRefills;
    }

    /**
     * @return the unitsPerPriscription
     */
    public int getUnitsPerPriscription() {
        return unitsPerPriscription;
    }

    /**
     * @param unitsPerPriscription the unitsPerPriscription to set
     */
    public void setUnitsPerPriscription(int unitsPerPriscription) {
        this.unitsPerPriscription = unitsPerPriscription;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.expDate);
        hash = 97 * hash + this.numOfAthorizedRefills;
        hash = 97 * hash + this.unitsPerPriscription;
        hash = 97 * hash + Objects.hashCode(this.medication);
        hash = 97 * hash + Objects.hashCode(this.physician);
        hash = 97 * hash + Objects.hashCode(this.dateIssued);
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
        final Prescription other = (Prescription) obj;
        if (this.numOfAthorizedRefills != other.numOfAthorizedRefills) {
            return false;
        }
        if (this.unitsPerPriscription != other.unitsPerPriscription) {
            return false;
        }
        if (!Objects.equals(this.expDate, other.expDate)) {
            return false;
        }
        if (!Objects.equals(this.dateIssued, other.dateIssued)) {
            return false;
        }
        if (!Objects.equals(this.medication, other.medication)) {
            return false;
        }
        if (!Objects.equals(this.physician, other.physician)) {
            return false;
        }
        return true;
    }

    public String getDateIssued() {
        return dateIssued;
    }

    public void setDateIssued(String dateIssued) {
        this.dateIssued = dateIssued;
    }

    @Override
    public String toString() {
        return "Prescription{" + "expDate=" + expDate + ", numOfAthorizedRefills=" + numOfAthorizedRefills + ", unitsPerPriscription=" + unitsPerPriscription + ", medication=" + medication + ", physician=" + physician + ", dateIssued=" + dateIssued + '}';
    }
   
   
}
