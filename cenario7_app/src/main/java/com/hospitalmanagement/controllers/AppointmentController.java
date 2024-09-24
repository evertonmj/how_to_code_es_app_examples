
package com.hospitalmanagement.controllers;

import com.hospitalmanagement.models.Appointment;
import com.hospitalmanagement.repositories.AppointmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/appointments")
public class AppointmentController {

    @Autowired
    private AppointmentRepository appointmentRepository;

    @GetMapping
    public List<Appointment> listarTodasConsultas() {
        return appointmentRepository.findAll();
    }

    @PostMapping
    public Appointment criarConsulta(@RequestBody Appointment appointment) {
        return appointmentRepository.save(appointment);
    }
}
