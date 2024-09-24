
package com.hospitalmanagement.repositories;

import com.hospitalmanagement.models.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepository extends JpaRepository<Patient, Long> {
}
