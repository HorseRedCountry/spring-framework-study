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
public class main {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("com.mytest.service");
		TestService testService = context.getBean(TestService.class);
		testService.printTest();
	}
}
