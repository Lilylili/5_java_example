package com.jsoft.testspring.testjavaconfiguration;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(HelloWorldConfig.class);
        HelloWorld helloWorld = applicationContext.getBean(HelloWorld.class);
        helloWorld.setMessage("Hello World 1!");
        helloWorld.getMessage();
        HelloWorld helloWorld2 = applicationContext.getBean(HelloWorld.class);
        helloWorld2.getMessage();
    }
}
