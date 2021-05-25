package com.tudip.recruitmentapplication.customRepositoryImpl;

import java.util.List;
import java.util.Objects;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.tudip.recruitmentapplication.customRepository.ICandidateCustomRepository;
import com.tudip.recruitmentapplication.model.Candidate;

@Repository
public class CandidateCustomRepositoryImpl implements ICandidateCustomRepository {

	@PersistenceContext
	private EntityManager em;

	@Override
	public List<Candidate> retrieveCandidate(String query, Integer startIndex, Integer noOfRecords) {
		Query generatedQuery = null;

		if (Objects.isNull(startIndex) && Objects.isNull(noOfRecords)) {
			generatedQuery = em.createQuery(query, Candidate.class);
		} else {
			generatedQuery = em.createQuery(query, Candidate.class).setFirstResult(startIndex)
					.setMaxResults(noOfRecords);
		}

		List<Candidate> list = (List<Candidate>) generatedQuery.getResultList();

		return list;
	}

}
