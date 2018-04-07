package me.chrispeng.didemo;

import me.chrispeng.didemo.controller.ConstructorInjectedController;
import me.chrispeng.didemo.controller.MyController;
import me.chrispeng.didemo.controller.PropertyInjectedController;
import me.chrispeng.didemo.controller.SetterPropertyController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DiDemoApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(DiDemoApplication.class, args);

        MyController controller = (MyController) context.getBean("myController");

        controller.hello();

        System.out.println(context.getBean(PropertyInjectedController.class).sayHello());
        System.out.println(context.getBean(SetterPropertyController.class).sayHello());
        System.out.println(context.getBean(ConstructorInjectedController.class).sayHello());
    }
}
