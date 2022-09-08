package com.org.ecom.repository;

import com.org.ecom.domain.Caracteristique;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;

/**
 * Spring Data JPA repository for the Caracteristique entity.
 */
@SuppressWarnings("unused")
@Repository
public interface CaracteristiqueRepository extends JpaRepository<Caracteristique, Long> {}
