package org.soyphea.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import java.time.LocalDate;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
public class Task {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long id;
  private String name;
  private String description;
  private LocalDate dueDate;
  private boolean done;

  public Task(String name, String description, LocalDate dueDate, boolean done) {
    this.name = name;
    this.description = description;
    this.dueDate = dueDate;
    this.done = done;
  }

}
