package com.customer.service;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.customer.model.Account;

@FeignClient(name="account-service")
public interface AccountService {
	
	@GetMapping(value = "/account/customer/{customer}")
	List<Account> findByCustomer (@PathVariable("customer") Integer customer);
	
}
