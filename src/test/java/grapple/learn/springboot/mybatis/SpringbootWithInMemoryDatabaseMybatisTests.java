package grapple.learn.springboot.mybatis;

import grapple.learn.springboot.mybatis.dao.UserDao;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.boot.test.autoconfigure.MybatisTest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@MybatisTest
@ActiveProfiles("test")
public class SpringbootWithInMemoryDatabaseMybatisTests {

	@Autowired
	private UserDao userDao;

	@Test
	public void contextLoads() {
		Assert.assertEquals(3,userDao.findAllUsers().size());
		Assert.assertEquals(userDao.findbyId(1L).getName(),"老黄");
		Assert.assertEquals(userDao.findbyId(2L).getAge().intValue() ,30);
	}

}