package com.assegd.MavenCoreJavaApp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

    	//BeanFactory; // is used when u r creating small app 
    	ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml"); // is used when u r creating enterprise level apps or big apps
    	
    	Car obj = (Car)context.getBean("car");
    	obj.drive();
    	
//    	
//    	Tyre t = (Tyre)context.getBean("tyre");
//    	System.out.println(t);
//    	

    }
}
