package hcp;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class IOCTest { 

	@Test
	public void test() {
		System.out.println(111);
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("springContext.xml");
		System.out.println(111);
		Student student1 = (Student)applicationContext.getBean("student1");
		Student student2 = (Student)applicationContext.getBean("student2");
		Student student3 = (Student)applicationContext.getBean("student3");
		Student student4 = (Student)applicationContext.getBean("student4");
		System.out.println(student1);
		System.out.println(student2);
		System.out.println(student3);
		System.out.println(student4);
	}

}
