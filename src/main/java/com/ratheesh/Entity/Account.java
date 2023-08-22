package com.ratheesh.Entity;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;

@Entity
public class Account {
	
	private String holdername;
	private String branch;
	

	@EmbeddedId
	private AccountPK accountpk;


	public String getHoldername() {
		return holdername;
	}


	public void setHoldername(String holdername) {
		this.holdername = holdername;
	}


	public String getBranch() {
		return branch;
	}


	public void setBranch(String branch) {
		this.branch = branch;
	}


	public AccountPK getAccountpk() {
		return accountpk;
	}


	public void setAccountpk(AccountPK accountpk) {
		this.accountpk = accountpk;
	}


	@Override
	public String toString() {
		return "Account [holdername=" + holdername + ", branch=" + branch + ", accountpk=" + accountpk + "]";
	}
	
	
	
}
