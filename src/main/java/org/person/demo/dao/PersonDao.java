package org.person.demo.dao;

import java.util.List;

import org.person.demo.entity.Person;

public interface PersonDao 
{
	public List<Person> CreatePersonList();
	public Person getPersonName(int PersonID);
	public void addPerson(Person addPerson);
	public void deletePerson(Person deletePerson);
	public void updatePerson(Person updatePerson);
	public String displayPersonInfo(String detailPerson);
}
