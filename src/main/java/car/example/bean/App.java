package car.example.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

    public static void main(String[] args) {

//        Creating the Spring Container
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationBeanContext.xml");

//        Getting the Bean from Spring Container
        MyBean myBean = (MyBean) context.getBean("myBean");

        System.out.println(myBean);
    }
}
