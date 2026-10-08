package com.example.learning.hospitalManagement.service;

import com.example.learning.hospitalManagement.entity.Patient;
import com.example.learning.hospitalManagement.repository.PatientRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PatientService {

    @Autowired
    private PatientRepository patientRepository;

    @Transactional
    public Patient getPatientById(Long id) {
        Patient p1 = patientRepository.findById(id).orElseThrow();
        Patient p2 = patientRepository.findById(id).orElseThrow();

//        p1.setName("abcd");

        return p1;
    }

    @Transactional
    public void addPatient(Patient patient) {
        patientRepository.save(patient);
    }
}
