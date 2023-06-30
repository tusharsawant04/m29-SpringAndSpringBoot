package org.tnsif.object;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DIUsingObjectsExecutor {

	public static void main(String[] args) {
		ApplicationContext a = new ClassPathXmlApplicationContext("objects.xml");

	}
}
