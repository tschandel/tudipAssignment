package com.tudip.recruitmentapplication.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tudip.recruitmentapplication.dto.CandidateOutputDTO;
import com.tudip.recruitmentapplication.dto.RetrieveCandidateInputDTO;
import com.tudip.recruitmentapplication.service.ICandidateService;
import com.tudip.recruitmentapplication.unit.RetrieveCandidate;

@Service
public class ServiceImpl implements ICandidateService {

	@Autowired
	private RetrieveCandidate retrieveCandidate;

	@Override
	public List<CandidateOutputDTO> getCandidates(RetrieveCandidateInputDTO retrieveCandidateInputDTO) {
		return retrieveCandidate.getCandidates(retrieveCandidateInputDTO);
	}
}
