package org.tnsif.autowirednode;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApplication {

	public static void main(String[] args) {
		
		ApplicationContext a=new  ClassPathXmlApplicationContext("bean.xml");
		TextEditor t=(TextEditor) a.getBean("text");
		t.display();
		
	}

}
