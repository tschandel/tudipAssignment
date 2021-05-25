package com.tudip.recruitmentapplication.customRepository;

import java.util.List;

import com.tudip.recruitmentapplication.model.Candidate;

public interface ICandidateCustomRepository {

	List<Candidate> retrieveCandidate(String query, Integer startIndex, Integer noOfRecords);

}
