package me.chrispeng.didemo;

import me.chrispeng.didemo.controller.ConstructorInjectedController;
import me.chrispeng.didemo.controller.MyController;
import me.chrispeng.didemo.controller.PropertyInjectedController;
import me.chrispeng.didemo.controller.SetterPropertyController;
import me.chrispeng.didemo.examplebean.FakeDataSource;
import me.chrispeng.didemo.examplebean.FakeJmsBroker;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DiDemoApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(DiDemoApplication.class, args);

        MyController controller = (MyController) context.getBean("myController");

	    FakeDataSource fakeDataSource = (FakeDataSource) context.getBean(FakeDataSource.class);
	    System.out.println(fakeDataSource.getUser());

	    FakeJmsBroker fakeJmsBroker = (FakeJmsBroker) context.getBean(FakeJmsBroker.class);
	    System.out.println(fakeJmsBroker.getUsername());
    }
}
