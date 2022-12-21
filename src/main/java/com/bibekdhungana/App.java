package com.bibekdhungana;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App
{
    public static void main( String[] args )
    {
       ApplicationContext context = new ClassPathXmlApplicationContext("config/bean.xml");
       Student student = context.getBean("student",Student.class);
       System.out.println(student);
       
       Student student1 = context.getBean("student1",Student.class);
       System.out.println(student1);
       
       Student student2= context.getBean("student2", Student.class);
       System.out.println(student2);
    }
    
}
