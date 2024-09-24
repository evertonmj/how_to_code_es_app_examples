
package com.hospitalmanagement.controllers;

import com.hospitalmanagement.models.Doctor;
import com.hospitalmanagement.repositories.DoctorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/doctors")
public class DoctorController {

    @Autowired
    private DoctorRepository doctorRepository;

    @GetMapping
    public List<Doctor> listarTodosMedicos() {
        return doctorRepository.findAll();
    }

    @PostMapping
    public Doctor criarMedico(@RequestBody Doctor doctor) {
        return doctorRepository.save(doctor);
    }
}
