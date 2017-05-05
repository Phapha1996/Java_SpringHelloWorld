package test;

import java.io.InputStream;

import itf.BusinessService;

import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {

	@Test
	public void test1(){
		BeanFactory factory = new ClassPathXmlApplicationContext("applicationContext.xml");
		BusinessService bs = (BusinessService) factory.getBean("hello");
		String s = bs.printll("my first spring program");
		System.out.println(s);
	}
	
	
}
