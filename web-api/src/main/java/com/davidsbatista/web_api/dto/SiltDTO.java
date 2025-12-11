
package com.davidsbatista.web_api.dto;

import java.time.Instant;
import java.util.UUID;

import com.davidsbatista.web_api.model.Silt;

import lombok.Data;

@Data
public class SiltDTO {
	private UUID id;
	private  String title;
	private String url;
	private String notes;
	private Instant createdAt;

	public static SiltDTO from(Silt silt){
		SiltDTO dto = new SiltDTO();
		dto.setId(silt.getId());
		dto.setTitle(silt.getTitle());
		dto.setUrl(silt.getUrl());
		dto.setNotes(silt.getNotes());
		dto.setCreatedAt(silt.getCreatedAt());
		return dto;
	}
}
