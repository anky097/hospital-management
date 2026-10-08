package com.example.learning.hospitalManagement;

import com.example.learning.hospitalManagement.entity.Patient;
import com.example.learning.hospitalManagement.repository.PatientRepository;
import com.example.learning.hospitalManagement.service.PatientService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;
import java.util.List;

@SpringBootTest
public class PatientTests {

    @Autowired
    private PatientRepository patientRepository;

    @Autowired
    private PatientService patientService;

    @Test
    public void testPatientRepository() {
        List<Patient> patientList = patientRepository.findAll();
        System.out.println(patientList);

        Patient patient = new Patient();
//        patientService.addPatient(patient);
    }

    @Test
    public void testTransactionMethods() {
        List<Patient> patient = patientRepository.findByBirthDateOrEmail(LocalDate.of(1995,5,12), "michael.brown@gmail.com");

        System.out.println(patient);
    }

}
