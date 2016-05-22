package CustomerDaoImpl;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.*;

import CustomerCommonException.CustomerDaoDataException;
import CustomerDao.CustomerDaoService;

public class CustomerDaoImpl implements CustomerDaoService {

	private String tagNameElement;
	
	public CustomerDaoImpl(String newTagNameElement) 
	{	
		this.tagNameElement = newTagNameElement;
	}
	
	@Override
	public void readDataFromXmlFile(String customerDaoXmlData) throws CustomerDaoDataException
	{
		try 
		{
			File inputPath = new File(customerDaoXmlData);
			DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder dbBuilder = dbFactory.newDocumentBuilder();
			Document document = dbBuilder.parse(inputPath);
			document.getDocumentElement().normalize();
	
			dispalyReadDataFrom("\nRoot Element: "+document.getDocumentElement()
			.getNodeName().toUpperCase());
			NodeList nNodeList = document.getElementsByTagName(this.tagNameElement);
			dispalyReadDataFrom("-----------------------------------------------");
			
			for (int temp = 0; temp < nNodeList.getLength(); temp++) 
			{
				Node nNode = nNodeList.item(temp);
				dispalyReadDataFrom("\nCurrent Element: "+nNode.getNodeName().toUpperCase());
				
				if (nNode.getNodeType() == Node.ELEMENT_NODE) 
				{
					Element eElement = (Element) nNode;
					dispalyReadDataFrom("Customer nr: "+eElement.getAttribute("nr"));				
					dispalyReadDataFrom("First Name: "+eElement.getElementsByTagName("firstname")
					.item(0).getTextContent());				
					dispalyReadDataFrom("Last Name: "+eElement.getElementsByTagName("lastname")
					.item(0).getTextContent());					
					dispalyReadDataFrom("Nick Name: "+eElement.getElementsByTagName("nickname")
					.item(0).getTextContent());
					dispalyReadDataFrom("Age: "+eElement.getElementsByTagName("age")
					.item(0).getTextContent() + " year(s)\n");
				}
			}
			dispalyReadDataFrom("=================================================");
		} 
		catch (Exception except) 
		{
			throw new CustomerDaoDataException("\nError Message: "+except.getMessage());
		}
		
	}

	@Override
	public void dispalyReadDataFrom(String customerDisplayDaoXmlData) 
	{
		getDispalyReadDataFromXml(customerDisplayDaoXmlData);
	}

	@Override
	public void getDispalyReadDataFromXml(String customerDisplayDaoXml) {
		System.out.println(customerDisplayDaoXml);
		
	}

}
