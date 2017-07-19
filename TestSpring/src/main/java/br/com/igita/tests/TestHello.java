package br.com.igita.tests;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import br.com.igita.beans.HelloSpringIntf;

public class TestHello {
	
	public static void main(String[] args) {
		(new TestHello()).execute();
	}
	
	@SuppressWarnings("resource")
	public void execute() {
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("bean_hello.xml");
		
		HelloSpringIntf hello = (HelloSpringIntf)ctx.getBean("hello");
		
		hello.hello();
		
	}

}
