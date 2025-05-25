package service;

import dao.PatientDAO;
import model.Patient;

import java.util.List;

public class PatientService {
    private PatientDAO dao = new PatientDAO();

    public void addPatient(Patient p) {
        dao.addPatient(p);
    }

    public List<Patient> getAllPatients() {
        return dao.getAllPatients();
    }

    public Patient getPatientById(int id) {
        return dao.getPatientById(id);
    }

    public boolean updatePatient(Patient p) {
        return dao.updatePatient(p);
    }

    public boolean deletePatient(int id) {
        return dao.deletePatient(id);
    }
}