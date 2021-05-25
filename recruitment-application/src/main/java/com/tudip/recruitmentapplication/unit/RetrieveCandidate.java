package com.tudip.recruitmentapplication.unit;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

import com.tudip.recruitmentapplication.customRepository.ICandidateCustomRepository;
import com.tudip.recruitmentapplication.dto.CandidateOutputDTO;
import com.tudip.recruitmentapplication.dto.RetrieveCandidateInputDTO;
import com.tudip.recruitmentapplication.model.Candidate;

@Component
public class RetrieveCandidate {

	@Autowired
	private ICandidateCustomRepository candidateCustomRepository;

	public List<CandidateOutputDTO> getCandidates(RetrieveCandidateInputDTO retrieveCandidateInputDTO) {

		String query = this.generateQuery(retrieveCandidateInputDTO);
		Integer startIndex = 0, noOfRecords = 5;

		if (Objects.nonNull(retrieveCandidateInputDTO.getPage())) {
			Integer page = Integer.valueOf(retrieveCandidateInputDTO.getPage());
			startIndex = (page - 1) * noOfRecords;
		}
		List<Candidate> candidates = candidateCustomRepository.retrieveCandidate(query, startIndex, noOfRecords);
		List<CandidateOutputDTO> candidateDtoList = this.assembleCandidateDTO(candidates);
		return candidateDtoList;
	}

	public String generateQuery(RetrieveCandidateInputDTO retrieveCandidateInputDTO) {

		StringBuilder query = new StringBuilder();
		query.append("select c from Candidate c ");

		if (Objects.nonNull(retrieveCandidateInputDTO.getSearchBy())) {
			query.append(" where ");
			if (retrieveCandidateInputDTO.getSearchBy().equals("Name"))
				query.append("lower(c.name) like lower('%" + retrieveCandidateInputDTO.getSearchByValue() + "%')");
			if (retrieveCandidateInputDTO.getSearchBy().equals("Phone Number"))
				query.append("lower(c.phoneNumber) like lower('%" + retrieveCandidateInputDTO.getSearchByValue() + "%')");
			if (retrieveCandidateInputDTO.getSearchBy().equals("Mail Id"))
				query.append("lower(c.maildId) like lower('%" + retrieveCandidateInputDTO.getSearchByValue() + "%')");
			if (retrieveCandidateInputDTO.getSearchBy().equals("Address"))
				query.append("lower(c.address) like lower('%" + retrieveCandidateInputDTO.getSearchByValue() + "%')");
		}

		if (Objects.nonNull(retrieveCandidateInputDTO.getSortBy())) {
			if (retrieveCandidateInputDTO.getSortBy().equals("Name"))
				query.append(" order by c.name");
			else if (retrieveCandidateInputDTO.getSortBy().equals("Phone Number"))
				query.append(" order by c.phoneNumber");
			else if (retrieveCandidateInputDTO.getSortBy().equals("Mail Id"))
				query.append(" order by c.maildId");
			else if (retrieveCandidateInputDTO.getSortBy().equals("Address"))
				query.append(" order by c.address");
		}
		return query.toString();
	}

	public List<CandidateOutputDTO> assembleCandidateDTO(List<Candidate> candidates) {

		List<CandidateOutputDTO> candidateDtoList = null;

		if(!CollectionUtils.isEmpty(candidates)) {
			candidateDtoList = new ArrayList<CandidateOutputDTO>();
			for (Candidate candidate : candidates) {
				CandidateOutputDTO candidateDTO = new CandidateOutputDTO();
				candidateDTO.setName(candidate.getName());
				candidateDTO.setMailId(candidate.getMaildId());
				candidateDTO.setAddress(candidate.getAddress());
				candidateDTO.setPhoneNumber(candidate.getPhoneNumber());
				candidateDtoList.add(candidateDTO);
			}
		}

		return candidateDtoList;
	}
}
