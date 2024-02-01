package com.member.dto;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class ClaimInput {
	
	private String policyBenefits;
	private String hospitalName;
	private Integer benefitsAvailed;
	private Integer amount;
	private Integer policyId;
	private String policyName;
	public String getPolicyBenefits() {
		return policyBenefits;
	}
	public void setPolicyBenefits(String policyBenefits) {
		this.policyBenefits = policyBenefits;
	}
	public String getHospitalName() {
		return hospitalName;
	}
	public void setHospitalName(String hospitalName) {
		this.hospitalName = hospitalName;
	}
	public Integer getBenefitsAvailed() {
		return benefitsAvailed;
	}
	public void setBenefitsAvailed(Integer benefitsAvailed) {
		this.benefitsAvailed = benefitsAvailed;
	}
	public Integer getAmount() {
		return amount;
	}
	public void setAmount(Integer amount) {
		this.amount = amount;
	}
	public Integer getPolicyId() {
		return policyId;
	}
	public void setPolicyId(Integer policyId) {
		this.policyId = policyId;
	}
	public String getPolicyName() {
		return policyName;
	}
	public void setPolicyName(String policyName) {
		this.policyName = policyName;
	}

}
