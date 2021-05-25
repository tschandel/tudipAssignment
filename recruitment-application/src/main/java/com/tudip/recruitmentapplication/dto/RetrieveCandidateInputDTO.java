package com.tudip.recruitmentapplication.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@Builder
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class RetrieveCandidateInputDTO {

	private String searchBy;
	private String searchByValue;
	private String sortBy;
	private Integer page;
}
