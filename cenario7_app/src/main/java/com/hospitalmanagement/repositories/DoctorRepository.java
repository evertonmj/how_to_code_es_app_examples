
package com.hospitalmanagement.repositories;

import com.hospitalmanagement.models.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DoctorRepository extends JpaRepository<Doctor, Long> {
}
