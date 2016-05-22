package CustomerDaoRunner;

import CustomerCommonException.*;
import CustomerDaoImpl.CustomerDaoImpl;

public class CustomerDaoPattern {

	private static final String TXT_TAGNAME_ELEMENT = "customer";
	
	public static void main(String[] args) throws CustomerDaoDataException
	{
		CustomerDaoImpl customerDao = new CustomerDaoImpl(TXT_TAGNAME_ELEMENT);
		customerDao.readDataFromXmlFile("CustomerDaoResource/CustomerDaoResource/CustomerDataDao.xml");
	}
}
