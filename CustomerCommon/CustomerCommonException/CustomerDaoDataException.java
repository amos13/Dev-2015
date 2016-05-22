package CustomerCommonException;

public class CustomerDaoDataException extends Exception
{
	private static final long serialVersionUID = 1L;

	public CustomerDaoDataException(){ }
	
	public CustomerDaoDataException(String message)
	{
		super(message);
	}
	
	public CustomerDaoDataException(String message, Throwable throwable)
	{
		super(message, throwable);
	}
}
