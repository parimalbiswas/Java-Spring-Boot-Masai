package com.parimal.model;

import java.util.Objects;

public class Address
{

	private String state;
	private String city;
	private String pincode;

	public Address()
	{
		// TODO Auto-generated constructor stub
	}

	public Address(String state, String city, String pincode)
	{
		super();
		this.state = state;
		this.city = city;
		this.pincode = pincode;
	}

	@Override
	public int hashCode()
	{
		return Objects.hash(city, pincode, state);
	}

	@Override
	public boolean equals(Object obj)
	{
		if (this == obj) return true;
		if (obj == null) return false;
		if (getClass() != obj.getClass()) return false;
		Address other = (Address) obj;
		return Objects.equals(city, other.city) && Objects.equals(pincode, other.pincode)
				&& Objects.equals(state, other.state);
	}

	public String getState()
	{
		return state;
	}

	public void setState(String state)
	{
		this.state = state;
	}

	public String getCity()
	{
		return city;
	}

	public void setCity(String city)
	{
		this.city = city;
	}

	public String getPincode()
	{
		return pincode;
	}

	public void setPincode(String pincode)
	{
		this.pincode = pincode;
	}

}
