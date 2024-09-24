
package com.softwarefactory.repositories;

import com.softwarefactory.models.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, Long> {
}
