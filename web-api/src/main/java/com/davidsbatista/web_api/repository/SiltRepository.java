
package com.davidsbatista.web_api.repository;

import java.util.UUID;

import com.davidsbatista.web_api.model.Silt;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SiltRepository extends JpaRepository<Silt, UUID>{
	// Add needed methods later on
}
