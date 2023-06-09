package za.co.mie.daoInterfaces;

import java.util.List;
import za.co.mie.model.Form;
import za.co.mie.model.Generic;
import za.co.mie.model.Medication;
import za.co.mie.model.Unit;

public interface MedicationDaoInterface {
    public List<Medication> getAllMedicationRecord();
    public List<Medication> patientRecord(int patientID);
    public boolean addMedication(Medication med);
    public boolean addUnit(Unit unit);
    public boolean addForm(Form form);
    public boolean addGeneric(Generic gen);
    
}

