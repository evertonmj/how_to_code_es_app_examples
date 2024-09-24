
package com.ecommercesolutions.repositories;

import com.ecommercesolutions.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
