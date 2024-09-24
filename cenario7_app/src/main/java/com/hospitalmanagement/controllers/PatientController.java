
package com.hospitalmanagement.controllers;

import com.hospitalmanagement.models.Patient;
import com.hospitalmanagement.repositories.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/patients")
public class PatientController {

    @Autowired
    private PatientRepository patientRepository;

    @GetMapping
    public List<Patient> listarTodosPacientes() {
        return patientRepository.findAll();
    }

    @PostMapping
    public Patient criarPaciente(@RequestBody Patient patient) {
        return patientRepository.save(patient);
    }
}
