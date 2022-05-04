package multi_objects;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class CarConfig {

    @Primary
    @Bean(name = "c1")
    Car car1() {
        Car c = new Car();
        c.setMake("Audi");
        return c;
    }

    @Bean(name = "c2")
    Car car2() {
        Car c = new Car();
        c.setMake("Tesla");
        return c;
    }
}
