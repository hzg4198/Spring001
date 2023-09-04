package com.cuit.dao;

import com.cuit.bean.Account;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface AccountDao {
	@Select("SELECT * FROM account")
	List<Account> getAllAccounts();
	@Select("SELECT * FROM account WHERE id = #{id}")
	Account getAccountById(int id);
	@Insert("INSERT INTO account (name, money) VALUES (#{name}, #{money})")
	int insertAccount(Account account);
	@Update("UPDATE account SET name = #{name}, money = #{money} WHERE id = #{id}")
	int updateAccount(Account account);
	@Delete("DELETE FROM account WHERE id = #{id}")
	int deleteAccount(int id);
}
