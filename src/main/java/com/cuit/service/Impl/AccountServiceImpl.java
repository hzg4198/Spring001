package com.cuit.service.Impl;

import com.cuit.bean.Account;
import com.cuit.dao.AccountDao;
import com.cuit.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountServiceImpl implements AccountService {
	private AccountDao accountDao;

	@Autowired
	public void SetAccountDao(AccountDao accountDao){
		this.accountDao = accountDao;
	}

	@Override
	public List<Account> getAllAccounts() {
		return 	accountDao.getAllAccounts();
	}

	@Override
	public Account getAccountById(int id) {
		return 	accountDao.getAccountById(id);
	}

	@Override
	public int insertAccount(Account account) {
		return accountDao.insertAccount(account);
	}

	@Override
	public int updateAccount(Account account) {
		return accountDao.updateAccount(account);
	}

	@Override
	public int deleteAccount(int id) {
		return accountDao.deleteAccount(id);
	}
}
