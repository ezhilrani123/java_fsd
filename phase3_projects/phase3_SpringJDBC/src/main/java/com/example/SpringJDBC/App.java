package com.example.SpringJDBC;

import java.util.Scanner;

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
        ApplicationContext ac=new ClassPathXmlApplicationContext("spring.xml");
        Workers wo=ac.getBean(Workers.class);
        
        Dao d=ac.getBean(Dao.class);
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the id value");
        wo.setId(sc.nextInt());
        System.out.println("Enter the name ");
        
        wo.setName(sc.next());
        System.out.println("Enter the email ");
        wo.setEmail(sc.next());
        
        
        int row=d.insert(wo);
        if(row>0) {
        	System.out.println("Insertion Successful");
        }
        else {
        	System.out.println("failed");
        }
    }
}