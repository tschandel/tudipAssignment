package com.tudip.recruitmentapplication.service;

import java.util.List;

import com.tudip.recruitmentapplication.dto.CandidateOutputDTO;
import com.tudip.recruitmentapplication.dto.RetrieveCandidateInputDTO;

public interface ICandidateService {

	public List<CandidateOutputDTO> getCandidates(RetrieveCandidateInputDTO retrieveCandidateInputDTO);
}
