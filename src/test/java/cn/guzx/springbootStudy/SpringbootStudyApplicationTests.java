package cn.guzx.springbootStudy;

import cn.guzx.bean.Person;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringbootStudyApplicationTests {

	@Autowired
	Person person;

	@Value("${test}")
	String test;

	@Value("${chineseTest}")
	String chineseTest;

	@Test
	void testPerson(){
		System.out.println(person);
	}

	@Test
	void contextLoads() {
		System.out.println(chineseTest);
	}

}
