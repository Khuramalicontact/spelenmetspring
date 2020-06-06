package be.intecbrussel.configurations;

import be.intecbrussel.data.PersonDao;
import be.intecbrussel.data.implementations.PersonDaoImpl;
import be.intecbrussel.model.Person;
import be.intecbrussel.service.PersonService;
import be.intecbrussel.service.implementations.PersonServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"be.intecbrussel"})
public class JavaConfiguration {

    @Bean
    public PersonDaoImpl mockDao(){
        return new PersonDaoImpl();
    }

    @Bean
    public PersonServiceImpl mockService(PersonDaoImpl mockDao){
        return new PersonServiceImpl();
    }
}
