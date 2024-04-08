package com.rest.mudah.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rest.mudah.model.Patient;
import com.rest.mudah.service.PatientService;

@RestController
@CrossOrigin(origins = "http://localhost:5173") // ini untuk koneksi ke front end
public class ClientController {
    
    // service
    @Autowired
    private PatientService patientService;

    @RequestMapping("/")
    public String hello_world(){
        return "hello world";
    }

    //  add patient
    @PostMapping("/add")
    public String addPatient(@RequestBody Patient patient){
        patientService.addPatient(patient);
        return "Patient Added Succefully";
    }

    // getPatientById
    @RequestMapping("/patient/{id}")
    public Patient getPatientById(@PathVariable("id") long id){
        return patientService.getPatientById(id);
    }

    // getPatients
    @RequestMapping("/patients")
    public List<Patient> getPatients(){
        return patientService.getPatients();
    }

    // updatePatient
    @RequestMapping("/patient")
    public Patient updatePatient(@RequestBody Patient patient){
        return patientService.updatePatient(patient);
    }

    // deletePatientById
    @DeleteMapping("/patient/{id}")
    public String deletePatient(@PathVariable("id") long id){
        patientService.deletePatient(id);
        return "Patient Deleted";
    }

}