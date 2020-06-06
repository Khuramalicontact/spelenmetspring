package be.intecbrussel.service.implementations;

import be.intecbrussel.data.PersonDao;
import be.intecbrussel.model.Person;
import be.intecbrussel.service.PersonService;

import java.util.ArrayList;
import java.util.List;

public class PersonServiceImpl implements PersonService {
    PersonDao personDao;
    public List<Person> allPersons = new ArrayList<>();


    @Override
    public Person getPerson(int person) {
        return null;
    }

    @Override
    public void addPerson(Person person) {

    }

    @Override
    public void addPersonList(List<Person> personList) {

    }
}
