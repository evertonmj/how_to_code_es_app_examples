
package com.softwarefactory.repositories;

import com.softwarefactory.models.Project;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectRepository extends JpaRepository<Project, Long> {
}
