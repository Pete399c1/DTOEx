package app.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDate;


@Getter
@AllArgsConstructor
public class Person {
    private String firstName;
    private String lastName;
    private LocalDate birthDay;
    private Integer socialSecurityNumber;



}
