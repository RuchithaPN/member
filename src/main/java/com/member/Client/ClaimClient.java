package com.member.Client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.member.Exception.ClaimNotFoundException;
import com.member.Exception.PolicyNotFoundException;
import com.member.dto.Claim;
import com.member.dto.ClaimInput;

@FeignClient(name = "Claim-Micro",url = "http://localhost:8430/claim")
public interface ClaimClient {
	
	@GetMapping(value="/getclaimstatus/{claimId}")
	public static Claim getClaimStatus(@PathVariable("claimId") Integer claimId) throws ClaimNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	@PostMapping(value="/submitclaim")
	public static Claim submitClaim(@RequestBody ClaimInput claim) throws PolicyNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}
}
