
package com.kafkamanagement.repositories;

import com.kafkamanagement.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
