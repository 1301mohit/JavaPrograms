package org.bridgelabz.objectorientedprogram;

public class Person {
	String firstname;
	String lastname;
	Address address;
	
	public Person()
	{
		
	}
	public Person(String firstname,String lastname,Address address)
	{
		this.firstname=firstname;
		this.lastname=lastname;
		this.address=address;
	}
	public void setfirstname(String firstname)
	{
		this.firstname=firstname;

	}
	public void setlastname(String lastname)
	{
		this.lastname=lastname;

	}
	public void setaddress(Address address)
	{
		this.address=address;

	}
	
	public String getfirstname()
	{
		return firstname;

	}
	public String getlastname()
	{
		return lastname;

	}
	public Address getaddress()
	{
		return address;

	}
}
