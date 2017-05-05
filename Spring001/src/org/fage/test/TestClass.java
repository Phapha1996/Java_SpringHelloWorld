package org.fage.test;

import org.fage.service.UserService;
import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestClass {
		
	
	@Test
	public void testIOC(){
		/*
		 * 得到化BeanFactory的三种方式：
		 * (1)通过系统路径实例化
		 * 	  Resource resource = FileSystemResource("sre\\applicationContext.xml");
		 * 	  BeanFactory factory = new XmlBeanFactory(resource);
		 * 
		 * (2)查找ClassPath实例化
		 * 	  ClassPathResource resource = new ClassPathResource("applicationContext.xml");
		 * 	  BeanFactory factory = new XmlBeanFactory(resource);
		 * 
		 * (3)应用上下文实例化
		 * 	  ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		 * 	  
		 */
		
		
		BeanFactory factory = new ClassPathXmlApplicationContext("applicationContext.xml");
		UserService userService = (UserService) factory.getBean("userService");
		userService.addUser();
		userService.show();
		
		
		
	}
}
