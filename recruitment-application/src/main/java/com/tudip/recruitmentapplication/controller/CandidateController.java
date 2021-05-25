package com.tudip.recruitmentapplication.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.tudip.recruitmentapplication.dto.CandidateOutputDTO;
import com.tudip.recruitmentapplication.dto.RetrieveCandidateInputDTO;
import com.tudip.recruitmentapplication.service.ICandidateService;

@RestController
@RequestMapping("/candidate")
public class CandidateController {

	@Autowired
	private ICandidateService service;

	// Generally I use ResponseEntity for returning the API result but here as I
	// had to use thymeleaf so I used ModelAndView.
	@PostMapping("/all")
	@ResponseBody
	public ModelAndView getAllCandidatesList(RetrieveCandidateInputDTO retrieveCandidateInputDTO) {
		System.out.println(retrieveCandidateInputDTO);
		List<CandidateOutputDTO> candidateDtoList = service.getCandidates(retrieveCandidateInputDTO);
		ModelAndView mv = new ModelAndView();
		mv.setViewName("index");
		// mv.addObject("totalPages", candidateDtoList.size());
		mv.addObject("candidateDtoList", candidateDtoList);
		mv.addObject("retrieveCandidateInputDTO", retrieveCandidateInputDTO);
		return mv;
	}
}
