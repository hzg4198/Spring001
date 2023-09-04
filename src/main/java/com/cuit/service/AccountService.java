package com.cuit.service;


import com.cuit.bean.Account;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface AccountService {
	List<Account> getAllAccounts();
	Account getAccountById(int id);
	int insertAccount(Account account);
	int updateAccount(Account account);
	int deleteAccount(int id);
}
