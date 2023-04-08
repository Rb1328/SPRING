package com.ExOrm;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.DaoEntities.Student;
import com.StudenntDao.StudentDao;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        ApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
        StudentDao studentDao=context.getBean("studentDao",StudentDao.class);
        Student student=new Student(1,"pratee","pune");
        int r=studentDao.insert(student);
        System.out.println("done"+r);
        
        
        
        
    }
}
