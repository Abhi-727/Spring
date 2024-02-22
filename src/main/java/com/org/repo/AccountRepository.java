package com.org.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.org.entity.Account;
import com.org.entity.BankAccount;

public interface AccountRepository extends JpaRepository<BankAccount, Account> {


}
