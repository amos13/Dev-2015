package org.person.demo.transformer;

import java.util.LinkedList;
import org.person.demo.entity.Person;
import org.person.demo.dao.PersonDao;
import org.person.demo.dao.PersonDaoImpl;
import org.person.demo.common.PersonSupportedException;

public class EntityPersonToTransformer {

	private Person person = null;
	private PersonDao personDao = null;
	private LinkedList<PersonDao> personDaoList;
	
	public EntityPersonToTransformer()
	{
		this.personDao = new PersonDaoImpl();	
		this.personDaoList = new LinkedList<PersonDao>();
	}
	
	public PersonDao getTransformer(int transformPersonID) throws Exception
	{
		if (transformPersonID == 0) 
		{
			throw new PersonSupportedException("Person ID should be greatest than zero");
		}	
		
		return (PersonDao)this.personDao.getPersonName(transformPersonID);
	}
	
	public void addTransformer(PersonDaoImpl transformAddedPerson) throws Exception
	{
		if (transformAddedPerson == null)
		{
			throw new PersonSupportedException("Person should not be added");
		}				
		for (Person perso : transformAddedPerson.CreatePersonList()) 
		{
			this.person = new Person(perso.getPersonID(),  perso.getAddress(), 
					perso.getGenderPerson(), perso.getPersonName(), 
					perso.getNationality(), perso.getPersonProfession(), 
					perso.getPersonEmailAddress());			
			this.personDao.addPerson(this.person);
		}
	}
	
	public void updateTransformer(PersonDaoImpl transformUpdatedPerson) throws Exception
	{		
		if (transformUpdatedPerson != null)
		{
			for (Person perso : transformUpdatedPerson.CreatePersonList()) 
			{
				this.person = new Person(perso.getPersonID(),  perso.getAddress(), 
						perso.getGenderPerson(), perso.getPersonName(), 
						perso.getNationality(), perso.getPersonProfession(), 
						perso.getPersonEmailAddress());			
				this.personDao.addPerson(this.person);
				this.personDao.getPersonName(this.person.getPersonID());
				this.personDao.updatePerson(this.person);
			}
		}		
		else
		{
			throw new PersonSupportedException("Person should not be updated");
		}
	}
	
	@SuppressWarnings("unused")
	public void deleteTransformer(PersonDaoImpl transformDeletedPerson) throws Exception
	{	
		transformDeletedPerson.CreatePersonList().stream().forEach((perso) -> 
		{
			this.person = new Person(perso.getPersonID(),  perso.getAddress(), 
					perso.getGenderPerson(), perso.getPersonName(), 
					perso.getNationality(), perso.getPersonProfession(), 
					perso.getPersonEmailAddress());			
			this.personDao.addPerson(this.person);
			this.personDao.getPersonName(this.person.getPersonID());
			this.personDao.deletePerson(this.person);			
		});
	
		if (transformDeletedPerson == null)
		{
			throw new PersonSupportedException("Person should not be deleted");
		}		
	}

	public LinkedList<PersonDao> CreatePersonTransformer() throws Exception
	{		
		this.personDao.CreatePersonList().forEach((person) ->
		{
			this.personDaoList.add((PersonDao)person);
		});	
		
		return this.personDaoList;
	}
	
	public void displayTransformPerson(String transformDetailedPerson) throws Exception
	{
		if (transformDetailedPerson != null) 
		{
			this.personDao.displayPersonInfo(transformDetailedPerson);
		}
		else
		{
			try 
			{
				throw new PersonSupportedException("Details of Person should not be null");
			} 
			catch (PersonSupportedException exp)
			{
				exp.printStackTrace();
				System.out.println("\nMessage error: "+ exp.getMessage());
			}
		}
	}
	
}
