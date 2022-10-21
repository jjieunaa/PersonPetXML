package com.kwhangan2.sample;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import lombok.Setter;
import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class XMLTest {
	
	@Setter(onMethod_ = { @Autowired })
	private Person person;
	
	@Test
	public void testExist() {
		
		assertNotNull(person);
		
		person.setName("이지은");
		person.setAge(24);
		person.getPet().setName("단지");
		person.getPet().setAge(9);
		
		log.info(person);
		log.info("---------------------");
		log.info(person.getPet());
		
		log.info(person.getAge() + "살인 " + person.getName() + "이 " + person.getPet().getAge() + "살인 " + person.getPet().getName() + "를 키웁니다!");
		
	}
}
