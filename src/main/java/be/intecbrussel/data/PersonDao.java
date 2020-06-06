package be.intecbrussel.data;

import be.intecbrussel.model.Person;

public interface PersonDao {

    boolean createPerson(Person person);
    Person readPerson(int read);
    boolean updatePerson(Person person);
    boolean deletePerson(Person person);
}
