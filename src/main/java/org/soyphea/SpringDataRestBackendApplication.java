package org.soyphea;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.soyphea.domain.Task;
import org.soyphea.repo.TaskRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@Slf4j
public class SpringDataRestBackendApplication {

  public static void main(String[] args) {
    SpringApplication.run(SpringDataRestBackendApplication.class, args);
  }

  private List<Task> tasks = Arrays.asList(
      new Task("Study Spring Boot","Learning Spring Boot with Java",
          LocalDate.of(2020,07,30),false),
      new Task("Completed a book clean architecture","Learning architect boook",LocalDate.of(2020,10,30),false));

  @Bean
  CommandLineRunner commandLineRunner(TaskRepository taskRepository) {
    return args -> {
      taskRepository.saveAll(tasks);
      log.info("Save completed");
    };
  }

}
