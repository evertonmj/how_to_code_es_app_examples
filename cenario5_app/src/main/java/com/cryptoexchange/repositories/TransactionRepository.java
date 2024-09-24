
package com.cryptoexchange.repositories;

import com.cryptoexchange.models.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionRepository extends JpaRepository<Transaction, Long> {
}
