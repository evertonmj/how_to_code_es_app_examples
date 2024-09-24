
package com.kafkamanagement.repositories;

import com.kafkamanagement.models.Transfer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransferRepository extends JpaRepository<Transfer, Long> {
}
