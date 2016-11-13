package org.person.demo.entity;

public class Nationality 
{
	private String Cityzen;
	private String BirthDay;
	private String PlaceName;
	private boolean isOriginalCitizen;
	
	public Nationality(String newCityzen, String newBirthday, 
			String newPlace, boolean newIsOrginal)
	{
		this.Cityzen = newCityzen;
		this.BirthDay = newBirthday;
		this.PlaceName = newPlace;
		this.isOriginalCitizen = newIsOrginal;
	}
	
	public String getCityzen() {
		return Cityzen;
	}
	
	public void setCityzen(String cityzen) {
		Cityzen = cityzen;
	}
	
	public String getBirthDay() {
		return BirthDay;
	}
	
	public void setBirthDay(String birthDay) {
		BirthDay = birthDay;
	}
	
	public String getPlceName() {
		return PlaceName;
	}
	
	public void setCountryName(String placeName) {
		PlaceName = placeName;
	}
	
	public boolean isOriginalCitizen() {
		return isOriginalCitizen;
	}
	
	public void setOriginalCitizen(boolean isOriginalCitizen) {
		this.isOriginalCitizen = isOriginalCitizen;
	}
	
	public String getIsOrginalValue(boolean isTrue)
	{
		return isTrue ? "Yes" : "No";
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((BirthDay == null) ? 0 : BirthDay.hashCode());
		result = prime * result + ((Cityzen == null) ? 0 : Cityzen.hashCode());
		result = prime * result + ((PlaceName == null) ? 0 : PlaceName.hashCode());
		result = prime * result + (isOriginalCitizen ? 1231 : 1237);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		Nationality other = (Nationality) obj;
		if (BirthDay == null) {
			if (other.BirthDay != null) {
				return false;
			}
		} else if (!BirthDay.equals(other.BirthDay)) {
			return false;
		}
		if (Cityzen == null) {
			if (other.Cityzen != null) {
				return false;
			}
		} else if (!Cityzen.equals(other.Cityzen)) {
			return false;
		}
		if (PlaceName == null) {
			if (other.PlaceName != null) {
				return false;
			}
		} else if (!PlaceName.equals(other.PlaceName)) {
			return false;
		}
		if (isOriginalCitizen != other.isOriginalCitizen) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() 
	{
		return "\nCityzen: " + Cityzen + 
				"\nBirthday: " + BirthDay + 
				"\nPlace: " + PlaceName +
				"\nAre original: " + getIsOrginalValue(isOriginalCitizen) + "";
	}

}
