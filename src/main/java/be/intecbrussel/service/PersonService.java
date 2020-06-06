package be.intecbrussel.service;

import be.intecbrussel.model.Person;

import java.util.ArrayList;
import java.util.List;

public interface PersonService {

    Person getPerson(int person);
    void addPerson(Person person);
    void addPersonList(List<Person> personList);

    List <Person> allPersons = new ArrayList<>();
}
