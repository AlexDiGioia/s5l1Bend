package alex.s5l1Bend;

import alex.s5l1Bend.entities.Menu;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class S5l1BendApplication {

    public static void main(String[] args) {
        SpringApplication.run(S5l1BendApplication.class, args);
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(S5l1BendApplication.class);
        Menu menu = context.getBean(Menu.class);
        System.out.println(menu);
    }

}
