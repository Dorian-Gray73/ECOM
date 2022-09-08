package com.org.ecom.repository;

import com.org.ecom.domain.LigneTransaction;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;

/**
 * Spring Data JPA repository for the LigneTransaction entity.
 */
@SuppressWarnings("unused")
@Repository
public interface LigneTransactionRepository extends JpaRepository<LigneTransaction, Long> {}
