package CustomerCommonException;

public class CustomerDaoDataException extends Exception
{
	/*
	 * The default ID 
	 */
	private static final long serialVersionUID = 1L;
	
	/*
	 * The constructor of the Exception class.
	 */
	public CustomerDaoDataException(String message)
	{
		super(message);
	}
	
	/*
	 * The second constructor of the Exception class.
	 */
	public CustomerDaoDataException(String message, Throwable throwable)
	{
		super(message, throwable);
	}
}
