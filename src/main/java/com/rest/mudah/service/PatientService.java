package com.rest.mudah.service;

import org.springframework.stereotype.Service;
import com.rest.mudah.model.Patient;
import java.util.List;

@Service
public interface PatientService {
    public Patient  addPatient(Patient patient);
    public Patient getPatientById(long id);
    public List<Patient> getPatients();
    public void deletePatient(long id);
    public Patient updatePatient(Patient patient);

}