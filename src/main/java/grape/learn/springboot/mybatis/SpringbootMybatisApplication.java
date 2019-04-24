package grape.learn.springboot.mybatis;

import org.mybatis.spring.annotation.MapperScan;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author grape
 * @date 2019/3/19
 * @description
 */
@SpringBootApplication
@MapperScan(value = "grape.learn.springboot.mybatis")
@ComponentScan(value = "grape.learn.springboot.mybatis")
public class SpringbootMybatisApplication {
}
