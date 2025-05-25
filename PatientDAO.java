package dao;

import model.Patient;
import util.FileUtil;

import java.util.*;

public class PatientDAO {
    private List<Patient> patients = new ArrayList<>();

    public PatientDAO() {
        this.patients = FileUtil.loadPatients();
    }

    public List<Patient> getAllPatients() {
        return patients;
    }

    public void addPatient(Patient patient) {
        patients.add(patient);
        FileUtil.savePatients(patients);
    }

    public Patient getPatientById(int id) {
        for (Patient p : patients) {
            if (p.getId() == id) return p;
        }
        return null;
    }

    public boolean deletePatient(int id) {
        boolean removed = patients.removeIf(p -> p.getId() == id);
        if (removed) FileUtil.savePatients(patients);
        return removed;
    }

    public boolean updatePatient(Patient updated) {
        for (int i = 0; i < patients.size(); i++) {
            if (patients.get(i).getId() == updated.getId()) {
                patients.set(i, updated);
                FileUtil.savePatients(patients);
                return true;
            }
        }
        return false;
    }
}