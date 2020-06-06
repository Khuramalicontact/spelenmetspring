package be.intecbrussel.data.implementations;

import be.intecbrussel.data.PersonDao;
import be.intecbrussel.model.Person;

import java.util.ArrayList;
import java.util.List;

public class PersonDaoImpl implements PersonDao {

    private List<Person> persondb = new ArrayList<Person>();


    @Override
    public boolean createPerson(Person person) {
        persondb.add(person);
        return true;
    }

    @Override
    public Person readPerson(int read) {
        return null;
    }

    @Override
    public boolean updatePerson(Person person) {
        return false;
    }

    @Override
    public boolean deletePerson(Person person) {
        return false;
    }
}
