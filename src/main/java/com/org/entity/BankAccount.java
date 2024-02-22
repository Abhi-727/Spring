package com.org.entity;

import java.io.Serializable;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import lombok.Data;

@Entity
@Data
public class BankAccount /*implements Serializable*/ {		//impl serializable interface to support compositeprimary keys 
	
	 private String holderName;
	 private String branch;
	 
	 @EmbeddedId
	 private Account account;

	@Override
	public String toString() {
		return "BankAccount [holderName=" + holderName + ", branch=" + branch + ", accountpk=" + account + "]";
	}
	 
	 
}
