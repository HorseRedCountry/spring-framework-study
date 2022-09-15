package com.mytest;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * <p>
 *
 * </P>
 *
 * @author Major Tom
 * @since 2022/9/14 12:28
 */
public class MyClassPathXmlApplicationContext extends ClassPathXmlApplicationContext {

	public MyClassPathXmlApplicationContext(String... configLocations) {
		super(configLocations);
	}

	@Override
	protected void initPropertySources() {
		System.out.println("扩展测试......");
		getEnvironment().setRequiredProperties("username");
	}
}
