package com.example.learning.hospitalManagement;

import com.example.learning.hospitalManagement.dto.BloodGroupCountResponseEntity;
import com.example.learning.hospitalManagement.entity.Patient;
import com.example.learning.hospitalManagement.entity.type.BloodGroupType;
import com.example.learning.hospitalManagement.repository.PatientRepository;
import com.example.learning.hospitalManagement.service.PatientService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;

import java.time.LocalDate;
import java.util.List;

@SpringBootTest
public class PatientTests {

    @Autowired
    private PatientRepository patientRepository;

    @Autowired
    private PatientService patientService;

//    @Test
//    public void testPatientRepository() {
//        List<Patient> patientList = patientRepository.findAll();
//        System.out.println(patientList);
//
//        Patient patient = new Patient();
////        patientService.addPatient(patient);
//    }

    @Test
    public void testTransactionMethods() {

//        int rowsUpdated = patientRepository.updateNameWithId("John Smithh", 23L);
//        List<BloodGroupCountResponseEntity> bloodGroupCountResponseEntities = patientRepository.countEachBloodGroupType();
//
//        for(BloodGroupCountResponseEntity patient : bloodGroupCountResponseEntities) {
//            System.out.println(patient);
//        }

        Page<Patient> patientList = patientRepository.findAllPatients(PageRequest.of(1, 2, Sort.by("name")));

        for (Patient patient: patientList) {
            System.out.println(patient);
        }
    }

}
