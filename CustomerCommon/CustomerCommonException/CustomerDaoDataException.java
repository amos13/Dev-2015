package CustomerCommonException;

public class CustomerDaoDataException extends Exception
{
	private static final long serialVersionUID = 1L;
	
	/*
	 * The constructor of the Exception class.
	 */
	public CustomerDaoDataException(String message)
	{
		super(message);
	}
	
	public CustomerDaoDataException(String message, Throwable throwable)
	{
		super(message, throwable);
	}
}
