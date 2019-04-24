package grape.learn.springboot.mybatis.service;

import java.util.ArrayList;
import java.util.List;

import grape.learn.springboot.mybatis.domain.User;
import lombok.extern.slf4j.Slf4j;
import org.mybatis.spring.batch.MyBatisCursorItemReader;

import org.springframework.batch.item.ExecutionContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author grape
 * @date 2019/4/24
 */
@Service
@Slf4j
public class UserService {

	@Autowired
	private MyBatisCursorItemReader<User> myBatisCursorItemReader;

	public List<User> queryCustomers(){
		List<User> customers = new ArrayList<>(10);
		try{
			myBatisCursorItemReader.open(new ExecutionContext());
			User customer;
			while ((customer = myBatisCursorItemReader.read())!=null){
				log.info("User:"+customer.toString());
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			myBatisCursorItemReader.close();
		}
		return customers;
	}
}
