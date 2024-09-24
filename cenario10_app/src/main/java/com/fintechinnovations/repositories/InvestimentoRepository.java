
package com.fintechinnovations.repositories;

import com.fintechinnovations.models.Investimento;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InvestimentoRepository extends JpaRepository<Investimento, Long> {
}
