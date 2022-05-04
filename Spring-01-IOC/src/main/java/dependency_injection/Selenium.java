package dependency_injection;

import org.springframework.stereotype.Component;

@Component
public class Selenium {

    public void getTeachingHours(){
        System.out.println("Weekly teaching hours: " + 15);
    }
}
