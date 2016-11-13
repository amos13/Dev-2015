package org.person.demo.common;

public class PersonSupportedException extends Exception{

	private static final long serialVersionUID = 1L;
	
	public PersonSupportedException() 
	{ }
	
	public PersonSupportedException(String message)
	{
		super(message);
	}
	
	public PersonSupportedException(String message, Throwable others)
	{
		super(message, others);
	}

}
