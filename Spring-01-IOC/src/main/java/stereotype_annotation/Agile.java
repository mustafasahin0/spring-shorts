package stereotype_annotation;

import org.springframework.stereotype.Component;

@Component
public class Agile {

    public void getTeachingHours(){
        System.out.println("Weekly teaching hours : " + 10);
    }
}
