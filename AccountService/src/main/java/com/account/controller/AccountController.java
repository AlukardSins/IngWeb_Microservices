package com.account.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.account.model.AccountModel;
import com.account.repository.AccountRepository;

@RestController
public class AccountController {
	
	@Autowired
	AccountRepository accountRepository;
	
	@PostMapping(value = "/account")
	public AccountModel save (@RequestBody AccountModel account){
		return accountRepository.save(account);
	}
	
	@GetMapping(value = "/account")
	public Iterable<AccountModel> all (){
		return accountRepository.findAll();
	}
	
	@GetMapping(value = "/account/{accountId}")
	public AccountModel findByAccountId (@PathVariable Integer accountId){
		return accountRepository.findAccountByAccountId(accountId);
	}
	
	@PutMapping(value = "/account")
	public AccountModel update (@RequestBody AccountModel account){
		return accountRepository.save(account);
	}
	
	@DeleteMapping(value = "/account")
	public void delete (@RequestBody AccountModel account){
		accountRepository.delete(account);
	}
	
	@GetMapping(value = "/account/account-type/{type}")
	public List<AccountModel> findByAccountType (@PathVariable String type){
		return accountRepository.findAllByAccountType(type);
	}
	
	@GetMapping(value = "/account/bank/{bank}")
	public List<AccountModel> findByBank (@PathVariable String bank){
		return accountRepository.findByBank(bank);
	}
	
	@GetMapping(value = "/account/customer/{customer}")
	public List<AccountModel> findByCutomer (@PathVariable Integer customer){
		return accountRepository.findAllByCustomerId(customer);
	}
}