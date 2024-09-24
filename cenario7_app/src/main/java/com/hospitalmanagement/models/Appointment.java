
package com.hospitalmanagement.models;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
public class Appointment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private LocalDateTime appointmentDate;

    @ManyToOne
    private Doctor doctor;

    @ManyToOne
    private Patient patient;

    public Appointment() {}

    public Appointment(LocalDateTime appointmentDate, Doctor doctor, Patient patient) {
        this.appointmentDate = appointmentDate;
        this.doctor = doctor;
        this.patient = patient;
    }

    // Getters e Setters
}
