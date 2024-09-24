
package com.ecommercesolutions.repositories;

import com.ecommercesolutions.models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
