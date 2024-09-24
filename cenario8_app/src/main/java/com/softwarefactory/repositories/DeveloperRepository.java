
package com.softwarefactory.repositories;

import com.softwarefactory.models.Developer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DeveloperRepository extends JpaRepository<Developer, Long> {
}
