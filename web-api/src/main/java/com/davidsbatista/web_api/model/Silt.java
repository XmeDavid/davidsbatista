package com.davidsbatista.web_api.model;

import java.time.Instant;
import java.util.UUID;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "silts")
public class Silt {
	
	@Id
	@GeneratedValue(generator = "UUID")
	private UUID id;

	private String title;

	private String url;

	private String notes;
	
	@Column(name = "created_at", nullable = false, updatable = false)
	@CreationTimestamp
	private Instant createdAt;
}
