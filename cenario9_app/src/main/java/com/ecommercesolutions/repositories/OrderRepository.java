
package com.ecommercesolutions.repositories;

import com.ecommercesolutions.models.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
