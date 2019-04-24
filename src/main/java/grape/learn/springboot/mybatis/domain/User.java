package grape.learn.springboot.mybatis.domain;

import java.time.Instant;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * @author grape
 * @date 2019/3/18
 * @description
 */
@Getter
@Setter
@NoArgsConstructor
@ToString
public class User {
	
	private Long id;

	private String name;

	private Integer age;

	private Instant createTime;

	private Instant updateTime;
}
