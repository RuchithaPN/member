package com.member.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.member.Client.AuthClient;
import com.member.Client.ClaimClient;
import com.member.Exception.ClaimNotFoundException;
import com.member.Exception.MemberNotFoundException;
import com.member.Exception.PolicyNotFoundException;
import com.member.Exception.TokenExpireException;
import com.member.Main.MemberPremium;
import com.member.Repository.MemberPremiumRepository;
import com.member.dto.Claim;
import com.member.dto.ClaimInput;

@Service
public class MemberService {
	@Autowired
	MemberPremiumRepository memberRepo;
	@Autowired
	ClaimClient claimClient;
	@Autowired
	AuthClient authClient;
	public MemberPremium viewBills(String memberId, String token) throws MemberNotFoundException, TokenExpireException {
		if(authClient.authorizeTheRequest(token)) {
		MemberPremium member = memberRepo.findById(memberId).orElse(null);
		if(member==null) {
			throw new MemberNotFoundException("Member not found");
		}
		else {
			return member;
		}
		}
		else {
			throw new TokenExpireException("Token is expired");
		}
	}
	
	public Claim getClaimStatus(Integer claimId) throws ClaimNotFoundException {
		Claim claim = ClaimClient.getClaimStatus(claimId);
		if(claim==null)
			throw new ClaimNotFoundException("Claim not found");
		else
			return claim;
	}
	public Claim submitClaim(ClaimInput claimInput) throws PolicyNotFoundException {
		Claim claim=ClaimClient.submitClaim(claimInput);
		return claim;
	}
	
	

}