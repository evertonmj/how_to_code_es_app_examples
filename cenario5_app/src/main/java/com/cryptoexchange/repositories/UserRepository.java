
package com.cryptoexchange.repositories;

import com.cryptoexchange.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
