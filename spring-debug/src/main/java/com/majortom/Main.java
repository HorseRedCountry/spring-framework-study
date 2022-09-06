package com.majortom;

import com.majortom.service.MyServiceTest;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * <p>
 *
 * </P>
 *
 * @author Major Tom
 * @since 2022/9/6 23:01
 */
public class Main {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("com.majortom.service");
		MyServiceTest bean = context.getBean(MyServiceTest.class);
		bean.print();
	}
}
