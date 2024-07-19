package br.com.douglas.controllers;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.douglas.model.Person;
import br.com.douglas.services.PersonServices;


@RestController
@RequestMapping("/person")
public class PersonController {
	
	@Autowired
	private PersonServices services;
	
	//Responsável pelo findAll
	@RequestMapping(
			method = RequestMethod.GET,
			produces = MediaType.APPLICATION_JSON_VALUE
			)	
	public List<Person> findAll() {
		return services.findAll();
		
	}
	
	//Responsável pelo findById
	@RequestMapping(
			value = "/{id}",
			method = RequestMethod.GET,
			produces = MediaType.APPLICATION_JSON_VALUE
			)	
	public Person findById( @PathVariable(value = "id") String id) {
		return services.findById(id);
		
	}
	
	//Responsável pelo Post
		@RequestMapping(
				consumes = MediaType.APPLICATION_JSON_VALUE,
				method = RequestMethod.POST,
				produces = MediaType.APPLICATION_JSON_VALUE
				)	
		public Person create( @RequestBody Person person) {
			return services.create(person);
			
		}
		
		//Responsável pelo update
				@RequestMapping(
						consumes = MediaType.APPLICATION_JSON_VALUE,
						method = RequestMethod.PUT,
						produces = MediaType.APPLICATION_JSON_VALUE
						)	
				public Person update( @RequestBody Person person) {
					return services.update(person);
					
				}

}