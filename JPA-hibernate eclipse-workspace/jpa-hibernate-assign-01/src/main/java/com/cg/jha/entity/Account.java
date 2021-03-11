package com.cg.jha.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="account")
public class Account {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "acc_num")
	private Long accountNumber;
	@Column(name="bank_name")
	private String bankName;
	@Column(name="branch_name")
	private String branchName;
	@Column
	private Long balance;
	public Account() {
		/* Default constructor */
	}
	public Account(String bankName, String branchName, Long balance) {
		super();
		
		this.bankName = bankName;
		this.branchName = branchName;
		this.balance = balance;
	}
	public Long getAccountNumber() {
		return accountNumber;
	}
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	public String getBranchName() {
		return branchName;
	}
	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}
	public Long getBalance() {
		return balance;
	}
	public void setBalance(Long balance) {
		this.balance = balance;
	}
	
	
}