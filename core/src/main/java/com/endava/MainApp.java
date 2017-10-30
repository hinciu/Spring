package com.endava;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {
//        //XML configuration
        ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
//
//        TextEditor textEditor = context.getBean("textEditor", TextEditor.class);
//        textEditor.spellCheck();
//
//        //Inheritance
//        HelloOtherWorld helloOtherWorld = context.getBean("helloOtherWorld", HelloOtherWorld.class);
//        System.out.println(helloOtherWorld.getMessage1());
//        System.out.println(helloOtherWorld.getMessage2());
//        System.out.println(helloOtherWorld.getMessage3());
//
//        //List
//        JavaList javaList = (JavaList) context.getBean("list");
//        System.out.println(javaList.getList().get(0));
//
//        //Java configuration
//        ApplicationContext c = new AnnotationConfigApplicationContext(AppConfig.class);
//        TextEditor textEditor1 = c.getBean("textEditor", TextEditor.class);
//        textEditor1.spellCheck();

        //Annotation
        TextEditor textEditor3 = context.getBean("textEditor", TextEditor.class);
        textEditor3.spellCheck();
    }

}
