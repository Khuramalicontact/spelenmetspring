package be.intecbrussel.service.implementations;

import be.intecbrussel.data.PersonDao;
import be.intecbrussel.data.implementations.PersonDaoImpl;
import be.intecbrussel.model.Person;
import be.intecbrussel.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

public class PersonServiceImpl implements PersonService {
    @Autowired
    private PersonDaoImpl personDao;

    @Override
    public Person getPerson(int id) {
        return personDao.readPerson(id);
    }

    @Override
    public void addPerson(Person person) {
        if(personDao.createPerson(person)){
            System.out.println("Person created:" + person);
        }
        else{
            System.out.println("Creating person failed.");
        }
    }

    @Override
    public void addPersonList(List<Person> personList) {
        for(Person p: personList){
            if(personDao.createPerson(p)){
                System.out.println("Person created in list:" + p);
            }else{
                System.out.println("Failed to make this person:" + p);
            }
        }
    }

    @Override
    public List<Person> allPersons() {
        return personDao.getAllPersons();
    }
}
