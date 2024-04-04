package bg.tuvarna.oop.dicestatistics;

import javafx.application.Application;
import javafx.stage.Stage;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages = "bg.tuvarna.oop")
@EntityScan(basePackages = "bg.tuvarna.oop.persistence.entities")
@EnableJpaRepositories(basePackages = "bg.tuvarna.oop.persistence.repositories")
public class DiceStatisticsApplication {

    public static void main(String[] args) {
        // This is how normal Spring Boot app would be launched
        // SpringApplication.run(SpringBootExampleApplication.class, args);

        // JavaFxApplication doesn't exist yet,
        // we'll create it in the next step
        Application.launch(JavaFxApplication.class, args);
    }
}