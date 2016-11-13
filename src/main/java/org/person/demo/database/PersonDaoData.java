package org.person.demo.database;

import java.util.List;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;

import org.person.demo.entity.Gender;
import org.person.demo.entity.Person;
import org.person.demo.entity.Address;
import org.person.demo.entity.Nationality;

public class PersonDaoData {

	public Collection<? extends Person> getPersonAddressNationalities() 
	{
		List<Person> allPersons = new ArrayList<Person>();
		
		allPersons.add(new Person(1, new Address("Björksundsslingan 39", "124 31", "Bandhagen", "Sweden"), 
				Gender.Female, "Elina Laitinen", new Nationality("Stockholm", "1976-09-25", "Helsinki", true),
				"Norse", "elnia.laitinen@gmail.com"));
		
		allPersons.add(new Person(2, new Address("Trollesundsvägen 95", "131 24", "Bandhagen", "Sweden"), 
				Gender.Male, "Amos Camara", new Nationality("Stockholm", "2006-10-15", "Stockholm", false),
				"Student", "amos.camara@gmail.com"));
		
		List<Person> resultPersons = new LinkedList<Person>();
		
		allPersons.stream().forEach((person) -> 
		{
			resultPersons.add(person);
		});
		
		return resultPersons;
	}

}
