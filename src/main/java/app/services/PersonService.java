package app.services;

import app.dtos.PersonDTO;
import app.entities.Person;

import java.time.LocalDate;

public class PersonService {
    public PersonDTO showPerson(){
        Person person = new Person("Peter", "Marcher", LocalDate.of(2002,3,1),101102111);
        return new PersonDTO(person.getFirstName(), person.getLastName());
    }
}
