package org.example;

import org.example.config.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        Desktop dt = context.getBean("desktop", Desktop.class);
        dt.compile();


//        // create container，再透過xml create obj
//        // line15就已經create obj
//        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
//        // line18 using obj
//        Alien obj1 = context.getBean("alien1", Alien.class);
//        //obj1.setAge(21);
//        System.out.println(obj1.getAge());
//        obj1.code();

//        Computer com = context.getBean(Computer.class);
//        Desktop obj = context.getBean(Desktop.class);
    }
}
