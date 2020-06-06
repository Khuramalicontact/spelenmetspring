package be.intecbrussel.data.implementations;

import be.intecbrussel.data.PersonDao;
import be.intecbrussel.model.Person;
import be.intecbrussel.service.PersonService;
import be.intecbrussel.service.implementations.PersonServiceImpl;

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
    public Person readPerson(int id) {
        for (int i = 0; i < persondb.size(); i++) {
            if (persondb.get(i).getId() == id) {
                return persondb.get(i);
            }
        }
            return persondb.get(id);
        }

    @Override
    public boolean updatePerson(Person person) {
        for(int i = 0; i < persondb.size(); i++){
            if(persondb.get(i).getId() == person.getId()){
                persondb.set(i,person);
            }
        }
        return true;
    }

    @Override
    public boolean deletePerson(Person person) {
        for(int i = 0; i < persondb.size(); i++){
            if(persondb.get(i).getId() == person.getId()){
                persondb.remove(person);
            }
        }
        return true;
    }
}
