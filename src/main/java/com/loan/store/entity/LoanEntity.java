package com.loan.store.entity;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class LoanEntity {
	
	@Id
	private int id;
	
	private String loanId;
	
	private String customerId;
	
	private String lenderId;
	
	private int amount;
	
	private int remainingAmount;
	
	private LocalDate paymentDate;
	
	private int interestPerDay;
	
	private LocalDate dueDate;
	
	private float penaltyPerDay;
	
	private String cancel;

	public String getLoanId() {
		return loanId;
	}

	public void setLoanId(String loanId) {
		this.loanId = loanId;
	}

	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public String getLenderId() {
		return lenderId;
	}

	public void setLenderId(String lenderId) {
		this.lenderId = lenderId;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public int getRemainingAmount() {
		return remainingAmount;
	}

	public void setRemainingAmount(int remainingAmount) {
		this.remainingAmount = remainingAmount;
	}

	public LocalDate getPaymentDate() {
		return paymentDate;
	}

	public void setPaymentDate(LocalDate paymentDate) {
		this.paymentDate = paymentDate;
	}

	public int getInterestPerDay() {
		return interestPerDay;
	}

	public void setInterestPerDay(int interestPerDay) {
		this.interestPerDay = interestPerDay;
	}

	public LocalDate getDueDate() {
		return dueDate;
	}

	public void setDueDate(LocalDate dueDate) {
		this.dueDate = dueDate;
	}

	public float getPenaltyPerDay() {
		return penaltyPerDay;
	}

	public void setPenaltyPerDay(float penaltyPerDay) {
		this.penaltyPerDay = penaltyPerDay;
	}

	public String getCancel() {
		return cancel;
	}

	public void setCancel(String cancel) {
		this.cancel = cancel;
	}

	@Override
	public String toString() {
		return "LoanEntity [loanId=" + loanId + ", customerId=" + customerId + ", lenderId=" + lenderId + ", amount="
				+ amount + ", remainingAmount=" + remainingAmount + ", paymentDate=" + paymentDate + ", interestPerDay="
				+ interestPerDay + ", dueDate=" + dueDate + ", penaltyPerDay=" + penaltyPerDay + ", cancel=" + cancel
				+ "]";
	}
	
	
	
	

}
