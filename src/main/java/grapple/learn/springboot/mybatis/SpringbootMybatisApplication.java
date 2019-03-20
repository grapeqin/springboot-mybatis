package grapple.learn.springboot.mybatis;

import org.mybatis.spring.annotation.MapperScan;

import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author grapple
 * @date 2019/3/19
 * @description
 */
@SpringBootApplication
@MapperScan(value = "grapple.learn.springboot.mybatis")
public class SpringbootMybatisApplication {
}
