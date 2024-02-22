package com.org.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.org.entity.Account;
import com.org.entity.BankAccount;
import com.org.repo.AccountRepository;

@Service
public class BankImpl implements BankService {
	
	
	
	@Autowired
	AccountRepository repo;

	@Override
	public BankAccount addDetails(BankAccount accId) {
		BankAccount bkacc = repo.save(accId);
		return bkacc;
	}

	@Override
	public Optional<BankAccount> fetchDetails(Account account) {
	Optional<BankAccount> result=repo.findById(account);
		return result;
	}

	
	

}
