package com.cuit.config;


import com.cuit.bean.Account;
import com.cuit.dao.AccountDao;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.context.annotation.*;

import java.io.IOException;
import java.io.InputStream;

@Configuration
@PropertySource("classpath:jdbc.properties")
@ComponentScan("com.cuit")
@Import({JdbcConfig.class, MybatisConfig.class})
@EnableAspectJAutoProxy
public class SpringConfig {

}
