package com.org.runner;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.org.entity.Account;
import com.org.entity.BankAccount;
import com.org.service.BankService;

@Component
public class BankRunner implements CommandLineRunner {
	
	@Autowired
	private BankService bkser;
	
	@Override
	public void run(String... args) throws Exception {
		
		
		//saving the data
		/*BankAccount bkacc = new BankAccount();
		bkacc.setBranch("Guntur");
		bkacc.setHolderName("KavyaSri");
		
		Account acc = new Account();
		acc.setAccId(1224);
		acc.setAacType("Savings");
		acc.setAccNumb(1457237890L);
		
		bkacc.setAccount(acc);
		
		BankAccount result = bkser.addDetails(bkacc);
		System.out.println(result);*/
		
		//retreiving the data
		
		Account acc1 = new Account();
		acc1.setAccId(1224);
		acc1.setAacType("Savings");
		acc1.setAccNumb(1457237890L);
		
		Optional<BankAccount> bnkfetch=bkser.fetchDetails(acc1);
		System.out.println(bnkfetch.get());
	}

}
