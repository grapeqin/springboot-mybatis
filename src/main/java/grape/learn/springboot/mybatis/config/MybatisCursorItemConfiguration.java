package grape.learn.springboot.mybatis.config;

import grape.learn.springboot.mybatis.domain.User;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.batch.MyBatisCursorItemReader;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Service;

/**
 *
 * @author grape
 * @date 2019/4/24
 */
@Configuration
@Service
public class MybatisCursorItemConfiguration {

	@Autowired
	private SqlSessionFactory sqlSessionFactory;

	@Bean
	MyBatisCursorItemReader<User> myBatisCursorItemReader(){
		MyBatisCursorItemReader myBatisCursorItemReader = new MyBatisCursorItemReader();
		myBatisCursorItemReader.setSqlSessionFactory(sqlSessionFactory);
		myBatisCursorItemReader.setQueryId("grape.learn.springboot.mybatis.dao.UserDao.findAllUsers");
		return myBatisCursorItemReader;
	}

}
