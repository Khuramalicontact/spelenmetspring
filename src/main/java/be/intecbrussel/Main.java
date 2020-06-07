package be.intecbrussel;

import be.intecbrussel.configurations.JavaConfiguration;
import be.intecbrussel.model.Person;
import be.intecbrussel.service.PersonService;
import org.springframework.cglib.core.Local;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        try(ConfigurableApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(JavaConfiguration.class)){

            PersonService personService = (PersonService) applicationContext.getBean("mockService");
            System.out.println("Mockservice bean called");

            Person person = new Person(1);
            person.setFirstName("Ali");
            person.setLastName("Khalid");
            person.setDateOfBirth(LocalDate.of(1999,02,07));

            System.out.println(person);

            List<Person> newPersons = new ArrayList<>();
            Person person1 = new Person("Khawar", LocalDate.of(2000,9,9),2,"Khawar");
            Person person2 = new Person("Ahmed", LocalDate.of(2000,4,9),3,"Kasim");
            Person person3 = new Person("Ahmed", LocalDate.of(2000,5,9),4,"Jannet");
            newPersons.add(person1);
            newPersons.add(person2);
            newPersons.add(person3);

            personService.addPersonList(newPersons);

            personService.allPersons();

            System.out.println("Person with id 2: " + personService.getPerson(2));


        }
    }
}
