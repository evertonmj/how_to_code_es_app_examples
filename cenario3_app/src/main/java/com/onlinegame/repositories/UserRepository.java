
package com.onlinegame.repositories;

import com.onlinegame.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
