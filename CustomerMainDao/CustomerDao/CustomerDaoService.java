package CustomerDao;

import CustomerCommonException.CustomerDaoDataException;

public interface CustomerDaoService 
{
	public void dispalyReadDataFrom(String customerDisplayDaoXmlData);
	public void getDispalyReadDataFromXml(String customerDisplayDaoXml);
	public void readDataFromXmlFile(String customerDaoXmlData) throws CustomerDaoDataException;
}
