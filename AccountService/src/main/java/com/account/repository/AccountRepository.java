package com.account.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.account.model.AccountModel;

public interface AccountRepository extends CrudRepository<AccountModel, Integer> {

	List<AccountModel> findAllByCustomerId(Integer customerId);

	List<AccountModel> findAllByAccountType(String accountType);

	List<AccountModel> findByBank(String bank);

	AccountModel findAccountByAccountId(Integer accountId);
}