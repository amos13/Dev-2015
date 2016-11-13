package org.person.demo.dao;

import java.util.List;
import java.util.LinkedList;
import org.person.demo.entity.Person;
import org.person.demo.database.PersonDaoData;

public class PersonDaoImpl implements PersonDao
{
	private List<Person> persons;
	private PersonDaoData personData;
	private PersonDaoImpl personDaoImpl;
	
	public PersonDaoImpl()
	{		
		this.personData = new PersonDaoData();
		this.persons = new LinkedList<Person>();	
		this.persons.addAll(personData.getPersonAddressNationalities());
	}
	
	public LinkedList<Person> CreatePersonList() 
	{
		final LinkedList<Person> allPersons = new LinkedList<Person>();
		
		this.persons.stream().forEach((person) -> {
			allPersons.add(person);
		});		
		return allPersons;
	}

	public Person getPersonName(int PersonID) 
	{	
		return this.persons.get(PersonID);		
	}

	public void addPerson(Person addPerson) 
	{
		this.persons.add(addPerson);
		displayPersonInfo(addPerson.getPersonID()+ " is added to database.");		
	}

	public void deletePerson(Person deletePerson) 
	{
		this.persons.remove(deletePerson);
		displayPersonInfo(deletePerson.getPersonID()+ " is deleted from database.");	
	}

	public void updatePerson(Person updatePerson) 
	{
		this.persons.get(updatePerson.getPersonID()).setPersonName(updatePerson.getPersonName());
		displayPersonInfo(updatePerson.getPersonID()+ " is updated in the database.");		
	}

	public String displayPersonInfo(String detailPerson) 
	{
		return String.format("\nPerson ID: "+ detailPerson);	
	}
	
	public void setPersonDaoImpl(PersonDaoImpl newPersonDaoImpl)
	{
		if (newPersonDaoImpl != null) 
		{
			this.personDaoImpl = newPersonDaoImpl;
		}
	}
	
	public PersonDaoImpl getPersonDaoImpl()
	{
		return this.personDaoImpl;
	}

}
