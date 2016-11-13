package org.person.demo.entity;

public class Person {
	
	private int PersonID;
	private Address address;
	private Gender SexPerson;
	private String PersonName;
	private Nationality nationality;
	private String PersonProfession;
	private String PersonEmailAddress;
	
	public Person(int newID, Address newAddress, Gender newGender, String newName, 
			Nationality newNationality, String newProfession, String newEmail)
	{
		this.PersonID = newID;
		this.address = newAddress;
		this.setGenderPerson(newGender);
		this.PersonName = newName;
		this.nationality = newNationality;
		this.PersonProfession = newProfession;
		this.PersonEmailAddress = newEmail;
	}
	
	public int getPersonID() {
		return PersonID;
	}
	
	public void setPersonID(int personID) {
		PersonID = personID;
	}
	
	public Address getAddress() {
		return address;
	}
	
	public void setAddress(Address address) {
		this.address = address;
	}
	
	public Gender getGenderPerson() {
		return SexPerson;
	}

	public void setGenderPerson(Gender sexPerson) {
		SexPerson = sexPerson;
	}
	
	public String getPersonName() {
		return PersonName;
	}
	
	public void setPersonName(String personName) {
		PersonName = personName;
	}
	
	public Nationality getNationality() {
		return nationality;
	}
	
	public void setNationality(Nationality nationality) {
		this.nationality = nationality;
	}
	
	public String getPersonProfession() {
		return PersonProfession;
	}
	
	public void setPersonProfession(String personProfession) {
		PersonProfession = personProfession;
	}
	
	public String getPersonEmailAddress() {
		return PersonEmailAddress;
	}
	
	public void setPersonEmailAddress(String personEmailAddress) {
		PersonEmailAddress = personEmailAddress;
	}

	@Override
	public int hashCode() 
	{
		final int prime = 31;
		int result = 1;
		result = prime * result + ((PersonEmailAddress == null) ? 0 : PersonEmailAddress.hashCode());
		result = prime * result + PersonID;
		result = prime * result + ((PersonName == null) ? 0 : PersonName.hashCode());
		result = prime * result + ((PersonProfession == null) ? 0 : PersonProfession.hashCode());
		result = prime * result + ((SexPerson == null) ? 0 : SexPerson.hashCode());
		result = prime * result + ((address == null) ? 0 : address.hashCode());
		result = prime * result + ((nationality == null) ? 0 : nationality.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) 
	{
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		Person other = (Person) obj;
		if (PersonEmailAddress == null) {
			if (other.PersonEmailAddress != null) {
				return false;
			}
		} else if (!PersonEmailAddress.equals(other.PersonEmailAddress)) {
			return false;
		}
		if (PersonID != other.PersonID) {
			return false;
		}
		if (PersonName == null) {
			if (other.PersonName != null) {
				return false;
			}
		} else if (!PersonName.equals(other.PersonName)) {
			return false;
		}
		if (PersonProfession == null) {
			if (other.PersonProfession != null) {
				return false;
			}
		} else if (!PersonProfession.equals(other.PersonProfession)) {
			return false;
		}
		if (SexPerson != other.SexPerson) {
			return false;
		}
		if (address == null) {
			if (other.address != null) {
				return false;
			}
		} else if (!address.equals(other.address)) {
			return false;
		}
		if (nationality == null) {
			if (other.nationality != null) {
				return false;
			}
		} else if (!nationality.equals(other.nationality)) {
			return false;
		}
		return true;
	}
	
	@Override
	public String toString() 
	{
		return "ID: " + PersonID + 
				"" + address +
				"\nGender: " + SexPerson +
				"\nName: " + PersonName + 
				""+ nationality + 
				"\nProfession: " + PersonProfession + 
				"\nEmail: " + PersonEmailAddress;
	}
	
}
