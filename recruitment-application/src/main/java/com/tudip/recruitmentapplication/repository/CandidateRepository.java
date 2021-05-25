package com.tudip.recruitmentapplication.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.tudip.recruitmentapplication.model.Candidate;

@Repository
public interface CandidateRepository extends JpaRepository<Candidate, Integer> {

	@Query("select c from Candidate c where c.name= :seachBy order by c.name")
	public List<Candidate> findByCandidatesBySeachAndSort(@Param("seachBy") String seachBy);

}
