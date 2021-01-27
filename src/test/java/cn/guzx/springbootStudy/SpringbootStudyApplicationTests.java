package cn.guzx.springbootStudy;

import cn.guzx.bean.Person;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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

	Logger logger = LoggerFactory.getLogger(getClass());

	@Test
	void testPerson(){
//		System.out.println(person);
		logger.trace("trance");
		logger.warn("logging");
	}

	@Test
	void contextLoads() {
		System.out.println(chineseTest);
	}

}
