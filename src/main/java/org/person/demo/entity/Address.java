package org.person.demo.entity;

public class Address 
{	
	private String Street;
	private String ZipCode;
	private String CityName;
	private String CountryName;
	
	public Address(String newStreet, String newZipCode, 
			String newCityName, String newCountryName)
	{
		this.Street = newStreet;
		this.ZipCode = newZipCode;
		this.CityName = newCityName;
		this.CountryName = newCountryName;
	}
	
	public String getStreet() {
		return Street;
	}
	
	public void setStreet(String street) {
		Street = street;
	}
	
	public String getZipCode() {
		return ZipCode;
	}
	
	public void setZipCode(String zipCode) {
		ZipCode = zipCode;
	}
	
	public String getCityName() {
		return CityName;
	}
	
	public void setCityName(String cityName) {
		CityName = cityName;
	}
	
	public String getCountryName() {
		return CountryName;
	}
	
	public void setCountryName(String countryName) {
		CountryName = countryName;
	}
	
	public String isLetterComingToAddress(boolean isValide) {
		return isValide ? "Yes" : "No";
	}

	@Override
	public int hashCode() 
	{
		final int prime = 31;
		int result = 1;
		result = prime * result + ((CityName == null) ? 0 : CityName.hashCode());
		result = prime * result + ((CountryName == null) ? 0 : CountryName.hashCode());
		result = prime * result + ((Street == null) ? 0 : Street.hashCode());
		result = prime * result + ((ZipCode == null) ? 0 : ZipCode.hashCode());
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
		Address other = (Address) obj;
		if (CityName == null) {
			if (other.CityName != null) {
				return false;
			}
		} else if (!CityName.equals(other.CityName)) {
			return false;
		}
		if (CountryName == null) {
			if (other.CountryName != null) {
				return false;
			}
		} else if (!CountryName.equals(other.CountryName)) {
			return false;
		}
		if (Street == null) {
			if (other.Street != null) {
				return false;
			}
		} else if (!Street.equals(other.Street)) {
			return false;
		}
		if (ZipCode == null) {
			if (other.ZipCode != null) {
				return false;
			}
		} else if (!ZipCode.equals(other.ZipCode)) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() 
	{
		return "\nStreet: " + Street + 
				"\nZip Code: " + ZipCode + 
				"\nCity: " + CityName + 
				"\nCountry: "+ CountryName + "";
	}
	
}
