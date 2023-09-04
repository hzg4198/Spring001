import com.cuit.bean.Account;
import com.cuit.config.SpringConfig;
import com.cuit.dao.AccountDao;
import com.cuit.service.AccountService;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SpringConfig.class)
public class mybatisTest {

	@Autowired
	private AccountService accountService;

	@Test
	public void f1() throws IOException {
		String resource = "mybatis-config.xml.bak";
		InputStream resourceAsStream = Resources.getResourceAsStream(resource);
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsStream);

		SqlSession sqlSession = sqlSessionFactory.openSession();

		AccountDao accountDao = sqlSession.getMapper(AccountDao.class);
		List<Account> allAccounts = accountDao.getAllAccounts();
		for (Account allAccount : allAccounts) {
//			System.out.println(allAccount);
		}

		Account accountById = accountDao.getAccountById(2);
		System.out.println(accountById);

	}

	@Test
	public void f2(){
		ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
		AccountService accountService = context.getBean(AccountService.class);
		List<Account> allAccounts = accountService.getAllAccounts();
		for (Account allAccount : allAccounts) {
			System.out.println(allAccount);
		}
	}

	@Test
	public void f3(){
		List<Account> allAccounts = accountService.getAllAccounts();
		for (Account allAccount : allAccounts) {
			System.out.println(allAccount);
		}
	}

	@Test
	public void testBookService(){
	}
}
