
package com.davidsbatista.web_api.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class CreateSiltDTO {

	@NotBlank
	private String title;

	@NotBlank
	private String url;

	private String notes;
}
