package org.bridgelabz.objectorientedprogram;

/**
 * Purpose: Pojo class of Address
 * 
 * @author  Mohit Kumar
 * @version 1.0
 * @since   16/01/2019
 */
public class Address {
	 String city;
	 String zip;
	 String state;
	 String phone;
	
	public Address()
	{
		
	}
	public Address(String city,String zip,String state,String phone)
	{
		this.city=city;
		this.zip=zip;
		this.phone=phone;
		this.state=state;
	}
	
	public void setcity(String city)
	{
		this.city=city;

	}
	public void setzip(String zip)
	{
		this.zip=zip;

	}
	public void setphone(String phone)
	{
		this.phone=phone;

	}
	
	public void setstate(String state)
	{
		this.state=state;

	}
	
	public String getstate()
	{
		return state;

	}
	
	public String  getcity()
	{
		return city;

	}
	public String getzip()
	{
		return zip;

	}
	public String getphone()
	{
		return phone;
		
	}
}
