package com.cg.idx.ui;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cg.idx.service.GreetServiceImpl;
import com.cg.idx.service.IGreetService;

public class App1 {

	public static void main(String[] args) {
		GreetServiceImpl gs1 = new GreetServiceImpl();
		System.out.println(gs1.getGreeting("Bhargava"));
		
		//program to interface method
		IGreetService gs2 = new GreetServiceImpl();
		System.out.println(gs2.getGreeting("Sai"));
		
		// Spring Container - IoC - Spring way
		//ClassPath means src/main
		ApplicationContext context = new ClassPathXmlApplicationContext("beans1.xml");
		IGreetService gs3 = (GreetServiceImpl)context.getBean("gsBean");
		System.out.println(gs3.getGreeting("Bhargava"));
		
		System.out.println("-------------------------------");
//		GreetServiceArgumentedImpl gs4 = new GreetServiceArgumentedImpl();
//		gs4.setGreetNote("Namasthe");
//		System.out.println(gs4.getGreeting("Bhargava"));
		
		IGreetService gs4 = (IGreetService)context.getBean("gsaBean");
		System.out.println(gs4.getGreeting("Bhargava"));
		
		System.out.println("-------------------------------");
		
		IGreetService gsadv = (IGreetService)context.getBean("gsadvBean");
		System.out.println(gsadv.getGreeting("Bhargava"));
		
		System.out.println("-------------------------------");
		
		
		
		((AbstractApplicationContext) context).close();
		
	}

}
