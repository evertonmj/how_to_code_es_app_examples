
package com.ecommerce.drones.controllers;

import com.ecommerce.drones.models.Drone;
import com.ecommerce.drones.repositories.DroneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/drones")
public class DroneController {

    @Autowired
    private DroneRepository droneRepository;

    @GetMapping
    public List<Drone> listarTodosDrones() {
        return droneRepository.findAll();
    }

    @PostMapping
    public Drone criarDrone(@RequestBody Drone drone) {
        return droneRepository.save(drone);
    }
}
