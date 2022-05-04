package multi_objects;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyApp {
    public static void main(String[] args) {

        ApplicationContext container = new AnnotationConfigApplicationContext(CarConfig.class);

        Car car1 = container.getBean(Car.class);
        System.out.println(car1.getMake());


    }
}
