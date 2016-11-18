package org.person.demo.executor;

import org.person.demo.entity.Gender;
import org.person.demo.entity.Person;
import org.person.demo.entity.Address;
import org.person.demo.dao.PersonDaoImpl;
import org.person.demo.entity.Nationality;

public class PersonExecutor 
{
	public static void main(String[] args) 
	{
		PersonDaoImpl allPersons = new PersonDaoImpl();
		
		displayDetails("\n-----List of Persons-----");
		
		allPersons.CreatePersonList().stream().forEach((person) ->
		{
			displayDetails("\n"+person.toString());
		});
		
		Person updatePerson = allPersons.CreatePersonList().get(0);
		
		updatePerson.setPersonName("Elinas Hakkinen");
		updatePerson.setPersonEmailAddress("hakkinen.elinas@hotmail.com");
		allPersons.updatePerson(updatePerson);
		allPersons.getPersonName(0);
		
		displayDetails("\n-----Updated Persons-----");
		displayDetails("\n"+updatePerson.toString());
		displayDetails("\n-------------------------");
		
		Person deletedPerson = allPersons.CreatePersonList().get(0);
		
		deletedPerson.setPersonName("Elinas Hakkinen");
		deletedPerson.setPersonEmailAddress("hakkinen.elinas@hotmail.com");
		allPersons.deletePerson(deletedPerson);
		allPersons.getPersonName(0);
		
		displayDetails("\n-----Deleted Persons-----");
		displayDetails("\n"+deletedPerson.toString());
		displayDetails("\n-------------------------");

		Nationality nationality = new Nationality("French", "1979-10-10", "Paris", false);
		Address address = new Address("52 Rue de Marche", "75005", "Paris", "France");
		
		Person addedPerson = allPersons.CreatePersonList().getLast();
		
		addedPerson.setPersonID(3);
		addedPerson.setAddress(address);
		addedPerson.setGenderPerson(Gender.Female);
		addedPerson.setPersonName("Aicha Seck");
		addedPerson.setNationality(nationality);
		addedPerson.setPersonProfession("Teacher");
		addedPerson.setPersonEmailAddress("seck.aicha@gmail.com");
		
		allPersons.addPerson(addedPerson);
		allPersons.getPersonName(1);
		
		displayDetails("\n-----Added Persons-----");
		displayDetails("\n"+addedPerson.toString());
		displayDetails("\n-------------------------");	
	}
	
	private static void displayDetails(String details)
	{
		System.out.println(details);
	}
	
}
