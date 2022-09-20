package com.mytest;

import com.mytest.service.TestService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * <p>
 *
 * </P>
 *
 * @author Major Tom
 * @since 2022/9/7 21:00
 */
public class MyTestMain {
	public static void main(String[] args) {
		System.out.println("***********测试开始************");
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("com.mytest.service");
		TestService testService = context.getBean(TestService.class);
		testService.printTest();

		//MyClassPathXmlApplicationContext mc = new MyClassPathXmlApplicationContext("applicationContext.xml");

	}
}
