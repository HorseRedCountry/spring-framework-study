package com.mytest;

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
		//AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("com.mytest.service");
		//TestService testService = context.getBean(TestService.class);
		//testService.printTest();

		MyClassPathXmlApplicationContext mc = new MyClassPathXmlApplicationContext("applicationContext.xml");

	}
}
