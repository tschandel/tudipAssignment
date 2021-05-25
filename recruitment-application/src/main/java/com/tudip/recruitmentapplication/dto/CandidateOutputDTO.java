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
public class CandidateOutputDTO {

	private String name;
	private String phoneNumber;
	private String mailId;
	private String address;
}
