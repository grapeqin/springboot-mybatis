package grape.learn.springboot.mybatis;

import grape.learn.springboot.mybatis.dao.UserDao;
import grape.learn.springboot.mybatis.service.UserService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.boot.test.autoconfigure.MybatisTest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@MybatisTest
@AutoConfigureTestDatabase(replace = Replace.NONE)
public class SpringbootWithRealDatabaseMybatisTests {

	@Autowired
	private UserDao userDao;

	@Autowired
	private UserService userService;

	@Test
	public void contextLoads() {
		Assert.assertEquals(3,userDao.findAllUsers().size());
		Assert.assertEquals(userDao.findbyId(1L).getName(),"老黄");
		Assert.assertEquals(userDao.findbyId(2L).getAge().intValue() ,30);

		userService.queryCustomers();
	}

}