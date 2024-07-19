package br.com.douglas.services;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.stereotype.Service;

import java.util.logging.Logger;
import br.com.douglas.model.Person;

@Service
public class PersonServices {
	private final AtomicLong counter = new AtomicLong();

	// o q é logger?
	// cria logs para vermos o fluxo do sistema no console.
	private Logger logger = Logger.getLogger(PersonServices.class.getName());

	public List<Person> findAll() {
		logger.info("A lista foi impressa");
		List<Person> persons = new ArrayList<>();
		for (int i = 0; i < 8; i++) {
			Person person = mockPerson(i);
			persons.add(person);
		}

		return persons;
	}

	public Person findById(String ID) {
		logger.info("O id foi impresso");
		Person person = new Person();
		person.setId(counter.incrementAndGet());
		person.setFirstName("Douglas");
		person.setLastName("Bertoldi");
		person.setGender("Masculino");
		person.setAdress("Rua Gagbro");
		return person;
	}

	private Person mockPerson(int i) {
		Person person = new Person();
		person.setId(counter.incrementAndGet());
		person.setFirstName("Person name " + i);
		person.setLastName("Last name " + i);
		person.setGender("Masculino");
		person.setAdress("Residencia n° " + i);
		return person;
	}

	public Person create(Person person) {
		logger.info("Create foi impresso!");
		return person;
	}

	public Person update(Person person) {
		logger.info("Update foi impresso!");
		return person;
	}

	public void delete(String id) {
		logger.info("Deleting impresso!");
	}

}
