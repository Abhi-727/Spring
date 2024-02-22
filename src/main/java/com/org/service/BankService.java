package com.org.service;

import java.util.Optional;

import com.org.entity.Account;
import com.org.entity.BankAccount;

public interface BankService {
	
	public BankAccount addDetails(BankAccount accId);
	
	public Optional<BankAccount> fetchDetails(Account account);
	
	
}
