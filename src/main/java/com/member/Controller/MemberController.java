package com.member.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import com.member.Exception.ClaimNotFoundException;
import com.member.Exception.MemberNotFoundException;
import com.member.Exception.PolicyNotFoundException;
import com.member.Exception.TokenExpireException;
import com.member.Main.MemberPremium;
import com.member.Service.MemberService;
import com.member.dto.Claim;
import com.member.dto.ClaimInput;

@CrossOrigin(origins = "http://localhost:4200")
@RestController

public class MemberController {
	@Autowired
	MemberService service;
	@GetMapping(value= "/viewbills/{memberId}")
	public MemberPremium viewBills(@PathVariable("memberId") String memberId) throws MemberNotFoundException, TokenExpireException {
		return service.viewBills(memberId, memberId);
	}
	@GetMapping(value="/getclaimstatus/{claimId}")
	public Claim getClaimStatus(@PathVariable("claimId") Integer claimId) throws ClaimNotFoundException {
		return service.getClaimStatus(claimId);
	}
	@PostMapping(value="/submitclaim")
	public Claim submitClaim(@RequestBody ClaimInput claim) throws PolicyNotFoundException {
		return service.submitClaim(claim);
	}
}