package org.fage.test;

import org.fage.service.UserService;
import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestClass {
		
	
	@Test
	public void testIOC(){
		/*
		 * �õ���BeanFactory�����ַ�ʽ��
		 * (1)ͨ��ϵͳ·��ʵ����
		 * 	  Resource resource = FileSystemResource("sre\\applicationContext.xml");
		 * 	  BeanFactory factory = new XmlBeanFactory(resource);
		 * 
		 * (2)����ClassPathʵ����
		 * 	  ClassPathResource resource = new ClassPathResource("applicationContext.xml");
		 * 	  BeanFactory factory = new XmlBeanFactory(resource);
		 * 
		 * (3)Ӧ��������ʵ����
		 * 	  ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		 * 	  
		 */
		
		
		BeanFactory factory = new ClassPathXmlApplicationContext("applicationContext.xml");
		UserService userService = (UserService) factory.getBean("userService");
		userService.addUser();
		userService.show();
		
		
		
	}
}
