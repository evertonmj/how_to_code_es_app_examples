
package com.ecommerce.drones.repositories;

import com.ecommerce.drones.models.Drone;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DroneRepository extends JpaRepository<Drone, Long> {
}
