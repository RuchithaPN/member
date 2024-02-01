package com.member.Main;

import java.time.LocalDate;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
//@AllArgsConstructor
@Setter
@Getter
@Table (name="MemberPremium")
public class MemberPremium {
	@Id
	private String memberId;
	private Integer premiumDue;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDate lastPaidDate;
	private Integer policyId;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDate dueDate;
	private String paymentDetails;
	public String getMemberId() {
		return memberId;
	}
	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}
	public Integer getPremiumDue() {
		return premiumDue;
	}
	public void setPremiumDue(Integer premiumDue) {
		this.premiumDue = premiumDue;
	}
	public LocalDate getLastPaidDate() {
		return lastPaidDate;
	}
	public void setLastPaidDate(LocalDate lastPaidDate) {
		this.lastPaidDate = lastPaidDate;
	}
	public Integer getPolicyId() {
		return policyId;
	}
	public void setPolicyId(Integer policyId) {
		this.policyId = policyId;
	}
	public LocalDate getDueDate() {
		return dueDate;
	}
	public void setDueDate(LocalDate dueDate) {
		this.dueDate = dueDate;
	}
	public String getPaymentDetails() {
		return paymentDetails;
	}
	public void setPaymentDetails(String paymentDetails) {
		this.paymentDetails = paymentDetails;
	}
	

}
